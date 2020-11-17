package homeworkswitch;

import java.util.Scanner;

public class Swith02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın. 
		 “b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.
		  Bu harflerin dışında bir character için “Geçersiz character” yazdırın
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("bir harf giriniz");
			char a = scan.next().toLowerCase().charAt(0);
			
			switch (a) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Sesli harf");
				break;
			case 'b':
			case 'c':
			case 'd':
			case 'f':
			System.out.println("Sessiz harf");
			break;
			default :		
			System.out.println("gecersiz character");
			scan.close();
			}
			
	}

}
