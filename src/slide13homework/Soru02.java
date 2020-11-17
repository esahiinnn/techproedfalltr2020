package slide13homework;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve
		  başlangıç değerinden başlayıp bitiş değerinde  biten tüm tamsayıları while loop kullanarak ekrana yazdırınız.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic degerini giriniz");
		int bas = scan.nextInt();
		System.out.println("Bitis degerini giriniz");
		int bit = scan.nextInt();
		
		
		int i=bas;
		while(i<=bit) {
			System.out.print(i + " ");
			i++;
		}
		
		scan.close();
	}

}
