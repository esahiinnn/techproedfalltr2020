package homework18;


import java.util.Arrays;
import java.util.Scanner;

public class Arrays05 {

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
			System.out.println("Kac elemanli bir array giriceksiniz");
			int e = scan.nextInt();
			int elemanSayi = 0;
			int d[] = new int[e];
			do {
				System.out.println("Array elemanlarini girin");
				int eleman = scan.nextInt();
				elemanSayi++;
				
				for(int i=0; i<e; i++ ) {
				d[i] = eleman;
			}
				
				
				
			}while(elemanSayi!=e);	
			System.out.println(Arrays.toString(d));
			System.out.println(elemanSayi + " tane dizi elemani girdiniz");
			scan.close();
	}

}
