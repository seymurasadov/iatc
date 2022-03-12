package firdovsi;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args)
    {
		
		int say = 0;
		
		String s = "!Menim adim/? Firdovsidir";
		
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
                + "character var."); 
	    }
    }