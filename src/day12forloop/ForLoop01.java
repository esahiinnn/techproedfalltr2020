package day12forloop;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		/*
		  Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
		  biten tüm tamsayıları ekrana yazdırın.
		 */
		

		
			Scanner scan = new Scanner(System.in);
			System.out.println("Baslangic degerini giriniz");
			int bas = scan.nextInt();
			System.out.println("Bitis degerini giriniz");
			int bit = scan.nextInt();
			if(bas>bit) {
				System.out.println("Baslangic degeri bitis degerinden kucuk olmalidir");
			}else {
			for (int i = bas ;  i <= bit	 ; i++) {
				System.out.print(i + " ");
			}
			scan.close();
	}
	}
}
