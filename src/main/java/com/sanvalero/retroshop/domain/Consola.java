package com.sanvalero.retroshop.domain;

import java.util.Objects;

public class Consola {
    private String nombre;
    private String desarrollador;
    private String pais_fabricacion;
    private int ano_fabricacion;
    private float precio;

    public Consola() {

    }

    public Consola(String nombre, String desarrollador, String pais_fabricacion, int ano_fabricacion, float precio) {
        this.nombre = nombre;
        this.desarrollador = desarrollador;
        this.pais_fabricacion = pais_fabricacion;
        this.ano_fabricacion = ano_fabricacion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getPais_fabricacion() {
        return pais_fabricacion;
    }

    public void setPais_fabricacion(String pais_fabricacion) {
        this.pais_fabricacion = pais_fabricacion;
    }

    public int getAno_fabricacion() {
        return ano_fabricacion;
    }

    public void setAno_fabricacion(int ano_fabricacion) {
        this.ano_fabricacion = ano_fabricacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consola consola = (Consola) o;
        return ano_fabricacion == consola.ano_fabricacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, desarrollador, pais_fabricacion, ano_fabricacion, precio);
    }
}
