/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorTexto2001Test;

import gestortexto2001.model.FuncionesTexto;
import java.util.Arrays;
import java.util.Collection;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author jaldazabal
 */

@RunWith(value=Parameterized.class)
public class GestorTexto2001Test {
    
    @Parameters
    public static Collection<Object[]> getData(){
        return Arrays.asList(new Object[][]{
            {"El murcielago come bayas","come","caga",true,"El murcielago caga bayas","El murcielago  bayas"},
            {"El murcielago come bayas","com","caga",false,"-1","-1"},
            {"El murcielago come bayas","asdas","caga",false,"-1","-1"},
            {"El murcielago come bayas","bayas","frutos",true,"El murcielago come frutos","El murcielago come "},
            {"El murcielago come bayas","El","Un",true,"Un murcielago come bayas"," murcielago come bayas"},
        });
    }
    
    private String text;
    private String originalWord;
    private String word;
    private boolean expectedSearch;
    private String expectedModifyText;
    private String expectedEraseWord;
    public GestorTexto2001Test(String text, String originalWord, String word, boolean expectedSearch, String expectedModifyText, String expectedEraseWord) {
        this.text=text;
        this.originalWord=originalWord;
        this.word=word;
        this.expectedSearch=expectedSearch;
        this.expectedModifyText=expectedModifyText;
        this.expectedEraseWord=expectedEraseWord;
    }
    
    FuncionesTexto texto;
    
    @Before
    public void before(){
        texto= new FuncionesTexto();
    }
    
    @Test
    public void searchTest(){
        assertEquals(expectedSearch,texto.search(text, originalWord));
    }
    
    @Test
    public void modifyTextTest(){
        assertEquals(expectedModifyText,texto.modifyText(text, originalWord, word));
    }
    
    @Test
    public void eraseWordTest(){
        assertEquals(expectedEraseWord,texto.eraseWord(text, originalWord));
    }
    
}
