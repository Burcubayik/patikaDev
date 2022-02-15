package averageCalculationInLoop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number,counter=0, total=0;
		Scanner input= new Scanner(System.in);
		
		System.out.print("Lütfen bir sayý girin:");
		number=input.nextInt();
		
		for(int i=0;i<=number;i++) {
			if(i%3==0 && i%4==0) {
				counter++;
				total+=i;
				
			}
			else continue;
		}
		System.out.println("Ortalama: "+ (total/counter));

	}

}
