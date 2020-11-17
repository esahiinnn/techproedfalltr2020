package homeworkdowhile;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya sayı girmesini söyleyin. 
		 Kullanıcı sıfır girdiğinde, ekrana o ana kadar girmiş olduğu  tüm sayıların toplamını yazdırınız. 
		 Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın
		 */

			Scanner scan = new Scanner(System.in);
			int toplam = 0;
			int i = 0;
			do {
				System.out.println("Lutfen bir sayi giriniz");
				int s = scan.nextInt();
				i=s;
				toplam +=i;
				
			}while(i!=0);
			System.out.println("Toplam = " + toplam);
			scan.close();
	}

}
