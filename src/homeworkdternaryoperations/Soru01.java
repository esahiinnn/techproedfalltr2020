package homeworkdternaryoperations;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir tamsayı girmesini isteyin, 
		 tamsayi cift ise ekrana “Cift” tek ise ekrana “Tek” yazdirin
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("tam sayi giriniz");
			int a = scan.nextInt();
			String result = a%2 == 0 ? "Cift" : "Tek";
			System.out.println(result);
			scan.close();
	}

}
