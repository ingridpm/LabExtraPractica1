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
public class EjemploMatriz {

    public EjemploMatriz() {
        ejemplo1();
    }

    private void ejemplo1() {
        int[][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
        imprimirMatriz("Matriz 1",matriz1);
        int[][] matriz2 = {{1,1,1},{1,1,1},{1,1,1}};
        imprimirMatriz("Matriz 2",matriz2);
        int[][] resultado = sumarMatrices(matriz1,matriz2);
        imprimirMatriz("Suma ",resultado);
    }
    
    private void imprimirMatriz(String titulo, int[][] matriz) {
        System.out.println(titulo + "-------------------------------------------");
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("");
    }

    private int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] matrizResultado = new int[matriz1.length][matriz1[0].length];
        for(int i = 0; i<matriz1.length; i++){
            for(int j = 0; j<matriz1[0].length; j++){
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matrizResultado;
    }

    
    
}
