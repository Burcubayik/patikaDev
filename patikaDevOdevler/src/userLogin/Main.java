package userLogin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName, password, userNameCheck, passwordCheck, select, passwordNew;
		
		Scanner input= new Scanner(System.in);
		System.out.print("Kullanýcý adýnýzý oluþturunuz: ");
		userName=input.nextLine();
		
		System.out.print("Þifrenizi oluþturunuz: ");
		password=input.nextLine();
		
		System.out.println("Hesap oluþturuldu.");
		
		System.out.print("Kullanýcý adýnýzý giriniz: ");
		userNameCheck= input.nextLine();
		
		System.out.print("Þifrenizi giriniz: ");
		passwordCheck=input.nextLine();
		
		if(userName.equals(userNameCheck)&& password.equals(passwordCheck)) {
			System.out.println("Giriþ baþarýlý");
		}
		else {
			System.out.println("Giriþ yapýlamadý. Lütfen bilgilerinizi kontrol edin.\nParolanýzý sýfýrlamak ister misiniz?");
			select=input.nextLine();
			switch(select) {
			case "evet":
			case "Evet":
			case "EVET":
				System.out.println("Yeni þifrenizi giriniz: ");
				passwordNew=input.nextLine();
				if(password.equals(passwordNew)) {
					System.out.println("Þifre oluþturulamadý.Lütfen baþka þifre giriniz");
					passwordNew=input.nextLine();
					password=passwordNew;
					System.out.println("Þifre baþarýyla deðiþtirildi.");
				}
				else {
					password=passwordNew;
					System.out.println("Þifre baþarýyla deðiþtirildi.");
				}
			
			}
			
		}

	}

}
