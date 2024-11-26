package examen;

public class Main { 
    static int NTAULER;
    static final int SIMBOL_NEGRE = 1;
    static final int SIMBOL_VERMELL = 2;
    static final int SIMBOL_PEO = 8;
    static final int SIMBOL_COSTAT = 9;
    static int[][] tauler;
    
    public static void main(String[] args) {
        NTAULER = UtilitatsConsola.llegirSencer("Mida del tauler: ");
        tauler = new int[NTAULER][NTAULER];  // matriu NTAULERxNTAULER
        
        emplenaCostats(tauler);
        UtilitatsMatrius.mostrarMatriu(tauler);

        emplenaInterior(tauler);
        UtilitatsMatrius.mostrarMatriu(tauler);

        situaPeo(tauler, SIMBOL_VERMELL);
        UtilitatsMatrius.mostrarMatriu(tauler);
        
        situaPeo(tauler, SIMBOL_NEGRE);
        UtilitatsMatrius.mostrarMatriu(tauler);

        mostraTauler(tauler);
    }
    
    public static void emplenaCostats(...) {
        /**
         * Ha de rebre un la matriu 'tauler' i ha d'emplenar els costats exteriors 
         * amb el valor 'SIMBOL_COSTAT'.
         */

    }
    
    public static void emplenaInterior(...) {
        /**
         * Ha de rebre un la matriu 'tauler' i ha d'emplenar les posicions alternes 
         * amb 'SIMBOL_NEGRE' i 'SIMBOL_VERMELL'
         */
    }
    
    public static void situaPeo(...) {
        /**
         * Ha de rebre la matriu 'tauler' i ha de situar un 'SIMBOL_PEO'
         * en qualsevol posició aleatòria igual a 'SIMBOL_VERMELL'.
         */
    }
    
    public static void mostraTauler(...) {
        /**
         * Ha de rebre la matriu 'tauler' i ha de substituir cada símbol segons la següent taula:
            SIMBOL_VERMELL -> "  "
            SIMBOL_NEGRE -> " : "
            SIMBOL_PEO -> " Z "
            SIMBOL_COSTAT -> " | "
         */
        
    }
}

