package com.sanvalero.retroshop.domain;

import java.util.Objects;

public class Juegos {
    private String titulo;
    private String plataforma;
    private String genero;
    private int ano_lanzamiento;
    private float precio;

    public Juegos() {
    }

    public Juegos(String titulo, String plataforma, String genero, int ano_lanzamiento, float precio) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.ano_lanzamiento = ano_lanzamiento;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno_lanzamiento() {
        return ano_lanzamiento;
    }

    public void setAno_lanzamiento(int ano_lanzamiento) {
        this.ano_lanzamiento = ano_lanzamiento;
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
        Juegos juegos = (Juegos) o;
        return plataforma.equals(juegos.plataforma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, plataforma, genero, ano_lanzamiento, precio);
    }
}
