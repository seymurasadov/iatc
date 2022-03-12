package teymur;

import java.util.Scanner;

public class SimpleInt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Interval from : ");
		int intervalStart = scan.nextInt();
		System.out.println("Interval until : ");
		int intervalEnd = scan.nextInt();

		if (intervalStart < 0 || intervalEnd > 100) {
			System.out.println("change interval");
			//bu cox tehlukeli bir sheydir, stackda eyni metod yigilib qalacaq bir nece defe
			//bele ki, onsuz da cixmag istediyin main metodu yene isleyecek.
			//bunun en yaxsi yolu while ile etmekdir
			SimpleInt.main(args);
		}

		
		//mentiq duz gelir, amma 0-dan ancaq 100 arasi isleyecek.
		//0-dan 1000 arasi islemez
		for (int i = intervalStart; i <= intervalEnd; i++) {
			
			//count ise yaramir
			//cunki eyni onluqda iki sade eded lazimdir, eger varsa
			//indi ise 1 dene de cixir 2 de 3 de 
			int count = 0;
			
			//teklikleri de umumi qaydada yoxlamag olar
			if (i == 2 || i == 3 || i == 5 || i == 7) {
				System.out.println(i);
				count++;

			}
			
			//sade ededi bu qaydada yoxlamag duzgun deyil
			//ancaq 0 100 arasi ise yarayir
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
				System.out.println(i);
				count++;

			}
			
			if (count == 2) {
				break;
			}
		}
	}

}
