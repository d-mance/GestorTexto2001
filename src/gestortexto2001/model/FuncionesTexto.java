/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestortexto2001.model;

/**
 *
 * @author dmance
 */
public class FuncionesTexto {
    
    public static boolean search(String text, String word)
    {
        
        return false;
    }
    
    public static String modifyText(String text, String original, String word)
    {
        StringBuilder sb = new StringBuilder(text);
        if(sb.indexOf(original)==-1){
            return "-1";
        }
        else{
            int iniciParaula=sb.indexOf(original);
            int finalParaula= iniciParaula+original.length();
            sb.replace(iniciParaula, finalParaula, word);
        }
        return sb.toString();
    }
    
    public static String eraseWord(String text, String word)
    {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }
}
