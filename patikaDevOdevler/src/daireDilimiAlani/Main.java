package daireDilimiAlani;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int r, a;
		double daireDilimi,pi;
		pi=3.14;
		Scanner input= new Scanner(System.in);
		System.out.println("Yarýçapý giriniz: ");
		r=input.nextInt();
		System.out.println("Merkez açýnýn ölçüsünü giriniz: ");
		a=input.nextInt();
		daireDilimi=(pi*r*r*a)/360;
		System.out.println("Daire diliminin alaný: "+ daireDilimi);

	}

}
