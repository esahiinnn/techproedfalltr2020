package homeworkdternaryoperations;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir dikdörtgenin en ve boyunu girmesini isteyin. 
		 En ve boy eşit ise ekrana “Kare” farklı ise ekrana “Dikdörtgen” yazdırın.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("dikdortgen icin en ve boy giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		String result = a== b ? "Kare" : "Dikdortgen";
		System.out.println(result);
		scan.close();
	}

}
