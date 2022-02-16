package codeCracker;

import java.util.List;
import java.util.Arrays;


public class CodeCracker {
	
	private List<String> key;
	private List<String> alphabet;
	
	/**
	 * construct a codeCracker which can pass in the encryption/decryption key
	 * @param key is a String (separated by an empty space) for encrypt/decrypt to use as an reference
	 */
	public CodeCracker(String key) {
		this.key = Arrays.asList(key.split(" "));	
		this.alphabet = Arrays.asList(new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i",
                "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z"});
	}
	
	public String decrypt(String setence) {	
		return translate(setence, key, alphabet);
	}
    
	
	public String encrypt(String setence) {
		return translate(setence, alphabet, key);
	}
	
	private String translate(String setence, List<String> key, List<String> alphabet) {
		String output = "";
		for(int i=0; i<setence.length(); i++) {
			String curElement = setence.substring(i, i+1);
			int curPositionInKey = key.indexOf(curElement);
			
			if (curPositionInKey != -1) {
				output += alphabet.get(curPositionInKey);
			}

		}
		return output;
		
	}
	
	
	
	

}
