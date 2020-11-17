package day12forloop;

import java.util.Scanner;

public class ForLoop06 {

	public static void main(String[] args) {
		/*
		 Baslangic ve bitis degerlerini kullanicidan alin.
		 Baslangic degerinden bitis degerine kadar
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Baslangic noktasini giriniz");
			int bas = scan.nextInt();
			System.out.println("Bitis noktasini giriniz");
			int bit = scan.nextInt();
			
			int toplam = 0;
			for(int i=bas; i<=bit; i++) {
				toplam = toplam +i;
			}
			System.out.println(toplam);
			scan.close();
	}

}
