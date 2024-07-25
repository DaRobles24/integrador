/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador.practica.evaluada;

/**
 *
 * @author danie
 */

// creamos los atributos
public class Especie {
    private String Nombre;
    private int Cantidad;
    private String Categoria;
    private double Precio;
    
// creamos los metodos

    public Especie(String Nombre, int Cantidad, String Categoria, double Precio) {
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Categoria = Categoria;
        this.Precio = Precio;
    }
     
    
    //getters

    public String getNombre() {
        return Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public String getCategoria() {
        return Categoria;
    }

    public double getPrecio() {
        return Precio;
    }
    
    //setters 

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    

    public String Tostring() {
        return "Especie{"
                + "nombre='" + Nombre + '\''
                + ", cantidad=" + Cantidad
                + ", categoria='" + Categoria + '\''
                + ", precio=" + Precio
                + '}';
}
}
