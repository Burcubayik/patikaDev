package simpleCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double number1, number2 ;
		int select;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Ýlk sayýyý giriniz: ");
		number1=input.nextDouble();
		
		System.out.print("Ýkinci sayýyý giriniz: ");
		number2=input.nextDouble();
		
		System.out.println("1-Toplama\n2-Çýkartma\n3-Çarpma\n4-Bölme");
		System.out.print("Verilen bilgilere göre yapmak istediðiniz iþlemin sayýsýný giriniz: ");
		select= input.nextInt();
		
		switch(select) {
			case 1:
				System.out.println(number1+number2);
				break;
				
			case 2:
				System.out.println(number1-number2);
				break;
			case 3:
				System.out.println(number1*number2);
				break;
			case 4:
				System.out.println(number1/number2);
				break;
			default:
				System.out.println("Yanlýþ deðer girdiniz. Lütfen tekrar deneyiniz.");
				break;

	}

}
}
