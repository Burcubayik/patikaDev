package pratikNotOrtalamasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double maths, physics, chemistry, turkish, history,music;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Matematik notunuzu giriniz: ");
		maths=input.nextDouble();
		
		System.out.print("Fizik notunuzu giriniz: ");
		physics=input.nextDouble();
		
		System.out.print("Kimya notunuzu giriniz: ");
		chemistry=input.nextDouble();
		
		System.out.print("T�rk�e notunuzu giriniz: ");
		turkish=input.nextDouble();
		
		System.out.print("Tarih notunuzu giriniz: ");
		history=input.nextDouble();
		
		System.out.print("M�zik notunuzu giriniz: ");
		music=input.nextDouble();
		
		double sum=(maths+physics+chemistry+turkish+history+music);
		double result= sum/6;
		
		System.out.println("Ortalaman�z: "+result);
		
		String str=(result>60)?"ge�ti":"kald�";
		System.out.println(str);

	}

}
