package armstrongNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int number, numberOfDigits=0, tempNumber, result=0, digitValue, digitPow;
		System.out.print("Say� giriniz: ");
		number=input.nextInt();
		tempNumber=number;
		while(tempNumber!=0) {
			tempNumber/=10;
			numberOfDigits++;
			
		}
		tempNumber=number;
		
		while(tempNumber!=0) {
			digitValue=tempNumber%10;
			digitPow=1;
			for(int i=1;i<=numberOfDigits;i++) {
				digitPow*=digitValue;
			}
			result+=digitPow;
			tempNumber/=10;
		}
		
		if(result==number) {
			System.out.println(number+" say�s� armstrong say�d�r.");
		}
		else System.out.println(number+" say�s� armstrong say� de�ildir.");
	
		

	}

}
