package homeworknestedternary;

import java.util.Scanner;

public class TernarySoru03 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. 
		 Eğer urun miktarı 1000 den fazla ise  Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın. 
		 Diğer durumlarda  ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın
		 
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Urun miktarini ve fiyatini giriniz");
			int miktar = scan.nextInt();
			double fiyat = scan.nextDouble();
			System.out.println( miktar>1000 ? miktar*0.9*fiyat : miktar*fiyat);
			scan.close();
	}

}
