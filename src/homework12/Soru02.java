package homework12;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden veya sonrasından   başlayıp bitiş değerinde veya öncesinde  biten tüm çift tamsayıları ekrana yazdırın.
		 */

		
		
				Scanner scan = new Scanner(System.in);
				System.out.println("Baslangic degerini giriniz");
				int bas = scan.nextInt();
				System.out.println("Bitis degerini giriniz");
				int bit = scan.nextInt();
				
				if(bas>bit) {
					System.out.println("Baslangic degeri bitis degerinden buyuk olmamalidir.");
				}else {
					for(int i = bas; i<=bit; i++) {
						if(i%2==0) {
							System.out.print(i + " ");
						}
					}
				}
				scan.close();
	}

}
