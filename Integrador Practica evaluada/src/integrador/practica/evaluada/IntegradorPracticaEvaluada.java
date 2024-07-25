/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integrador.practica.evaluada;

/**
 *
 * @author danie
 */
public class IntegradorPracticaEvaluada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // creamos la rutina
        Rutina rutina = new Rutina();
        
        //agregamos las especies 
        
        rutina.agregarEspecie (new Especie ("Pez Payaso", 10 ,"Tropical", 15.10));
        rutina.agregarEspecie (new Especie ("Pez Angel", 7 ,"Tropical", 3.10));
        rutina.agregarEspecie (new Especie ("Pez Betta", 12 ,"Oriental", 7.10));
        rutina.agregarEspecie (new Especie ("Pez Dorado", 3 ,"Oriental", 25.0));
        
        //consultar por especie
        System.out.println("Consultar por el Nombre 'Dorado'");
        System.out.println(rutina.ConsultarPorNombre("Pez Dorado"));
        
        //consultar por categoria
        System.out.println("\nConsultar por categoría 'Tropical':");
        for (Especie especie : rutina.consultarPorCategoria("Tropical")) {
            if (especie != null) {
                System.out.println(especie);
            }
        }
       
        //especie con el precio mas alto
        System.out.println("Especie mas cara:");
        System.out.println(rutina.especieConPrecioMasAlto());
        
        //especie con el precio mas bajo
        System.out.println("Especie mas barata:");
        System.out.println(rutina.especieConPrecioMasBajo());
    }
    
}