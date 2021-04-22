#### ACTIVIDAD DE APRENDIZAJE - JOSE RAMON GIMENO AGUIRREGOMOZCORTA

Proyecto Retroshop - Tienda online de software y hardware relacionado con videojuegos retro y merchandising
El proyecto estaría enfocado en el registro


Para la realización de este proyecto, se ha trabajado con la metodologia de trabajo de git, mediante la creacion de ramas, asi como aprender a trabajar en ellas y fusionarlas posteriormente con la rama principal.

PASO INICIAL

Primero de todo, se ha creado una clase "Application" en la cual se va a ejecutar el programa, la cual es la unica que se encuentra creda en la rama master. A partir de aquí se crea una rama llamada develop donde va a estar almacenado todo el proyecto y en la cual se van a fusionar diferentes ramas que van a formar parte del proyecto.

CREACION DE LA RAMA FEATURE/CREARCLASES

En la rama develop se crea una clase para gestionar un menu para registrar y consultar productos. En un principio se creó el esqueleto del menú.

Acto seguido, se crea una rama feature que hará referencia a la creacion de tres clases con las que se va a trabajar durante toda la actividad. Estas son: Consolas, Juegos y Merchandising... Cada una con sus correspondientes atributos y metodos getter, setter y equals.

Una vez creadas las clases se realiza un pull request para fusionar esta rama feature con la rama develop y se realiza un pull a nuestro area de trabajo local.

CREACIÓN DE LA RAMA FEATURE/REGISTRAROBJETOS

Seguimos con la creación de otra rama feature llamada registrar objetos, en la cual se va a empezar a completar el menú añadiendo que tipo de producto desea registrar (Consolas, Juegos, Merchandising) y dar nombre a los atributos de cada clase introduciendo datos por teclado (por ejemplo: titulo = "Super Mario", precio = 59.99f). Finalmente, los datos introducidos se guardaran en un arraylist para poder consultar las listas registradas posteriormente.

CREACION DE LA RAMA FEATURE/VISUALIZAROBJETOS

Una vez creado el menu de registrar objetos, se vuelve a realizar un pull request desde GitHub, fusionando esta rama con la rama develop. Posteriormente creamos otra rama feature para crear el menu de visualizar objetos y sus funcionalidades, como visualizar consolas, juegos o merchandising, listando los productos a traves de un bucle for each. Una vez terminada esta rama se vuelve a fusionar con la rama develop mediante un pull request.

PROYECTO COMPLETADO

A partir de aquí ya estan nuestras ramas creadas y fusionadas con la rama principal, en este caso la rama develop. Dentro de la rama develop ya podriamos ejecutar nuestro proyecto sin problemas pudiendo registrar y visualizar objetos de cada clase.

SERVICIO DE AUTOMATIZACION DE PROCESOS

Una vez completado el proyecto se procede a empaquetarlo utilizando el servidor de automatizacion Jenkins, a partir de un OVA ejecutado en este caso desde VirtualBox, al cual tendremos acceso introduciendo la dirección IP que Bitnami Jenkins nos proporciona. 

Una vez dentro de Jenkins, debemos configurarlo añadiendo el enlace al repositorio GitHub donde se encuentra nuestro proyecto a partir de nuestros credenciales de GitHub, indicandole que version de JDK utilizar (en este caso se usó el JDK8, indicandole la siguiente ruta: /opt/bitnami/java), indicandole que version de maven instalar cuando proceda a construir el proyecto. 

A partir de esta configuración se crea un Job de Jenkins con el nombre de nuestro proyecto, creando un estilo libre, y le indicamos los procesos que debe realizar (en este caso compilar y empaquetar). Si todo ha sido configurado correctamente, la construcción del proyecto desde Jenkins habrá sido exitosa.

ANALISIS, CALIDAD Y EVALUACIÓN DEL CODIGO FUENTE DEL PROYECTO DESDE JENKINS

A continuacion, queremos analizar la calidad que tiene nuestro proyecto. Para ello se empleará SonarQube, una plataforma para evaluar el codigo fuente. Para configurarlo se debe instalar un plug-in en Jenkins llamado SonarQube Scanner, para que Jenkins pueda conectarse a la plataforma. SonarQube también se ejecuta a partir de una OVA mediante una maquina virtual, la cual, al igual que jenkins, nos aporta otra dirección IP a introducir al navegador y entrar a sus servicios.

En SonarQube se debe crear un token para que Jenkins pueda tener acceso a la plataforma y poder realizar el analisis de código correctamente. Ademas, también se creó en la raiz del proyecto el archivo sonar-project.properties para que no haya ningun error posteriormente.

Finalmente, se lanzará la construcción del proyecto y se analizará el codigo exitosamente. Una vez terminado el análisis se podrá consultar en la web de SonarQube el estado de nuestro proyecto indicandonos bugs, aspectos a mejorar en el código, etc...

LANZAR ANALISIS DE CODIGO DEL PROYECTO DESDE LA HERRAMIENTA MAVEN

Este tipo de analisis también se puede configurar desde maven. Para que funcione este análisis se añade una dependencia al archivo pom.xml, se crea el archivo settings.xml dentro de la carpeta .m2 del usuario y se indica la dirección IP de SonarQube para que pueda analizar el proyecto. 

Antes de ejecutar el comando, limpiamos y compilamos el proyecto mediante mvn clean compile, y posteriormente ejecutamos el comando mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=1234 . De esta manera, SonarQube analizará el proyecto a partir de maven, sin necesidad de usar Jenkins.

IMPLEMENTACIÓN DE PRUEBAS JUNIT Y CONSTRUCCIÓN DEL PROYECTO MEDIANTE JENKINS

Siguiendo con los apartados de la actividad de aprendizaje, en este apartado se van a añadir test JUnit al proyecto. Se crearon las clases ConsolasTest, JuegosTest, MerchandisingTest. En cada una de las clases de pruebas, se crean diferentes objetos a partir del método constructor y mediante las funciones reservadas assertEquals y assertNotEquals realizamos pruebas para verificar que los objetos creados mediante el constructor son iguales o distintos comparandolo con ambos tipos de funciones. También, en el caso de la clase de prueba Juegos, se comprobó que su metodo equals funcionaba correctamente. 

Una vez añadidos los tests, construimos el proyecto desde Jenkins, configurandolo para que este realicé un test al proyecto. En este caso, hubo 4 tests exitosos.

OTROS ASPECTOS... (RELEASE, GESTOR DE ISSUES, DIAGRAMAS Y GITHUB-PAGES)

En GitHub se creo una release al proyecto para que los usuarios puedan descargar el proyecto y poder usarla en sus IDEs tranquilamente. También se creó un apartado de issues con los posibles bugs o aspectos a mejorar del proyecto. En mi caso, no habia presencia de bugs, por lo que añadí posibles aspectos a mejorar gracias al analisis proporcionado por SonarQube.

Finalmente, se diseñó el diagrama de clases del proyecto y el diseño de la pagina web mediante github-pages.
