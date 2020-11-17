package homeworknestedternary;

import java.util.Scanner;

public class TernarySoru04 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir harf alın eğer harf büyük harf ise ekrana “Buyuk harf” yazdırın.  
		 Diğer durumlarda ekrana “Buyuk harf degil” yazdırın.
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("bir harf giriniz");
			char a = scan.next().charAt(0);
			String result = a>='A' && a<='Z' ? "Buyuk harf" : "Buyuk harf degil";
				System.out.println(result);
			scan.close();
	}

}
