package homeworkif;

import java.util.Scanner;

public class Homeworkifelse02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana  “Eşkenar üçgen” yazdırın. 
		 Diğer durumlarda ekrana “Eşkenar değil” yazdırın.
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Ucgenin kenar uzunluklarini giriniz");
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			if(a == b && a == c && b == c ){
				System.out.println("Eskenar ucgen");
			}else {
				System.out.println("eskenar ucgen degil");
			}
			scan.close();
	}

}
