package manavKasa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double armut=2.14, elma=3.67, domates=1.11, muz=0.95,patlican=5.00, toplam;
		int armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Armut ka� kilo? ");
		armutKilo=input.nextInt();
		
		System.out.print("Elma ka� kilo? ");
		elmaKilo=input.nextInt();
		
		System.out.print("Domates ka� kilo? ");
		domatesKilo=input.nextInt();
		
		System.out.print("Muz ka� kilo? ");
		muzKilo=input.nextInt();
		
		System.out.print("Patl�can ka� kilo? ");
		patlicanKilo=input.nextInt();
		
		toplam= (armut*armutKilo)+ (elma*elmaKilo) + (domates*domatesKilo) + (muz* muzKilo) + (patlican*patlicanKilo);
		
		System.out.print("Toplam tutar: " + toplam+ " TL");

	}

}
