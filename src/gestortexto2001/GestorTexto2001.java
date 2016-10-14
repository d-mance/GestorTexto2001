/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestortexto2001;

import gestortexto2001.model.FuncionesTexto;

/**
 *
 * @author dmance
 */
public class GestorTexto2001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text="El vicky es una persona muy inteligente";
        String original="mu";
        String word="poco";
        System.out.println(FuncionesTexto.modifyText(text, original, word));
    }
    
}
