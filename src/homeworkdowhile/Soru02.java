package homeworkdowhile;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve 
		 başlangıç değerinden başlayıp bitiş değerinde  biten 4 ve 6 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		 */

			Scanner scan = new Scanner(System.in);
			System.out.println("Baslangic degerini giriniz");
			int bas = scan.nextInt();
			System.out.println("Bitis degerini giriniz");
			int bit = scan.nextInt();
			
			
			int i = bas;
			do {
				if(i%4==0 && i%6==0) {
					System.out.println(i + " ");
				}
				i++;
				
			}while(i<bit);
			scan.close();
	}

}
