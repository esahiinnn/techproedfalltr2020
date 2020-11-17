package day16constuctors;

import java.util.Scanner;

public class Soru {

	public static void main(String[] args) {
		/*
		 Kullanıcıya sayı girmesini söyleyin. Kullanıcı sıfır girdiğinde, ekrana o ana kadar girmiş olduğu
tüm sayıların toplamını yazdırınız.
Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın
		 */

		
				Scanner scan = new Scanner(System.in);
				int i;
				int num = 0 ;
				int girilenSayiCounter = 0;
				
				do {
					System.out.println("Bir sayi giriniz ");
					 i = scan.nextInt();
					
					num= num+i;
					girilenSayiCounter++;
				}while(i!=0);
				System.out.println("Girdiginiz sayilarin toplami " + num);
				System.out.println("Kullanici " + (girilenSayiCounter - 1) + " tane sayi girmistir ");
				scan.close();
	}

}
