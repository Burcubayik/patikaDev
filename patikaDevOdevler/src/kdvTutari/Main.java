package kdvTutari;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double tutar, result, kdvTutar;
		
		Scanner input=new Scanner(System.in);
		System.out.println("paran�z�n tutar�n� giriniz.");
		
		tutar=input.nextDouble();
		
		double kdv=(tutar<=1000)? 0.18 :0.08;
		
		kdvTutar=tutar*kdv;
		result=kdvTutar+tutar;
		
		System.out.println("KDV'siz fiyat: "+ tutar);
		System.out.println("KDV'li fiyat: "+result);
		System.out.println("KDV tutar�n�z: "+kdvTutar);
		System.out.println("KDV Oran�: "+ kdv);
		
		
	}

}
