package kdvTutari;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double tutar, result, kdvTutar;
		
		Scanner input=new Scanner(System.in);
		System.out.println("paranýzýn tutarýný giriniz.");
		
		tutar=input.nextDouble();
		
		double kdv=(tutar<=1000)? 0.18 :0.08;
		
		kdvTutar=tutar*kdv;
		result=kdvTutar+tutar;
		
		System.out.println("KDV'siz fiyat: "+ tutar);
		System.out.println("KDV'li fiyat: "+result);
		System.out.println("KDV tutarýnýz: "+kdvTutar);
		System.out.println("KDV Oraný: "+ kdv);
		
		
	}

}
