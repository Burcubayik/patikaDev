package multipleofFour;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number, sum=0;
		
		Scanner input= new Scanner(System.in);
		
		do {
		System.out.print("Bir sayý giriniz: ");
		number=input.nextInt();
			if(number%4==0) {
			sum+=number;
			}
		}while(number%2==0) ;
		
		System.out.println(sum);
			

	}

}
