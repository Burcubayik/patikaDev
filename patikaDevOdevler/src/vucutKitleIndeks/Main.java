package vucutKitleIndeks;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double kilo, boy, indeks;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Kilonuzu giriniz(kg): ");
		kilo=input.nextDouble();
		
		System.out.println("Boyunuzu giriniz(m): ");
		boy=input.nextDouble();
		
		indeks=kilo/(boy*boy);
		
		System.out.println("Vücut kitle indeksiniz: "+indeks);

	}

}
