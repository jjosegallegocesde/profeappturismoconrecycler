package com.example.pruebapueblofinal.modelos;

public class Hotel {

    private int fotografia;
    private String nombre;
    private String precio;

    public Hotel(int fotografia, String nombre, String precio) {
        this.fotografia = fotografia;
        this.nombre = nombre;
        this.precio = precio;
    }


    public int getFotografia() {
        return fotografia;
    }

    public void setFotografia(int fotografia) {
        this.fotografia = fotografia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

}
