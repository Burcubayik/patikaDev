package patikaDevOdevler2.flightTicketCalculation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int km,age, tripType;
		double unitPrice=0.1,total=0;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Mesafeyi km cinsinden giriniz: ");
		km= input.nextInt();
		
		System.out.print("Yaþýnýzý giriniz. ");
		age=input.nextInt();
		
		System.out.print("Yolculuk türünü giriniz (Tek Yön=1, Gidiþ-Dönüþ=2) :");
		tripType=input.nextInt();
		
		if(km<0 && age<0 && tripType!=1||tripType!=2) {
			System.out.println("Hatalý deðer girdiniz!");
		}
		else {
			total=km*unitPrice;
			if(age<12) {
				total=total-(total*0.5);
			}
			if(age>=12 &&age<=24) {
				total=total-(total*0.1);
			}
			if(age>65) {
				total=total-(total*0.3);
			}
			if(tripType==2) {
				total=total-(total*0.2);
				total=total*2;
			}
			
			System.out.println("Toplam tutar: "+ total +" TL");
			
		}
		

	}

}
