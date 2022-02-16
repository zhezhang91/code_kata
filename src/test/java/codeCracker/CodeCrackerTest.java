package codeCracker;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.echocat.kata.java.part1.FizzBuzz;
import org.junit.Test;

public class CodeCrackerTest {
	
    @Test
    public void testDecryptionEmpty() {
    	String output = "";
    	assertEquals("", new CodeCracker("").decrypt(""));
    }
    
    @Test
    public void testDecryptionSameLetter() {
    	String output = "a";
        assertThat(output, is(new CodeCracker("a").decrypt("a")));
    }
    
    @Test
    public void testDecryptionTwoLetters() {
    	String output = "ab";
        assertThat(output, is(new CodeCracker("b c").decrypt("bc")));
    }
    
    @Test
    public void testDecryptionSpecialLetters() {
    	String output = "caitlin";
        assertThat(output, is(new CodeCracker("b c d e f g h i j k l m n o p q r s t u \" +\r\n"
        		+ "                \"v w x y z a").decrypt("dbjumjo")));
    }
    
    @Test
    public void testEncryptEmptyMessage() {
       assertEquals("", new CodeCracker("").encrypt(""));
    }

    @Test
    public void testEncryptionKeySame() {
        assertEquals("a", new CodeCracker("a").encrypt("a"));
    }

    @Test
    public void testEncryptionKeyOneOverSingleLetter() {
        assertEquals("b", new CodeCracker("b").encrypt("a"));
    }

    @Test
    public void testEncryptionKeyOneOverTwoLetters() {
       assertEquals("bc", new CodeCracker("b c").encrypt("ab"));
    }

    @Test
    public void testEncryptionKeyWholeAlphabet() {
     assertEquals("dbjumjo", new CodeCracker("b c d e f g h i j k l m n o p q r s t u " +
                "v w x y z a").encrypt("caitlin"));
    }
    

}
