package leapYearCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int year;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("��renmek istedi�iniz y�l� giriniz: ");
		year=input.nextInt();
		
		if(year % 4==0) {
			if(year % 100 == 0) {
				
				if(year%400==0) System.out.println(year+" Y�l� art�k y�ld�r."); 
					
				else System.out.println(year+ " Y�l� art�k y�l de�ildir.");
			}
			
			else System.out.println(year+" Y�l� art�k y�ld�r.");
		}
		
		else System.out.println(year+ " Y�l� art�k y�l de�ildir.");

	}

}
