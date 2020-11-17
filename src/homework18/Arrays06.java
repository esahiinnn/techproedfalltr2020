package homework18;

import java.util.Scanner;

public class Arrays06 {

	public static void main(String[] args) {
		/*
		 Soru:
Kullanıcıya kaç elemanlı bir array gireceğini sorun.
Kullanıcıdan array’in elemanlarını girmesini isteyin.
a) Bu array’in icinde herhangi bir elemanın var olup olmadigini kontrol edin.
b) Bu arayın tum elemanlarını tersten yazdırın.
 Mesela; array {1, 2, 3, 4} ise ekrana {4, 3, 2, 1} seklinde yazdırın.
		 */

				Scanner scan = new Scanner(System.in);
				System.out.println("Kac elemanli bir dizi istiyorsunuz");
				int e = scan.nextInt();
				int k[] = new int [e];
				
				for(int i=0; i<k.length; i++) {
					System.out.println("Dizinin elemanlarini giriniz");
					int eleman = scan.nextInt();
					k[i] = eleman;
					
					
				}
				
				
				
	}

}
