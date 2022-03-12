package behruz;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ededi daxil edin: ");
		int number = scanner.nextInt();

		int min = 9;
		int max = 0;

		while (number > 0) {
			
			int mod = number % 10;
			
			if (max < mod) {
				max = mod;

			}
			if (min > mod) {
				min = mod;
			}
			number = number / 10;

		}

		System.out.println("en boyuk reqem " + max);
		System.out.println("en kicik reqem " + min);

	}
	
}
