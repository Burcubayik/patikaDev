package activitySuggestion;

import java.util.Scanner;

public class ActivitySuggestion {

	public static void main(String[] args) {
		int heat;
		
		Scanner input= new Scanner(System.in);
		System.out.print("Uygun aktiviteleri öðrenmek için lütfen hava sýcaklýðýný giriniz: ");
		heat= input.nextInt();
		
		
		
		if(heat<5) {
			System.out.println("Kayak yapabilirsiniz");
		}
		
		if(heat>=5 && heat<=15 ) {
			System.out.println("Sinemaya gidebilirsiniz");
		}
		
		if(heat>=15 && heat<=25) {
			System.out.println("Piknik yapabilirsiniz ");
		}
		
		if(heat>25) {
			System.out.println("Yüzebilirsiniz");
		}
		
		System.out.println("Ýyi eðlenceler");

	}

}
