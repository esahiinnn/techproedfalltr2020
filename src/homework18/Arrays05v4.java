package homework18;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays05v4 {

	public static void main(String[] args) {
		/*
		 Soru:
Kullanıcıya kaç elemanlı bir array gireceğini sorun.
Kullanıcıdan array’in elemanlarını girmesini isteyin.
a) Bu array’in tum elemanlarını ekrana yazdırın.
b) Bu arayın son elemanını ilk eleman yapın ve tum elemanlarını ekrana yazdırın.
Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazdırın
		 */
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Dizinin kac elemanli olmasini istiyorsunuz");
			int e = scan.nextInt();
			int k[] = new int [e];
			for(int i = 0; i < k.length; i++) {
				System.out.println("Kumenin elemanlari giriniz");
				int eleman = scan.nextInt();
				
					k[i] = eleman;
			}
				
				System.out.println(Arrays.toString(k));
				scan.close();
	}

}
