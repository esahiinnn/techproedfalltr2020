package homeworknestedternary;

import java.util.Scanner;

public class TernarySoru02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın eğer iki kenar uzunluğu birbirine eşit ise ekrana
“Ikizkenar Ucgen” yazdırın. Diğer durumlarda ekrana “Ikizkenar değil” yazdırın
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Ucgenin kenar uzunluklarini giriniz pLS");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			String result = a==b || b == c || a ==c ? "Ikizkenar Ucgen" : "Ikızkenar ucgen degil";
			System.out.println(result);
			scan.close();
	}

}
