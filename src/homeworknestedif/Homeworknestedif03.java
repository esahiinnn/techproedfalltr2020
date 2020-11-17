package homeworknestedif;

import java.util.Scanner;

public class Homeworknestedif03 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan password girmesini isteyin.
Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("5 harfli bir password giriniz");
			int a = scan.nextInt();
			if(a%5 == 0) {
				if(a%10 == 0) {
					System.out.println("5'e bolunen cift sayi");
				}else {
					System.out.println("5 e bolunen tek sayi");
				}
			}else {
				if(a%5!=0) {
					System.out.println("Tekrar deneyin pls");
				}
			}
			scan.close();
	}

}
