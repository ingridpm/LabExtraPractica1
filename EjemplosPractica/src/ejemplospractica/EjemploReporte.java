/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospractica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ingri
 */
public class EjemploReporte {

    String reporte = "";
    
    public EjemploReporte() {
        int[][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
        agregarMatriz("Matriz 1",matriz1);
        int[][] matriz2 = {{1,1,1},{1,1,1},{1,1,1}};
        agregarMatriz("Matriz 2",matriz2);
        int[][] resultado = sumarMatrices(matriz1,matriz2);
        agregarMatriz("Suma ",resultado);
        generarReporte();
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
    
    private void agregarMatriz(String titulo, int[][] matriz) {
        String tabla = "<h3>" + titulo + "</h3><table border=\"1\" class=\"center\">\n";
        for (int i = 0; i < matriz.length; i++) {
            tabla += "<tr>\n";
            for (int j = 0; j < matriz[0].length; j++) {
                tabla += "<td>" + matriz[i][j] + "</td>\n";
            }
            tabla += "</tr>\n";
        }
        tabla += "</table><br/>\n";
        reporte += tabla;
    }
    
    private void generarReporte() {
        String encabezado = "<head>\n";
        encabezado += "<link href=\"estilo.css\" rel=\"stylesheet\" type=\"text/css\">\n";
        encabezado += "<title>Reporte</title>\n";
        encabezado += "</head>\n";
        String cuerpo = "<body>\n";
        cuerpo += reporte;
        cuerpo += "</body>\n";
        String html = "<!DOCTYPE html>\n<html>\n";
        html += encabezado;
        html += cuerpo;
        html += "</html>\n";
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("Reportes/SumaMatrices.html", false));
            escritor.write(html);
            escritor.close();
            System.out.println("Reporte generado");
            System.out.println("");
        } catch (IOException ex) {
            Logger.getLogger(EjemploReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
