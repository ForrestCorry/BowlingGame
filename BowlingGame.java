package com.ssa.assignment;

public class BowlingGame {
		static int throwsPerFrame = 2;
		static int frames = 10;
	    static int pins = 11;
	    static int totalScore = 0;
	    

		public static void main(String[] args) {
			for (int i = 1; i <= frames; i++) {
					System.out.println("Frame " + i);
					
					for (int j = 1; j < throwsPerFrame; j++) {
				
				int throw1 = (int) (Math.random() * pins);
				
				if (throw1 == 10) {
					
					System.out.println("STRIKE!\n");
					System.out.println("Total Score = " + (totalScore + 10));
					System.out.println();
					break;
				}
				else{
					int throw2 = (int) (Math.random() * (pins - throw1));
					
					if (throw1 + throw2 == 10) {
						System.out.println("Roll 1 = " + throw1 + "\nSPARE!\n");
						System.out.println("Total Score = "+ (totalScore + 10));
						System.out.println();
						break;
					}
					else{
						System.out.print("Roll 1 =  " + throw1 + " \n");
						System.out.println("Roll 2 = " + throw2);
						System.out.println();
						
					}
					int score = (throw1 + throw2);
					totalScore = totalScore + score;
					System.out.println("Total Score = " + totalScore);
					System.out.println();
				}
			
			}
	
		}
		
		
	}
		
		
		
}
