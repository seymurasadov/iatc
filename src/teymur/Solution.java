package teymur;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int intervalStart;
		int intervalEnd;
		
		while (true) {
			
			System.out.println("Interval from : ");
			intervalStart = scan.nextInt();
			
			System.out.println("Interval until : ");
			intervalEnd = scan.nextInt();

			if (intervalStart < 0 || intervalEnd > 1000) {
				System.out.println("change interval");
			} else {
				break;
			}
		}
		
		// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 
		
		int counter = 0;
		int lastSimpleNumber = 0;
		
		for (int i = intervalStart; i <= intervalEnd; i++) {
						
			boolean simple = true;
					
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					simple = false;
					break;
				}
			}
			
			if(simple) {
				
				if(counter == 1) {
					if(lastSimpleNumber != 0 && i / 10 == lastSimpleNumber / 10) {
						System.out.println(lastSimpleNumber +" - "+i);
						i = ((i + 9) / 10) * 10;
						counter = 0;
					}else {
						lastSimpleNumber = i;
					}
					
				}else {
					
					lastSimpleNumber = i;
					counter++;
				}
			}

		}

	}
}
