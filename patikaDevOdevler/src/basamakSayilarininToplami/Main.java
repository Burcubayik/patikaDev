package basamakSayilarininToplami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number, result=0, digitValue;
		System.out.println("Sayý giriniz: ");
		number=input.nextInt();
		
		while(number!=0) {
			digitValue=number%10;
			result+=digitValue;
			number/=10;
		}
		System.out.println(result);
		

	}

}
