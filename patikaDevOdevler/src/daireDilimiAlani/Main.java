package daireDilimiAlani;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int r, a;
		double daireDilimi,pi;
		pi=3.14;
		Scanner input= new Scanner(System.in);
		System.out.println("Yar��ap� giriniz: ");
		r=input.nextInt();
		System.out.println("Merkez a��n�n �l��s�n� giriniz: ");
		a=input.nextInt();
		daireDilimi=(pi*r*r*a)/360;
		System.out.println("Daire diliminin alan�: "+ daireDilimi);

	}

}
