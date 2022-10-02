package com.articulos.ap2.modelo;


import javax.persistence.*;

@Entity
@Table(name = "articulos")
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ArticuloId;
    private String Descripcion;
    private  String Marca;
    private Double Existencia;

    public Articulo(int articuloId, String descripcion, String marca, Double existencia) {
        this.ArticuloId = articuloId;
        this.Descripcion = descripcion;
        this.Marca = marca;
        this.Existencia = existencia;
    }

    public Articulo(){
        super();
    }

    public int getArticuloId() {
        return ArticuloId;
    }

    public void setArticuloId(int articuloId) {
        ArticuloId = articuloId;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Double getExistencia() {
        return Existencia;
    }

    public void setExistencia(Double existencia) {
        Existencia = existencia;
    }
}
