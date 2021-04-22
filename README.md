#### ACTIVIDAD DE APRENDIZAJE (2ª Evaluacion)  INTEGRACIÓN CONTINUA - JOSÉ RAMÓN GIMENO AGUIRREGOMOZCORTA

### ¿QUÉ ES RETROSHOP?

**Retroshop** es un proyecto de tienda on-line destinada a la venta de productos retro como consolas, videojuegos y merchandising.
Este proyecto se enfoca en el registro de estos tres tipos de productos y poder visualizarlos posteriormente. 

A continuación se muestra como se ha realizado la construcción de dicho proyecto siguiendo los apartados de la actividad:

`PASO INICIAL`

_Para la realización de este proyecto, se ha trabajado con la metodologia de trabajo de git, mediante la creacion de ramas, asi como aprender a trabajar en ellas y fusionarlas posteriormente con la rama principal._

    Primero de todo, se ha creado una clase "Application", 
    en la cual se va a ejecutar el programa, 
    la cual es la única que se encuentra creada en la rama master. 

    A partir de aquí se creó una rama llamada "develop", donde va a estar almacenado todo el proyecto 
    y en la cual se van a fusionar diferentes ramas que van a formar parte de este.

    En esta rama, se creó una clase para gestionar un menu ("GestionMenu"), en la que se registraron 
    y visualizaron los productos.
    (Dentro de develop se creó principalmente el esqueleto del menú).

`CREACION DE LA RAMA FEATURE/CREARCLASES y PULL REQUEST`

    Tras crear y preparar la rama develop, se creó una rama feature en la que se crearon tres clases, 
    con las cuales se trabajó durante toda la actividad de aprendizaje. 

    Estas clases son: Consola, Juego y Merchandising. 
    Cada una con sus correspondientes atributos y metodos getter, setter y equals.

    Una vez creadas las clases se realiza un pull request en GitHub, 
    cuya función permitió fusionar esta rama feature con la rama develop. 
    
    También podemos realizar un pull en nuestro area de trabajo remoto para tener los últimos cambios realizados

`CREACIÓN DE LA RAMA FEATURE/REGISTRAROBJETOS`

    Se procedió a crear otra rama feature llamada registrar objetos, en la cual se empezó a completar 
    el menú de la clase GestionMenu
    Se añadieron opciones, con sus respectivas funciones como:

        · ¿Que tipo de producto desea registrar? (Consolas, Juegos, Merchandising)
        · Introduce el titulo del producto, precio, etc... (por ejemplo: titulo = "Super Mario", precio = 59.99f).
        · Se crearon métodos como "registrarConsolas()" permitiendo la inserción de datos por teclado dentro de dicho método.

    Los datos de registro introducidos se guardarón en un ArrayList, cuya función permitirá consultar 
    las listas registradas posteriormente.

    Al igual que en la rama de crear clases, posteriormente se realizó un Pull Request con la rama develop.

`CREACION DE LA RAMA FEATURE/VISUALIZAROBJETOS`

    Posteriormente se creó otra rama feature para crear el menu de visualizar objetos y sus funcionalidades:

        ·¿Que tipo de producto desea visualizar? (opcion a elegir: Consolas, Juegos, Merchandising)
        ·Tras elegir la opcion se muestra el listado de los productos registrados anteriormente mediante un bucle for each.
        ·Se crearon métodos como "visualizarConsolas()" para poder listar los datos que se registren
    
    Una vez terminada esta rama se vuelve a fusionar con la rama develop mediante un pull request.

`PROYECTO FUSIONADO Y LISTO PARA EJECUTAR`

    A partir de aquí ya están todas las ramas creadas y fusionadas con la rama principal, en este caso la rama develop. 
    Dentro de la rama develop ya se podría ejecutar el proyecto sin problemas pudiendo registrar 
    y visualizar objetos de las clases creadas.

`SERVICIO DE AUTOMATIZACION DE PROCESOS (JENKINS)`

    Una vez se ha comprobado que el proyecto ejecuta correctamente sin errores de sintaxis, etc... 
    se procedió a empaquetarlo utilizando el servidor de automatización Jenkins.

    Se utilizó una OVA descargada de la pagina oficial de bitnami, ejecutada en este caso 
    desde la maquina virtual VirtualBox. 
    Al ejecutar el OVA tendremos acceso a una dirección IP, a introducir en el navegador, 
    que Bitnami Jenkins nos proporciona junto a unos credenciales. 

    Una vez introducida la IP en el navegador, y los credenciales correspodientes 
    tendremos acceso a los servicios de Jenkins.

