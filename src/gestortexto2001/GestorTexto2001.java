/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestortexto2001;

import gestortexto2001.model.FuncionesTexto;
import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dmance
 */
public class GestorTexto2001 {
    
    Scanner scr=new Scanner(System.in);
    FuncionesTexto texto;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestorTexto2001 gestor = new GestorTexto2001();
        gestor.run();
    }
    
    public void run(){
        int option=-1;
        System.out.println("Introduce un texto: ");
        String frase=scr.nextLine();
        texto= new FuncionesTexto(frase);
        do{
            option=menu();
            switch(option){
                case 1:
                    System.out.println("Texto: ");
                    System.out.println(texto.getText());
                    if(buscarPalabra()){
                        System.out.println("La palabra aparece en el texto");
                    }
                    else{
                        System.out.println("La palabra no aparece en el texto");
                    }
                    break;
                case 2:
                    System.out.println("Texto: ");
                    System.out.println(texto.getText());
                    if(cambiaPalabra()){
                        System.out.println("Texto resultante: ");
                        System.out.println(texto.getText());
                    }
                    else{
                        System.out.println("No se ha podido cambiar la palabra");
                    }
                    break;
                case 3:
                    System.out.println("Texto: ");
                    System.out.println(texto.getText());
                    if(eliminaPalabra()){
                        System.out.println("Texto resultante: ");
                        System.out.println(texto.getText());
                    }
                    else{
                        System.out.println("No se ha podido cambiar la palabra");
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
            
        }while(option!=0);
    }

    private int menu() {
        int opcion=-1;
        System.out.println("+++++++++++++++++++++++MENU+++++++++++++++++++++++");
        System.out.println("0. Exit");
        System.out.println("1. Buscar si una parlabra aparece en el texto");
        System.out.println("2. Cambiar una palabra del texto");
        System.out.println("3. Eliminar una palabra del texto");
        System.out.println("Opcion: ");
        try{
            opcion=parseInt(scr.nextLine());
        }
        catch(NumberFormatException ex){
            System.out.println("Introduce un numero entero");
        }
        return opcion;
    }

    private boolean buscarPalabra() {
        System.out.println("Introduce la palabra a buscar");
        String palabra = scr.nextLine();
        return texto.search(palabra);
    }

    private boolean cambiaPalabra() {
        System.out.println("Introduce la palabra a sustituir");
        String original = scr.nextLine();
        System.out.println("Escribe la palabra por la que la quieres sustituir");
        String resultado = scr.nextLine();
        return !(texto.modifyText(original, resultado).equals("-1"));
    }

    private boolean eliminaPalabra() {
        System.out.println("Introduce la palabra a eliminar");
        String original = scr.nextLine();
        return !(texto.eraseWord(original).equals("-1"));
    }
    
}
