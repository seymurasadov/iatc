package firdovsi;

import java.util.Scanner;

public class Ders5 {
	
	public static void main(String[] args)
    {
		
		int say = 0;
		
		Scanner word = new Scanner(System.in);
		
		System.out.println("Sozu daxil edin");
		
		String s = word.next();
		
		for (int i = 0; i < s.length(); i++) {
			

			
			
			
			if (!Character.isDigit(s.charAt(i))
	                && !Character.isLetter(s.charAt(i))
	                && !Character.isWhitespace(s.charAt(i))) {
				
				say++;

			}
			
		}
		
		if (say == 0)
			
			System.out.println("Simvol tapilmadi.");	
		else 
			System.out.println("Sozde simvol tapildi\n" + say + " "
	                + "Eded simvol var.");
		
		System.out.println(s.length()+ " "
                + "Eded character var."); 
	    }
	
    }
