package pratikNotOrtalamasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int maths, physics, chemistry, turkish, history,music;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Matematik notunuzu giriniz: ");
		maths=input.nextInt();
		
		System.out.print("Fizik notunuzu giriniz: ");
		physics=input.nextInt();
		
		System.out.print("Kimya notunuzu giriniz: ");
		chemistry=input.nextInt();
		
		System.out.print("T�rk�e notunuzu giriniz: ");
		turkish=input.nextInt();
		
		System.out.print("Tarih notunuzu giriniz: ");
		history=input.nextInt();
		
		System.out.print("M�zik notunuzu giriniz: ");
		music=input.nextInt();
		
		int sum=(maths+physics+chemistry+turkish+history+music);
		double result= sum/6;
		
		System.out.println("Ortalaman�z: "+result);
		
		String str=(result>60)?"ge�ti":"kald�";
		System.out.println(str);

	}

}
