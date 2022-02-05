package dikUcgenHipotenusHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int dikKenar1, dikKenar2, karelerToplamý;
		double hipotenus, sonuc;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Kenarlardan birini giriniz: "); 
		dikKenar1=input.nextInt();
		System.out.println("Diðer kenarý giriniz: ");
		dikKenar2= input.nextInt();
		
		karelerToplamý= (dikKenar1*dikKenar1)+ (dikKenar2*dikKenar2);
		sonuc= Math.sqrt(karelerToplamý);
		System.out.println(sonuc);

				
	}

}
