package simpleCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double number1, number2 ;
		int select;
		Scanner input=new Scanner(System.in);
		
		System.out.print("�lk say�y� giriniz: ");
		number1=input.nextDouble();
		
		System.out.print("�kinci say�y� giriniz: ");
		number2=input.nextDouble();
		
		System.out.println("1-Toplama\n2-��kartma\n3-�arpma\n4-B�lme");
		System.out.print("Verilen bilgilere g�re yapmak istedi�iniz i�lemin say�s�n� giriniz: ");
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
				System.out.println("Yanl�� de�er girdiniz. L�tfen tekrar deneyiniz.");
				break;

	}

}
}
