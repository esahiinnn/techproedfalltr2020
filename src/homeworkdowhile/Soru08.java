package homeworkdowhile;

import java.util.Scanner;

public class Soru08 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan iki sayı alın bu sayılar eşit ise ekrana “Eşit”, birinci sayı büyük ise ekrana “Birinci sayı büyük”, ikinci sayı büyük ise ekrana “Ikinci sayı büyük” yazdırınız.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz");
		int a = scan.nextInt();
		System.out.println("Ikinci sayiyi giriniz");
		int b = scan.nextInt();
				
			esit(a,b);
		
		scan.close();
	}

	
	
		public static void esit(int a, int b) {
			if(a==b) {
				System.out.println("Esit");
			}else if(a>b) {
				System.out.println("Birinci sayi buyuk");
			}else {
				System.out.println("Ikinci sayi buyuk");
			}
			
		}
}
