package homework12;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde  biten tüm tamsayıların çarpımını ekrana yazdırın.
		 */

				Scanner scan = new Scanner(System.in);
				System.out.println("Baslangic degerini giriniz");
				int b = scan.nextInt();
				System.out.println("Bitis degerini giriniz");
				int c = scan.nextInt();
				int carpim = 1;
				
				for(int i =b; i<=c; i ++) {
					carpim *=i;
				}
				System.out.println(carpim);
				scan.close();
	}

}
