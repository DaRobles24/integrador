/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador.practica.evaluada;

/**
 *
 * @author danie
 */
public class Rutina {

    private Especie[] Especies;
    private int indice;

    public Rutina() {
        Especies = new Especie[10];
        indice = 0;
    }  
    

    public void agregarEspecie(Especie especie) {
        if (indice < Especies.length) {
            Especies[indice] = especie;
            indice++;
        } else {
            System.out.println("No es posible agregar mas Especies (!Espacios llenos!)");
        }
    }

    public Especie[] ConsultarPorNombre(String Nombre) {
        for (Especie especie : Especies) {
            if (especie != null && especie.getNombre().equalsIgnoreCase(Nombre)) {
                return Especies;
            }
        }
        return null;
    }

   public Especie[] consultarPorCategoria(String categoria) {
        Especie[] resultado = new Especie[10];
        int resultadoIndice = 0;
        for (Especie especie : Especies) {
            if (especie != null && especie.getCategoria().equalsIgnoreCase(categoria)) {
                resultado[resultadoIndice] = especie;
                resultadoIndice++;
            }
        }
        return resultado;
    }

    public Especie especieConPrecioMasAlto() {
        if (Especies[0] == null) {
            return null;
        }
        Especie especieMasCara = Especies[0];
        for (Especie especie : Especies) {
            if (especie != null && especie.getPrecio() > especieMasCara.getPrecio()) {
                especieMasCara = especie;
            }
        }
        return especieMasCara;

    }

    public Especie especieConPrecioMasBajo() {
        if (Especies[0] == null) {
            return null;
        }
        Especie especieMasBarata = Especies[0];
        for (Especie especie : Especies) {
            if (especie != null && especie.getPrecio() < especieMasBarata.getPrecio()) {
                especieMasBarata = especie;
            }
        }
        return especieMasBarata;
    }
}
