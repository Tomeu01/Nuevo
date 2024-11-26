/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author tomeu
 */
public class Main { 
    static int NTAULER;
    static final int SIMBOL_NEGRE = 1;
    static final int SIMBOL_VERMELL = 2;
    static final int SIMBOL_PEO = 8;
    static final int SIMBOL_COSTAT = 9;
    static int[][] tauler;
    static int simbol;
    
    public static void main(String[] args) {
        NTAULER = UtilitatsConsola.llegirSencer("Mida del tauler: ");
        tauler = new int[NTAULER][NTAULER];  // matriu NTAULERxNTAULER
        
        emplenaCostats(tauler);
        UtilitatsMatrius.mostraMatriu(tauler);
        
        emplenaInterior(tauler);
        UtilitatsMatrius.mostraMatriu(tauler);
        
        situaPeo(tauler, SIMBOL_VERMELL);
        UtilitatsMatrius.mostraMatriu(tauler);
        
        situaPeo(tauler, SIMBOL_NEGRE);
        UtilitatsMatrius.mostraMatriu(tauler);
        
        mostraTauler(tauler);
        
    }
    public static void emplenaCostats(int[][] tauler){
        for (int i = 0; i < NTAULER; i++) {
            tauler[i][NTAULER - 1] = SIMBOL_COSTAT;
            tauler[i][0] = SIMBOL_COSTAT;
            tauler[0][i] = SIMBOL_COSTAT;
            tauler[NTAULER - 1][i] = SIMBOL_COSTAT;
        }
    }
    public static void emplenaInterior(int[][] tauler){
        for (int i = 1; i < NTAULER - 1; i++) {
            for (int j = 1; j < NTAULER - 1; j++) {
                int sumaIndexos = i + j;//Sumam indexs
                if (sumaIndexos % 2 == 0) {// En cas que sigui parell, afegim Simbol_negre
                    tauler[i][j] = SIMBOL_NEGRE;
                } 
                else {
                    tauler[i][j] = SIMBOL_VERMELL;// En cas contrari,afegim Simbol_vermell
                }
            }
        }
    
    }
    public static void situaPeo (int[][] tauler, int[] SIMBOL_VERMELL,int[] SIMBOL_NEGRE){
         ArrayList<int[]> posicions = new ArrayList<>();
        for (int i = 1; i < NTAULER - 1; i++) {
            for (int j = 1; j < NTAULER - 1; j++) {
                
                if (tauler[i][j] == simbol) {
                    posicions.add(new int[]{i, j});
                }
            }
        }
        if (!posicions.isEmpty()) {
            Random random = new Random();
            int[] posicio = posicions.get(random.nextInt(posicions.size()));
            
            tauler[posicio[0]][posicio[1]] = SIMBOL_PEO;
        }
    }    
    
    public static void mostraTauler(int[][] tauler) {
        
        for (int i = 0; i < NTAULER; i++) {
            for (int j = 0; j < NTAULER; j++) {
                switch (tauler[i][j]) {
                    case SIMBOL_NEGRE -> System.out.print(" : "); //Asignam valor ":" a Simbol_negre
                    case SIMBOL_VERMELL -> System.out.print("   "); //Asignam valor " " a Simbol_vermell
                    case SIMBOL_PEO -> System.out.print(" Z "); //Asignmal valor "Z" a Simbol_peo
                    case SIMBOL_COSTAT -> System.out.print(" | "); //Asignam valor "|" a Simol_costat
                }
            }
            System.out.println();
        }
    }
}



    

