package org.echocat.kata.java.part1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
    	    	
        assertThat(FizzBuzz.getFizzBuzz(), is("1\n"
        		+ "2\n"
        		+ "Fizz\n"
        		+ "4\n"
        		+ "Buzz\n"
        		+ "Fizz\n"
        		+ "7\n"
        		+ "8\n"
        		+ "Fizz\n"
        		+ "Buzz\n"
        		+ "11\n"
        		+ "Fizz\n"
        		+ "13\n"
        		+ "14\n"
        		+ "FizzBuzz\n"
        		+ "16\n"
        		+ "17\n"
        		+ "Fizz\n"
        		+ "19\n"));
    }
    
    

}