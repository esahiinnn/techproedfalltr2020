package homeworknestedternary;

import java.util.Scanner;

public class TernarySoru01 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir tamsayı alın eğer tamsayı 0 dan kucuk ise ekrana “Negatif” yazdırın.
Diğer durumlarda ekrana “Negatif degil” yazdırın.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayi giriniz");
		int a = scan.nextInt();
		String result = a<0 ?" Negatif" : "Negatif degil";
		System.out.println(result);
		scan.close();
	}

}