`CONFIGURAR UN JOB EN JENKINS PARA COMPILAR Y EMPAQUETAR EL PROYECTO`

    Una vez dentro de Jenkins, se realizaron diferentes configuraciones que se estructura en los siguientes pasos: 

        1. En configuración global, se le indicó que version de jdk se esta usando (jdk8 en mi caso) 
        y la ruta donde se encuentra esta version (/opt/bitnami/java) y que version de maven instalar (versión 3.6.3).

        2. Se creó una nueva tarea o job, como proyecto de estilo libre. Dentro de su configuración se enlazó el link 
        al repositorio GitHub donde se encuentra el proyecto introduciendo los credenciales de la cuenta del usuario. 
        Se especificó la rama en la que se construirá el proyecto (en este caso, la rama develop).

        3. Por último, se indicó ejecutar tareas maven utilizando su última version instalada, 
        y las tareas de compilación y empaquetamiento del proyecto. 
        
    A partir de estos pasos se procedió a la construcción del proyecto desde Jenkins.

`ANALISIS, CALIDAD Y EVALUACIÓN DEL CODIGO FUENTE DEL PROYECTO DESDE JENKINS (SONARQUBE-JENKINS)`

    En este paso, se quisó analizar la calidad que tiene nuestro proyecto. 
    Para ello se empleó la plataforma para evaluar el codigo fuente, SonarQube. 

    El modo de acceder a SonaQube funciona de la misma forma que con Jenkins, 
    accediendo con otra dirección IP y credenciales diferentes

    Para poder realizar los analisis se debe instalar el plug-in SonarQube Scanner desde Jenkins 
    y posteriormente seguir los siguientes pasos:

        1. Una vez instalado el plug-in, en configuración global se indica la última versión a instalar (como se hizo con Maven)

        2. En configuración del sistema se añade el servidor de SonarQube, indicando nombre, su dirección IP y credenciales
        a traves de un token generado desde la pagina de SonarQube. De este modo Jenkins podrá comunicarse con SonarQube.

        3. Se creó en la raiz del proyecto el archivo sonar-project.properties, 
        con información importante para que se pueda realizar el análisis sin errores.

        4. En la configuración del job, se agregará otra nueva tarea para que se ejecute SonarQube desde Jenkins

    Finalmente, se lanzará la construcción del proyecto y se analizará el codigo exitosamente. 
    Una vez terminado el análisis se podrá consultar en la web de SonarQube el estado de nuestro proyecto 
    indicando bugs, aspectos a mejorar en el código, etc...

`LANZAR ANALISIS DE CODIGO DEL PROYECTO DESDE LA HERRAMIENTA MAVEN (SONARQUBE-MAVEN)`

    Este tipo de análisis también se puede configurar desde maven (en este caso, en el propio IDE de Intellij). 
    
    Para que funcione este análisis: 

        1. Se añadió una dependencia al archivo pom.xml para que Maven se comunique con SonarQube,
        
        2. se creó el archivo settings.xml dentro de la carpeta .m2 del usuario 
        y se indicó la dirección IP de SonarQube para permitir su conexión. 

    Finalmente, se compiló el proyecto previamente (mvn compile) 
    y a partir del comando "mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=1234" 
    se procedió a realizar el analisis de código (previamente se compiló el proyecto).
    
    De esta manera, SonarQube analizó el proyecto a partir de Maven, sin necesidad de usar Jenkins.

`IMPLEMENTACIÓN DE PRUEBAS JUNIT Y EJECUCION DE TESTS MEDIANTE JENKINS`

    En este apartado se añadieron tests JUnit al proyecto. 
    Se crearon las clases ConsolaTest, JuegoTest y MerchandisingTest. 
    En cada una de las clases de pruebas, se crearon diferentes objetos a partir del método constructor 
    y mediante las funciones reservadas assertEquals y assertNotEquals realizamos pruebas 
    para verificar que los objetos creados mediante el constructor son iguales o distintos 
    dependiendo la funcion escrita. 

    También, en el caso de la clase de prueba Juegos, 
    se comprobó que su metodo equals funcionaba correctamente mediante otro test. 

    Una vez añadidos los tests, construimos el proyecto desde Jenkins, 
    configurandolo para que este realicé como tarea un test del proyecto (en este caso, hubo 4 tests exitosos).

`OTROS ASPECTOS... (RELEASE, GESTOR DE ISSUES, DIAGRAMAS Y GITHUB-PAGES)`

    En GitHub se creo una release al proyecto para que los usuarios puedan descargar el proyecto 
    y poder usarla en sus IDEs tranquilamente. 

    También se creó un apartado de issues con los posibles bugs o aspectos a mejorar del proyecto. 
    En mi caso, no habia presencia de bugs, por lo que añadí posibles aspectos a mejorar 
    gracias al analisis proporcionado por SonarQube.

    Finalmente, se diseñó el diagrama de clases del proyecto y el diseño de la pagina web mediante github-pages.
