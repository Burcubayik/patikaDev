package numberSorting;

import java.util.Scanner;

public class NumberSorting {

	public static void main(String[] args) {
		int number1,number2,number3,biggest ;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz: ");
		number1=input.nextInt();
		
		System.out.print("İkinci sayıyı giriniz: ");
		number2=input.nextInt();
		
		System.out.print("Üçüncü sayıyı giriniz: ");
		number3=input.nextInt();
		
		
		
		if(number1>number2 && number1>number3) {
			
			if(number2>number3) System.out.println(number1+" > "+number2+" > "+number3);
			
			else System.out.println(number1+" > "+number3+" > "+number2);
			
		}
		
		
		if(number2>number1 && number2>number3) {
			
			if(number1>number3) System.out.println(number2+" > "+number1+" > "+number3);
			
			else System.out.println(number2+" > "+number3+" > "+number1);
			
		}
		
		if(number3>number2 && number3>number1) {
			
			if(number2>number1) System.out.println(number3+" > "+number2+" > "+number1);
			
			else System.out.println(number3+" > "+number1+" > "+number2);
			
		}
		

	}

}
