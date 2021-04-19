package com.sanvalero.retroshop.domain;

import java.util.Objects;

public class Merchandising {
    private String nombre;
    private String marca;
    private String procedencia;
    private int ano_fabricacion;
    private float precio;

    public Merchandising() {
    }

    public Merchandising(String nombre, String marca, String procedencia, int ano_fabricacion, float precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.procedencia = procedencia;
        this.ano_fabricacion = ano_fabricacion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
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
        Merchandising that = (Merchandising) o;
        return marca.equals(that.marca);
    }
}
