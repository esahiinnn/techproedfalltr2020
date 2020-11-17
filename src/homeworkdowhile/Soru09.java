package homeworkdowhile;

import java.util.Scanner;

public class Soru09 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya sayı girmesini söyleyin. Kullanıcının girdiği sayının rakamları toplamını ekrana  yazdıran bir program yazın.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int s = scan.nextInt();
		rakamtoplami(s);
		scan.close();
	}

		public static void rakamtoplami(int a) {
			int toplam = 0;
			int q = 0;
			
			while(a!=0) {
				toplam = a%10 + toplam;
				a = a/10;
				q++;
			}
			System.out.println("Basamak toplami  " + toplam);
			
		}
}
