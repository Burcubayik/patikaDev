package combinationCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,r, nFactorial=1, rFactorial=1, nrFactorial=1, combination;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("n: ");
		n=input.nextInt();
		
		System.out.print("r: ");
		r=input.nextInt();
		
		for(int i=1; i<=n ;i++) {
			
			nFactorial*=i;
		}
		for(int i=1; i<=r ;i++) {
			
			rFactorial*=i;
		}
		for(int i=1; i<=(n-r) ;i++) {
			
			nrFactorial*=i;
		}
		
		combination= nFactorial/(rFactorial*nrFactorial);
		
		System.out.println("C("+n+","+r+") = "+ combination);
		

	}

}
