package org.echocat.kata.java.part1;

public class FizzBuzz {
	
    public static String getFizzBuzz() {
    	String fizzBuzz = "";
    	for (int i = 1; i < 20; i ++) {
    		if ( (i % 3 == 0) && (i % 5  == 0) ) {
    			fizzBuzz += "FizzBuzz\n";
    		} else if (i % 3 == 0) {
    			fizzBuzz += "Fizz\n";
    		} else if (i % 5 == 0) {
    			fizzBuzz += "Buzz\n";
    			
    		}  else {
    			fizzBuzz += i;
    			fizzBuzz += "\n";
    		}
    	}
    	
    	System.out.println(fizzBuzz);
        return fizzBuzz;
    }

    protected static String getHelloWorldText() {
        return "Hello world!";
    }

}
