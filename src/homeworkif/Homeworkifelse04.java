package homeworkif;

import java.util.Scanner;

public class Homeworkifelse04 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın.
		   Diğer durumlarda ekrana “Harf değil” yazdırın.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir character giriniz");
		char a = scan.next().charAt(0);
		if((a>='a' && a<='z') || (a>='A' && a<='Z')) {
			System.out.println("harf");
		}else {
			System.out.println("harf degil");
		}
		scan.close();
		
	}

}
