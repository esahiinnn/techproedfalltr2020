package slide13homework;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde  biten tüm tamsayıların toplamını ekrana yazdırın
		 */

		
		
				Scanner scan = new Scanner(System.in);
				System.out.println("Baslangic degerini giriniz");
				int bas = scan.nextInt();
				System.out.println("Bitis degerini giriniz");
				int bit = scan.nextInt();
				
				int toplam=0;
				
				int i=bas;
				while(i<=bit) {
					toplam += i;
					i++;
				}
				System.out.println("Toplam : " + toplam);
				scan.close();
	}

}
