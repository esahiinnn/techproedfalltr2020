package slide13homework;

import java.util.Scanner;

public class Soru09 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde  biten 3 ve 5 ile bölünebilen tüm tamsayıları ekrana yazdırınız
		 */

		
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Baslangic degerini giriniz");
			int bas = scan.nextInt();
			System.out.println("Bitis degerini giriniz");
			int bit = scan.nextInt();
			
//			
//			for(int i = bas; i<=bit; i++) {
//				if(i%15==0) {
//					System.out.print(i + " ");
//				}
//			}
//			
//			int j = bas;
//			while(j<=bit) {
//				if(j%15==0) {
//					System.out.print(j + " ");
//					j++;
//				}
//				
//			}
		
			for(int i = bas; i<=bit; i++) {
				if(i%3==0 || i%5==0) {
					System.out.print(i + " ");
				}
			}
		
			int k = bas;
			while(k<=bit) {
				if(k%3==0 || k%5==0) {
					System.out.print(k + " ");
					k++;
				}
				
			}
			
			
			
			
			
			
			
			
			
			scan.close();
	}

}
