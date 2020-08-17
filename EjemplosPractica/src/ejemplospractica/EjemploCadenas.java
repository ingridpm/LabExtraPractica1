/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospractica;

import java.util.Scanner;

/**
 *
 * @author ingri
 */
public class EjemploCadenas {
    
    Scanner lector;
    public EjemploCadenas() {
        lector = new Scanner(System.in);
        //convertirAscii();
        promedio();
    }

    private void convertirAscii() {
        System.out.println("Ingrese un texto");
        String texto = lector.nextLine();
        int tamano = texto.length();
        for(int i = 0; i < tamano; i++){
            char caracter = texto.charAt(i);
            int ascii = caracter;
            System.out.println("Posición "+ i + ": " + caracter + " = " + ascii);
        }
    }
    
    private void promedio() {
        System.out.println("Ingrese sus notas separadas por -");
        String entrada = lector.nextLine();
        System.out.println("Entrada: " + entrada);
        String[] notasArreglo = entrada.split("-");
        System.out.println("Arreglo de notas:");
        for(int i = 0; i<notasArreglo.length;i++){
            System.out.println("Posición "+ i + ": " + notasArreglo[i]);
        }
        int[] notasEnteros = new int[notasArreglo.length];
        for(int i = 0; i<notasArreglo.length;i++){
            notasEnteros[i] = Integer.parseInt(notasArreglo[i]);
        }
        System.out.println("");
        System.out.println("Arreglo de notas en números:");
        for(int i = 0; i<notasEnteros.length;i++){
            System.out.println("Posición "+ i + ": " + notasEnteros[i]);
        }
        System.out.println("Calculando promedio...");
        double promedio = 0;
        for(int i = 0; i<notasEnteros.length;i++){
            promedio += notasEnteros[i];
        }
        promedio = promedio / notasEnteros.length;
        System.out.println("El promedio es: "+promedio);
    }
    
}
