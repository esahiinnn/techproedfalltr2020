package homework12;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden veya sonrasından   
		 başlayıp bitiş değerinde veya öncesinde biten tüm 3 ile bölünebilen tamsayıları ekrana yazdırın.
		 */

				Scanner scan = new Scanner(System.in);
				System.out.println("Baslangic degerini giriniz");
				int bas = scan.nextInt();
				System.out.println("Bitis degerini giriniz");
				int bit = scan.nextInt();
				
				if(bas>bit) {
					for(int i=bas; i>=bit; i--) {
						if(i%3==0) {
							System.out.println(i);
						}
					}
				}else {
					for(int i=bas; i<=bit; i++) {
						if(i%3==0) {
							System.out.println(i);
						}
					}
				}
				scan.close();
	}

}
