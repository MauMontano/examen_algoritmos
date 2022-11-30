/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.examen_algoritmos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mauricio
 */
public class Examen_algoritmos {

    public static void main(String[] args) throws IOException {
        
        //Ejercicio 2
        System.out.println("\nEjercicio 2\n");
        List<String> palabras = OcurrenciaPalabra.LeerArchivo("test2.txt");
        Map<String, Integer> ocurrenciaPalabrasHM = OcurrenciaPalabra.encontrarOcurrencia(palabras);
        System.out.printf( "JSON: %s", OcurrenciaPalabra.convertirHMJSON(ocurrenciaPalabrasHM));

        //Ejercicio 1
        System.out.println("\n\nEjercicio 1\n");
        List <String> casosPruebaE1 = ComparacionCalif.leerCasosPrueba("test1.txt");
        ComparacionCalif.mostrarSolucion(casosPruebaE1);

        

        
        
        
    }
}
