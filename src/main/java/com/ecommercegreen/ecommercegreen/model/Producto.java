package com.ecommercegreen.ecommercegreen.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String imagen;
    private double precio;
    private int cantidad;

    private String urldata;

    @ManyToOne
    private Usuario usuario;

    public Producto() {
    }

    public Producto(Integer id, String nombre, String descripcion, String imagen, double precio, int cantidad, String urldata, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = precio;
        this.cantidad = cantidad;
        this.urldata = urldata;
        this.usuario = usuario;
    }
}
