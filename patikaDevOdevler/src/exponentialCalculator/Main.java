package exponentialCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,k, total=1;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Üssü alýnacak sayýyý giriniz: ");
		n=input.nextInt();
		
		System.out.print("Üssü giriniz: ");
		k=input.nextInt();
		
		for(int i=0; i<k; i++) {
			total*=n;
		}
		 System.out.println(total);

	}

}
