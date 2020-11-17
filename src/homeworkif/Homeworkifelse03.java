package homeworkif;

import java.util.Scanner;

public class Homeworkifelse03 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. 
		 Eğer urun miktarı 1000 den fazla ise  Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın. 
		 Diğer durumlarda  ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Urun miktarini ve fiyatini giriniz");
			double miktar = scan.nextDouble();
			double ucret = scan.nextDouble();
			if(miktar>1000) {
				System.out.println(miktar*(ucret - ucret/10) );
			}else {
				System.out.println(miktar*ucret);
			}
			scan.close();
	}

}
