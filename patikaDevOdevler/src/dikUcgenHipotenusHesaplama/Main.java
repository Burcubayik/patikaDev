package dikUcgenHipotenusHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int dikKenar1, dikKenar2, karelerToplam�;
		double hipotenus, sonuc;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Kenarlardan birini giriniz: "); 
		dikKenar1=input.nextInt();
		System.out.println("Di�er kenar� giriniz: ");
		dikKenar2= input.nextInt();
		
		karelerToplam�= (dikKenar1*dikKenar1)+ (dikKenar2*dikKenar2);
		sonuc= Math.sqrt(karelerToplam�);
		System.out.println(sonuc);

				
	}

}
