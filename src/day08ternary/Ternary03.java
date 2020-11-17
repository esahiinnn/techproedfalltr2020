package day08ternary;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer iki kenar uzunluğu birbirine eşit ise ekrana
“Ikizkenar Ucgen” yazdırın. Diğer durumlarda ekrana “Ikizkenar değil” yazdırın.
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("bi ucgenin kenar uzunlugunu girin");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			String result = a==b || a==c || b==c ? "Ikızkenar Ucgen" : "Ikizkenar degil";
			System.out.println(result);
			scan.close();
	}
	

}
