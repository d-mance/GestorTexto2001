/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestortexto2001;

import gestortexto2001.model.FuncionesTexto;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author dmance
 */
public class GestorTexto2001 {

    /**
     * @param args the command line arguments
     */
    Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        GestorTexto2001 gt = new GestorTexto2001();
        gt.run();

    }

    private void run() {
        int option = -1;
        System.out.println("Introduce un texto: ");
        String frase = scr.nextLine();
        do {
            option = menu();
            switch (option) {
                case 1:
                    System.out.println("Texto: " + frase);
                    if (buscarPalabra(frase)) {
                        System.out.println("La palabra aparece en el texto");
                    } else {
                        System.out.println("La palabra no aparece en el texto");
                    }
                    break;
                case 2:
                    System.out.println("Texto: " + frase);
                    String original;
                    String cambiar;
                    System.out.print("Introduce la palabra a cambiar: ");
                    original = scr.nextLine();
                    System.out.print("Introduce la nueva palabra: ");
                    cambiar = scr.nextLine();
                    if (FuncionesTexto.search(frase, original)) {
                        System.out.println("Texto resultante: "+
                                FuncionesTexto.modifyText(frase, original, cambiar));                        
                    } else {
                        System.out.println("No se ha podido cambiar la palabra");
                    }
                    break;
                case 3:
                    System.out.println("Texto: "+frase);
                    System.out.print("Introduce la palabra a eliminar: ");
                    original = scr.nextLine();
                    if (FuncionesTexto.search(frase, original)) {
                        System.out.println("Texto resultante: ");
                        System.out.println(FuncionesTexto.eraseWord(frase, original));
                    } else {
                        System.out.println("No se ha podido cambiar la palabra");
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        } while (option != 0);
    }

    private int menu() {
        int opcion = -1;
        System.out.println("+++++++++++++++++++++++MENU+++++++++++++++++++++++");
        System.out.println("0. Exit");
        System.out.println("1. Buscar si una parlabra aparece en el texto");
        System.out.println("2. Cambiar una palabra del texto");
        System.out.println("3. Eliminar una palabra del texto");
        System.out.println("Opcion: ");
        try {
            opcion = parseInt(scr.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("Introduce un numero entero");
        }
        return opcion;
    }

    private boolean buscarPalabra(String frase) {
        System.out.println("Introduce la palabra a buscar");
        String palabra = scr.nextLine();
        return FuncionesTexto.search(frase,palabra);
    }



}
