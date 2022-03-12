package behruz;

import java.util.Scanner;

//Hell yolu duzgundur, yalniz integer ile isleyir, boyuk eded yazdiqda exception atir
//classin adi boyuk herf
public class sual4 {

	//codelari format edib seliqeli sekle salmaq lazimdir
	public static void main(String[] args) {
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Ededi daxil edin: ");
			
			//deyisken adi ingilis dilinde
			int sayi=scanner.nextInt();
			
			int smallesDigit=9;
			int largeDigit=0;
			
			//her defe 10 a qaligi hesablamagdansa
			//br defe hesablayib temporary deyiskende tutmag lazimdir.
			while(sayi>0) {
				if(largeDigit<sayi%10) {
					largeDigit=sayi%10;
					
				} if(smallesDigit>sayi%10) {
					smallesDigit=sayi%10;
				}
				sayi=sayi/10;
				
			}
		
			System.out.println("en boyuk reqem "+largeDigit);
			System.out.println("en kicik reqem "+ smallesDigit);
		
		
	}
}

