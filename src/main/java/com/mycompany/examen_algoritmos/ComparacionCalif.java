/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_algoritmos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author Mauricio
 */
public class ComparacionCalif {
    
    
    public static List<String> leerCasosPrueba(String nombreArchivo) throws IOException{
        BufferedReader lectorBuffer = new BufferedReader(new FileReader(nombreArchivo));
        
	/*
         * A list of every case read
         */
        List <String> casosPrueba = new ArrayList<String>();
        
        String lectorLinea;
        while ((lectorLinea = lectorBuffer.readLine()) != null) {
            //Each test case is separated by a break line 
            if(!lectorLinea.equals("")){
                casosPrueba.add(lectorLinea);
            }
                
        }
        lectorBuffer.close();
        return casosPrueba;
    }
    
    public static void mostrarSolucion(List<String> testCases) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < testCases.size()-1; i+=2){
            //Storing scores in two different lists of integers (a for Alice, b for Bob)
            List<Integer> a = Stream.of(testCases.get(i).split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
            
            List<Integer> b = Stream.of(testCases.get(i+1).split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> res = compararCalif(a,b);
            
            //Writing out the response
            bufferedWriter.write(
                res.stream()
                    .map(Object::toString)
                    .collect(joining(" "))
                + "\n"
            );   
        }
        bufferedWriter.close();
    }
    
    public static List<Integer> compararCalif(List<Integer> a, List<Integer> b) {
        
        /**
         * Array that contains the result of the algorithm
         */
        List <Integer> puntuacion = new ArrayList<Integer>();
        int conta = 0, contb = 0;
        for(int i = 0; i < 3; i++){
            if(a.get(i) > b.get(i))
                conta++;
            else if(b.get(i) > a.get(i))
                contb++;
        }
        puntuacion.add(conta);
        puntuacion.add(contb);
        return puntuacion;

    }
    
}
