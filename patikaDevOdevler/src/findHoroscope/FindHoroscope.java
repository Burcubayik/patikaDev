package findHoroscope;

import java.util.Scanner;

public class FindHoroscope {

	public static void main(String[] args) {
		int birthDay, month;
		String horoscope="";
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Doðdunuz günü giriniz:");
		birthDay= input.nextInt();
		
		System.out.println("Doðdunuz ayý giriniz(Ocak için 1 vb.): ");
		month=input.nextInt();
		
		if(month==1 && birthDay<=31 && birthDay>=1) {
			if(birthDay>=1 && birthDay<22) {
				horoscope="oðlak";
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
				horoscope="balýk";
			}
		}
		if(month==3 && birthDay<=31 && birthDay>=1) {
			if(birthDay>=1 && birthDay<21) {
				horoscope="balýk";
			}
			else {
				horoscope="koç";
			}
		}
		
		if(month==4 && birthDay<=30 && birthDay>=1) {
			if(birthDay>=1 && birthDay<21) {
				horoscope="koç";
			}
			else {
				horoscope="boða";
			}
		}
		
		if(month==5 && birthDay<=31 && birthDay>=1) {
			if(birthDay>=1 && birthDay<22) {
				horoscope="boða";
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
				horoscope="yengeç";
			}
		}
		
		if(month==7 && birthDay<=31 && birthDay>=1) {
			if(birthDay>=1 && birthDay<23) {
				horoscope="yengeç";
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
				horoscope="baþak";
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
				horoscope="oðlak";
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
