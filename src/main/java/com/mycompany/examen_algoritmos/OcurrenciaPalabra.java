/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_algoritmos;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mauricio
 */
public class OcurrenciaPalabra {
    public static List<String> LeerArchivo(String nombreArchivo) throws IOException {
        BufferedReader lectorBuffer = new BufferedReader(new FileReader(nombreArchivo));
        
        /**
         * An ArrayList to store every word into the file
         */
        List<String> palabras = new ArrayList<String>();
        
        
	String lectorLinea;
        
        //Reading the file line by line
	while ((lectorLinea = lectorBuffer.readLine()) != null) {

            //Removing capitalization, and punctuation from input
			String cleanLine = lectorLinea.toLowerCase().replaceAll("[^A-Za-z0-9\\s]", "");
			
            //Adding each word into an ArrayList
            for (String palabra : cleanLine.split("\\s")) {
                if (!palabra.isEmpty())
                    palabras.add(palabra);
            }

        }
        lectorBuffer.close();
        return palabras;
    }
    
    public static Map<String, Integer> encontrarOcurrencia(List<String> palabras){
        Map<String, Integer> ocurrenciaPalabrasHM =  new HashMap<String, Integer>();
        
        for (String palabra : palabras) {
            //If the word is on the hashmap, update the value
            if (ocurrenciaPalabrasHM.containsKey(palabra))
                ocurrenciaPalabrasHM.put(palabra, ocurrenciaPalabrasHM.get(palabra) + 1);
            //If the wors is not on the hashmap yet
            else
                ocurrenciaPalabrasHM.put(palabra, 1);
        }
        return ocurrenciaPalabrasHM;
    }
    
    public static JsonObject convertirHMJSON(Map<String, Integer> ocurrenciaPalabrasHM){
        Gson gson = new Gson();
        JsonObject json = gson.toJsonTree(ocurrenciaPalabrasHM).getAsJsonObject();

        System.out.printf( "JSON: %s", json);
        return json;
    }
}
