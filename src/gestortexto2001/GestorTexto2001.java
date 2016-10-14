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
        String frase = "El murcielargo come bayas";
        System.out.println(FuncionesTexto.modifyText(frase, "come", "caga"));
        System.out.println(FuncionesTexto.eraseWord(frase, "come"));
    }
    
}
