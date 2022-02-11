package notOrtalamasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int maths, physics, chemistry, turkish,music, total=0;
		double average;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Matematik notunuzu giriniz: ");
		maths=input.nextInt();
		
		if(maths>=0 && maths<=100) {
			
			total+=maths;
		}
		
		System.out.print("Fizik notunuzu giriniz: ");
		physics=input.nextInt();

		if(physics>=0 && physics<=100) {
			
			total+=physics;
		}
		
		System.out.print("Kimya notunuzu giriniz: ");
		chemistry=input.nextInt();
		
		if(chemistry>=0 && chemistry<=100) {
			
			total+=chemistry;
		}
		
		
		System.out.print("Türkçe notunuzu giriniz: ");
		turkish=input.nextInt();
		
		if(turkish>=0 && turkish<=100) {
			
			total+=turkish;
		}
		
		
		System.out.print("Müzik notunuzu giriniz: ");
		music=input.nextInt();
		
		if(music>=0 && music<=100) {
			
			total+=music;
		}
		
		average= total/5;
		if(average>=55) {
			System.out.println("Tebrikler geçtiniz!\nOrtalamanýz: "+ average);
		}
		else {
			System.out.println("Maalesef kaldýnýz!\nOrtalamanýz: "+ average);
			
		}
		
		
		
		
		}
		
	}


