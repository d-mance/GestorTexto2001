/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestortexto2001.model;

/**
 *
 * @author dmance & jaldazabal
 * @description a simple text modifier
 * @version 1.0
 * 
 */
public class FuncionesTexto {

    
    private String text;

    public FuncionesTexto(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    
    
    /**
     * A method returning if a word is in a string
     * @param word the word to find in the text
     * @return true if word is found, false if otherwise
     */
    public boolean search( String word) {
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
            return !(Character.isLetter(t1) || Character.isLetter(t2));
        }
    }

    /**
     * A method for substitute a word in a string
     * @param original the word to substitute
     * @param word the word you want to change
     * @return A string with the string changed if success or a string with "-1" otherwise
     */
    public String modifyText( String original, String word) {

        if (this.search(original)) {
           this.text = this.text.replaceAll(original, word);
           return this.text;
        } else {
            return "-1";
        }

    }
/**
 * A method for remove a word in a given string
 * @param text the full string
 * @param word the word to remove
 * @return a string with the word removed if success or a string with "-1" otherwise
 */
    public String eraseWord(String word) {
        if (this.search( word)) {
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
            this.text = text.replaceAll(word, "");

            return this.text;
        } else {
            return "-1";
        }

    }
}
