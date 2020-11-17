package homeworkif;

import java.util.Scanner;

public class Homeworkifelse01 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir tamsayı alın eğer tamsayı 10 dan kucuk ve 0’dan büyük eşit ise ekrana  “Rakam” yazdırın. 
		 Diğer durumlarda ekrana “Sayı” yazdırın.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayi giriniz");
		int a = scan.nextInt();
		if(a<=10 ) {
			System.out.println("Rakam");
		}else {
			System.out.println("Sayi");
		}
		scan.close();
	}

}
