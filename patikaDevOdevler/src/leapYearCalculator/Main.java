package leapYearCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int year;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Öðrenmek istediðiniz yýlý giriniz: ");
		year=input.nextInt();
		
		if(year % 4==0) {
			if(year % 100 == 0) {
				
				if(year%400==0) System.out.println(year+" Yýlý artýk yýldýr."); 
					
				else System.out.println(year+ " Yýlý artýk yýl deðildir.");
			}
			
			else System.out.println(year+" Yýlý artýk yýldýr.");
		}
		
		else System.out.println(year+ " Yýlý artýk yýl deðildir.");

	}

}
