package day08ternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		/*
		 Artik Yil(Lep Year) : 100'e bolunen yillardan 400 e bolunenler artik yildir.
		 				   100'e bolunmeyenlerden 4'e bolunenler artil yildir
		 					Kullanicidan alinan  yilin artik yil olup olmadigini belirleyen programi yazin
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Yil giriniz");
			int y = scan.nextInt();
			String result = y%100==0 ? (y%400==0 ? "Artik yil" : "Artik yil degil") : (y%4==0 ? "Artik yil" : "Artik yil degil");
			System.out.println(result);
			scan.close();
	}

}
