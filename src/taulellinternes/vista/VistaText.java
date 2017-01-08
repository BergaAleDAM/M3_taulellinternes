package taulellinternes.vista;

import java.util.Scanner;
import taulellinternes.TaulellInternes;

public class VistaText {

    Scanner lector = new Scanner(System.in);

    public int mostrarMenuInicial() {
        int opcio;

        System.out.println("MENU INICIAL: \n"
                + "1. Crear taulell.\n"
                + "2. Sortir");

        do {

            System.out.println("Quina opció vols?");

            opcio = lector.nextInt();

        } while (comprovarOpcio(opcio));

        return opcio;
    }

    public int mostrarMenuCrearTaulell1() {
        int opcio;

        System.out.println("MENU DEL TAULELL: \n"
                + "Pssa la mida dels costats del taulell\n"
                + "Primer la altura de caselles"
        );

        do {
            System.out.println("Escull una opció adequadament");
            if (lector.hasNext()) {
                opcio = 0;
            }
            opcio = lector.nextInt();
        } while (comprovarOpcioReal(opcio));

        return opcio;
    }

    public int mostrarMenuCrearTaulell2() {
        int opcio;

        System.out.println("Ara la amplada de caselles");

        do {
            System.out.println("Escull una opció adequadament");
            if (lector.hasNext()) {
                opcio = 0;
            }
            opcio = lector.nextInt();
        } while (comprovarOpcioReal(opcio));

        return opcio;
    }

    public boolean comprovarOpcio(int opcio) {
        boolean comprovacio = false;

        if (opcio > 0 && opcio < 3) {
            comprovacio = true;
        }

        return comprovacio;
    }

    private boolean comprovarOpcioReal(int opcio) {
        boolean comprovacio = false;

        if (opcio > 0 && opcio < 100) {
            comprovacio = true;
        }

        return comprovacio;
    }

//    public void mostrarTaulell(TaulellInternes.Casella[][] casella) {
//
//        int amplada = casella.length;
//        int altura = casella[0].length;
//        
//        for (int i = 0; i < amplada; i++) {
//            
//            System.out.print( "[ ");
//            for (int j = 0; j < altura; j++) {
//
//            System.out.print(casella[i][j] + ", ");
//            }
//            
//            System.out.println(" ]");
//        }
//    }
}
