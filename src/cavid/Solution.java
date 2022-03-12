package cavid;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Series ve Number daxil edin: ");
		String seriesNumber = scanner.next();

		IdCard idCard = new IdCard();
		idCard.series = "";
		String number = "";

		for (int i = 0; i < seriesNumber.length(); i++) {

			char charAtIndex = seriesNumber.charAt(i);

			if (Character.isDigit(charAtIndex)) {
				number += charAtIndex;

			} else {
				
				idCard.series += charAtIndex;

			}

		}
		
		idCard.number = Integer.parseInt(number);

		System.out.println(idCard.series);
		System.out.println(idCard.number);

	}
}
