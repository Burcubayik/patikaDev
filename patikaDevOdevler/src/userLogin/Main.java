package userLogin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName, password, userNameCheck, passwordCheck, select, passwordNew;
		
		Scanner input= new Scanner(System.in);
		System.out.print("Kullan�c� ad�n�z� olu�turunuz: ");
		userName=input.nextLine();
		
		System.out.print("�ifrenizi olu�turunuz: ");
		password=input.nextLine();
		
		System.out.println("Hesap olu�turuldu.");
		
		System.out.print("Kullan�c� ad�n�z� giriniz: ");
		userNameCheck= input.nextLine();
		
		System.out.print("�ifrenizi giriniz: ");
		passwordCheck=input.nextLine();
		
		if(userName.equals(userNameCheck)&& password.equals(passwordCheck)) {
			System.out.println("Giri� ba�ar�l�");
		}
		else {
			System.out.println("Giri� yap�lamad�. L�tfen bilgilerinizi kontrol edin.\nParolan�z� s�f�rlamak ister misiniz?");
			select=input.nextLine();
			switch(select) {
			case "evet":
			case "Evet":
			case "EVET":
				System.out.println("Yeni �ifrenizi giriniz: ");
				passwordNew=input.nextLine();
				if(password.equals(passwordNew)) {
					System.out.println("�ifre olu�turulamad�.L�tfen ba�ka �ifre giriniz");
					passwordNew=input.nextLine();
					password=passwordNew;
					System.out.println("�ifre ba�ar�yla de�i�tirildi.");
				}
				else {
					password=passwordNew;
					System.out.println("�ifre ba�ar�yla de�i�tirildi.");
				}
			
			}
			
		}

	}

}
