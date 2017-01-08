package taulellinternes.control;

import taulellinternes.vista.VistaText;

public class ControlText {

    VistaText vista = new VistaText();
    private int x, y;
    public int[][] Taulell;

    public void menuInicial() {
        do {

            int opcio = vista.mostrarMenuInicial();

            switch (opcio) {
                case 1:

                    break;

                case 2:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    public void crearTaulell() {

        x = vista.mostrarMenuCrearTaulell1();
        crearTaulell2();

    }

    public void crearTaulell2() {
        
        y = vista.mostrarMenuCrearTaulell2();
        crearTaulellMesures(x, y);
    }

    public void crearTaulellMesures(int x, int y) {
        
        Taulell = new int[x][y];
        
        for (int i = 0; i < Taulell.length; i++) {
            for (int j = 0; j < Taulell[0].length; j++) {
                
            }
        }
    }

}
