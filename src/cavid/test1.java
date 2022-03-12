package cavid;

import java.util.Scanner;

//class adi boyuk herfle baslamalidir
public class test1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Series ve Number daxil edin: ");
		//bu pin deyil, id cardin seriesNumberidir
		String pin = scanner.next();

		//human ?
		IdCard human = new IdCard();
		
		for (int i = 0; i < pin.length(); i++) {

			// not isDigit yoxlamisan, amma isDigit yoxlayib
			//sonra eksini else salmaq olar
			
			if (!Character.isDigit(pin.charAt(i))) {
				//duz isleyir amma her defe substring edib
				//human.series deyisdirmeye ehtiyac yoxdur
				String alphaAndSymbol = pin.substring(0, i + 1);
				human.series = alphaAndSymbol;

			} else {
				//forun icinde her defe replace all etmek duzgun deyil
				//for loop varsa ya bir-bir elave etmelisen
				//replace etmek isteyirsense hec fora ehtiyac yoxdur
			String st2=pin.replaceAll("[^0-9]", "");
				
				int num = Integer.parseInt(st2);
				human.number = num;
				}

		}

		System.out.println(human.series);
		System.out.println(human.number);


	}
}

