package dikUcgenHipotenusHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int dikKenar1, dikKenar2, karelerToplamı;
		double hipotenus, sonuc;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Kenarlardan birini giriniz: "); 
		dikKenar1=input.nextInt();
		System.out.println("Diğer kenarı giriniz: ");
		dikKenar2= input.nextInt();
		
		karelerToplamı= (dikKenar1*dikKenar1)+ (dikKenar2*dikKenar2);
		sonuc= Math.sqrt(karelerToplamı);
		System.out.println(sonuc);

				
	}

}
