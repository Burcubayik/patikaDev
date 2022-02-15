package chineseZodiacCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int birthDate,chineseZodiac;
		String message,chineseZodiacSign="";
		message="Çin Zodyaðý Burcunuz: ";
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Doðum yýlýnýzý giriniz: ");
		birthDate=input.nextInt();
		
		chineseZodiac= birthDate%12;
		switch(chineseZodiac) {
			case 0:
				chineseZodiacSign="Maymun";
				break;
			case 1:
				chineseZodiacSign="Horoz";
				break;
			case 2:
				chineseZodiacSign="Köpek";
				break;
			case 3:
				chineseZodiacSign="Domuz";
				break;
			case 4:
				chineseZodiacSign="Fare";
				break;
			case 5:
				chineseZodiacSign="Öküz";
				break;
			case 6:
				chineseZodiacSign="Kaplan";
				break;
			case 7:
				chineseZodiacSign="Tavþan";
				break;
			case 8:
				chineseZodiacSign="Ejderha";
				break;
			case 9:
				chineseZodiacSign="Yýlan";
				break;
			case 10:
				chineseZodiacSign="At";
				break;
			case 11:
				chineseZodiacSign="Koyun";
				break;
			
		}
		
		System.out.println(message + chineseZodiacSign);
		
		

	}

}
