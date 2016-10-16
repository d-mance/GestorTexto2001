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

    public static boolean search(String text, String word) {
        int pos = text.indexOf(word);
        if (pos == -1) {
            return false;
        } else {
            char t1 = ' ', t2 = ' ';
            try {
                t1 = text.charAt(pos - 1);
                t2 = text.charAt(pos + word.length());
            } catch (StringIndexOutOfBoundsException e) {

            }
            if (Character.isLetter(t1) || Character.isLetter(t2)) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static String modifyText(String text, String original, String word) {

        if (search(text, original)) {
            return text.replaceAll(original, word);
        } else {
            return "-1";
        }

    }

    public static String eraseWord(String text, String word) {
        if (search(text, word)) {
            int pos = text.indexOf(word);
            char previo='a';
            try {
                previo = text.charAt(pos - 1);
            } catch (StringIndexOutOfBoundsException e) {
                word = word + " ";
            }

            if (Character.isWhitespace(previo)) {
                word = " " + word;
            }
            String frase = text.replaceAll(word, "");

            return frase;
        } else {
            return "-1";
        }

    }
}
