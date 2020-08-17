/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospractica;

/**
 *
 * @author ingri
 */
public class EjemploMetodos {

    public EjemploMetodos() {
        System.out.println("PROCEDIMIENTO1-------------------------------------------------------");
        procedimiento1();
        System.out.println("");
        System.out.println("PROCEDIMIENTO2-------------------------------------------------------");
        procedimiento2(5);//uso de return
        System.out.println("");
        System.out.println("PROCEDIMIENTO3-------------------------------------------------------");
        procedimiento3(120);//varios return
        System.out.println("");
        System.out.println("SUMAR----------------------------------------------------------------");
        int resultado = sumar(2,4);
        System.out.println("suma: " + resultado);
        System.out.println("");
        System.out.println("SALUDAR--------------------------------------------------------------");
        String saludo = saludar('f');
        System.out.println(saludo);
        System.out.println("");
        System.out.println("ESLETRA--------------------------------------------------------------");
        char caracter = 'p';
        System.out.println("El caracter es: " + caracter);
        if(esLetra(caracter)){
            System.out.println("Es una letra");
        } else {
            System.out.println("No es una letra");
        }
    }

    private void procedimiento1() {
        System.out.println("Llamada al método procedimiento1");
        System.out.println("Sale del método");
    }

    private void procedimiento2(int numero) {
        if (numero>100){
            System.out.println("El número es mayor a 100");
            return;
        } 
        if (numero % 2 == 0){
            System.out.println("El número es par, menor a 100");
        } else {
            System.out.println("El número es impar menor a 100");
        }
    }

    private void procedimiento3(int numero) {
        System.out.println("entra a procedimiento 3");
        procedimiento1();
        System.out.println("Haciendo una suma: " + sumar(numero,numero));
        System.out.println("sale del procedimiento3");
    }


    private int sumar(int n1, int n2) {
        return n1 + n2;
    }

    private String saludar(char genero) {
        if(genero=='f'){
            return "Hola amiga!";
        }
        return "Hola amigo!";
    }

    private boolean esLetra(char c) {
        int ascii = ',';
        System.out.println("codigo: " + ascii);
        if (ascii >= 97 && ascii<=122){
            return true;
        }
        return false;
    }
    
}
