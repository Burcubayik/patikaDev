package findHoroscope;

import java.util.Scanner;

public class FindHoroscope {

	public static void main(String[] args) {
		int birthDay, month;
		String horoscope="";
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Do�dunuz g�n� giriniz:");
		birthDay= input.nextInt();
		
		System.out.println("Do�dunuz ay� giriniz(Ocak i�in 1 vb.): ");
		month=input.nextInt();
		
		if(month==1 && birthDay<=31 && birthDay>=1) {
			if(birthDay>=1 && birthDay<22) {
				horoscope="o�lak";
			}
			else {
				horoscope="kova";
			}
		}
		
		if(month==2 && birthDay<=28 && birthDay>=1) {
			if(birthDay>=1 && birthDay<20) {
				horoscope="kova";
			}
			else {
				horoscope="bal�k";
			}
		}
		if(month==3 && birthDay<=31 && birthDay>=1) {
			if(birthDay>=1 && birthDay<21) {
				horoscope="bal�k";
			}
			else {
				horoscope="ko�";
			}
		}
		
		if(month==4 && birthDay<=30 && birthDay>=1) {
			if(birthDay>=1 && birthDay<21) {
				horoscope="ko�";
			}
			else {
				horoscope="bo�a";
			}
		}
		
		if(month==5 && birthDay<=31 && birthDay>=1) {
			if(birthDay>=1 && birthDay<22) {
				horoscope="bo�a";
			}
			else {
				horoscope="ikizler";
			}
		}
		
		if(month==6 && birthDay<=30 && birthDay>=1) {
			if(birthDay>=1 && birthDay<23) {
				horoscope="ikizler";
			}
			else {
				horoscope="yenge�";
			}
		}
		
		if(month==7 && birthDay<=31 && birthDay>=1) {
			if(birthDay>=1 && birthDay<23) {
				horoscope="yenge�";
			}
			else {
				horoscope="aslan";
			}
		}
		if(month==8 && birthDay<=31 && birthDay>=1) {
			if(birthDay>=1 && birthDay<24) {
				horoscope="aslan";
			}
		}
		if(month==9 && birthDay<=30 && birthDay>=1) {
			if(birthDay>=1 && birthDay<23) {
				horoscope="ba�ak";
			}
			else {
				horoscope="terazi";
			}
		}
		if(month==10 && birthDay<=31 && birthDay>=1) {
			if(birthDay>=1 && birthDay<23) {
				horoscope="terazi";
			}
			else {
				horoscope="akrep";
			}
		}
		if(month==11 && birthDay<=30 && birthDay>=1) {
			if(birthDay>=1 && birthDay<22) {
				horoscope="akrep";
			}
			else {
				horoscope="yay";
			}
		}
		if(month==12 && birthDay<=31 && birthDay>=1) {
			if(birthDay>=1 && birthDay<22) {
				horoscope="yay";
			}
			else {
				horoscope="o�lak";
			}
		}
		if(horoscope.equals("")) {
			System.out.println("Verilerinizi kontrol ediniz.");
		}
		else {
		System.out.println("Burcunuz: "+ horoscope);
		}

	}

}
