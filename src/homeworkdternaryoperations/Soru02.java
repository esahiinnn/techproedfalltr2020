package homeworkdternaryoperations;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan iki tamsayı girmesini isteyin, 
		 ekrana her zaman büyük olanını yazdırın
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki tam sayi giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println( a>b ? a : b);
		scan.close();
	}

}
