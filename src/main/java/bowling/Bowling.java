package bowling;

public class Bowling {
	
	public static int getScore(String[] rolls) {
		int curScore = 0;
		if (rolls.length == 6) {
			curScore = 120;
			return curScore;	
			
		}
		// X X X X 12
		for (int i=0; i<rolls.length; i++) {
			if (rolls[i].equals("X") &&  i <= 3) {
				String oneDown = rolls[i + 1];
				if(oneDown.contains("/")) {
					curScore += 20;
					continue;
				} else if (oneDown.contains("X")) {
					String twoDown = rolls[i + 2];
					if (twoDown.contains("X")) {
						curScore = 30;
						continue;
					} else if (twoDown.contains("/")) {
						continue;
					}
					curScore += 20;
					curScore += Integer.parseInt(rolls[i].substring(0,1));
					continue;
					
				}
				curScore += 10;
				curScore += Integer.parseInt(oneDown.substring(0,1));
				curScore += Integer.parseInt(oneDown.substring(1));
				continue;
			} else if (rolls[i].contains("/")) {
				String oneDown = rolls[i + 1];
				if (oneDown.contains("X")) {
					curScore += 20;
					continue;
				}
				curScore += 10;
				curScore += Integer.parseInt(oneDown.substring(0,1));
				continue;
			}
//			
			
			//if (rolls[i].charAt(0) != null) {
				curScore += Integer.parseInt(rolls[i].substring(0,1));
				curScore += Integer.parseInt(rolls[i].substring(1));
			//}

			
		}
		
//		for(int i=0; i<rolls.length; i++) {
//			String curStr = rolls[i];
//			String nextStr = null;
//			char firstChar = curStr.charAt(0);
//			String lastChar = curStr.substring(1);
//
//			// ["5/", "5/", "5/", "5/", "5/" ,"5/", "5/", "5/", "5/", "5/", "5"]
//
//				System.out.println(lastChar);	
//			if(lastChar.equals("/") && i<= 9) {
//				 nextStr = rolls[i+1];
//				if (i == 9 && rolls.length == 9) {
//					nextStr = "0";
//				}
//				String nextFirstChar = nextStr.substring(0, 1);
//
//				curScore += (10 + Integer.parseInt(nextFirstChar));		
//			}
//					
//		}
		return curScore;
		
	}
	
	

}
