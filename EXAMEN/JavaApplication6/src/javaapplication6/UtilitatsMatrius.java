/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author tomeu
 */
public class UtilitatsMatrius {

    public static void mostraMatriu(int[][] matriu) {
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }


    public static int[][] generaMatriu(int NTAULER, int SIMBOL_BUIT, int SIMBOL_BUIT0) {
        // Crea la matriz con dimensiones NTAULER x NTAULER
        int[][] matriu = new int[NTAULER][NTAULER];
        
        // Inicializa la matriz con el valor SIMBOL_BUIT
        for (int i = 0; i < NTAULER; i++) {
            for (int j = 0; j < NTAULER; j++) {
                matriu[i][j] = SIMBOL_BUIT; // Asigna SIMBOL_BUIT en cada celda
            }
        }
           for (int i = 0; i < NTAULER; i++) {
            matriu[i][0] = SIMBOL_BUIT0; // Marca la primera columna con SIMBOL_BUIT0
        }
        
        return matriu; // Devuelve la matriz generada
    }

    
    
}

