package ucgenAlani;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//��genin kenarlar� a,b,c olsun.
		int a,b,c, u;
		double alan;
		
		Scanner input= new Scanner(System.in);
		System.out.println("L�tfen kenarlar� giriniz");
		
		System.out.print("1.Kenar: ");
		a= input.nextInt();
		
		System.out.print("2. Kenar: ");
		b=input.nextInt();
		
		System.out.print("3. Kenar: ");
		c=input.nextInt();
		
		u=(a+b+c)/2;
		
		alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		System.out.println("��genin alan�: "+ alan);
				
		
	}

}
