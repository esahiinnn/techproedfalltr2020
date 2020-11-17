package homework18;

import java.util.Scanner;

public class Arrays05v2 {

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
		System.out.println("Kac elemanli bir dizi istiyorsunuz");
		int j = scan.nextInt();
		int i, s = 0;
        int dizi[] = new int[j];
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Dizinin elemanlarini girin :");
        int k = scan1.nextInt();
        for (i = 0; i < j-1; i++) {
            dizi[i] = scan1.nextInt();
        }
 
        
        for (int sayi:dizi) {
            System.out.print(sayi+" ");
        }
		
		scan1.close();
	}

}
