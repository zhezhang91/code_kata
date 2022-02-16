package bowling;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.echocat.kata.java.part1.FizzBuzz;
import org.junit.Test;

public class BowlingTest {
	
    @Test
    public void simpleBowlingTest() {
    	 String[] score = {"23", "23", "23", "24"};
        assertThat(Bowling.getScore(score), is(21));
    }
    
    @Test
    public void simpleBowlingTestWithX() {
    	 String[] score = {"23", "23", "X", "24"};
        assertThat(Bowling.getScore(score), is(32));
    }
    
    @Test
    public void simpleBowlingTestWithForwardSlash() {
    	 String[] score = {"23", "2/", "32", "24"};
        assertThat(Bowling.getScore(score), is(29));
    }
    
    @Test
    public void bowlingTestWithXAndForwardSlash() {
    	 String[] score = {"23", "2/", "X", "24"};
        assertThat(Bowling.getScore(score), is(47));
    }
    @Test
    public void bowlingTestWithForwardSlashAndX() {
    	 String[] score = {"23", "X", "2/", "24"};
        assertThat(Bowling.getScore(score), is(43));
    }
//    @Test
    public void bowlingTestWithAllXEndingInNonX() {
    	 String[] score = { "X","X","X","X","12"};
        assertThat(Bowling.getScore(score), is(94));
    }
//    
//    @Test
    public void bowlingTestWithAllXEndingInX() {
    	 String[] score = { "X","X","X","X","X","X"};
        assertThat(Bowling.getScore(score), is(120));
    }
   
    /*
     * 	if (i == 3) {
				String oneDown = rolls[i + 1];
				String twoDown = rolls[i + 1];
				if (rolls[i+3].contains("X")) {
					if (oneDown.contains("X") && twoDown.contains("X")) {
						curScore = 30;
						break;
					}
				}
			}
     */

}
