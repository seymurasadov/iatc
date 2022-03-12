package behruz;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ededi daxil edin: ");
		
		String numberStr = scanner.next();
		
		int min = 9;
		int max = 0;
		
		for(int i = 0; i < numberStr.length(); i++) {
			char c = numberStr.charAt(i);
			int digit = Integer.parseInt(String.valueOf(c));
			
			if (max < digit) {
				max = digit;

			}
			if (min > digit) {
				min = digit;
			}			
		}
		
		System.out.println("en boyuk reqem " + max);
		System.out.println("en kicik reqem " + min);
	}
}
