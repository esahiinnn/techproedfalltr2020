package homeworkif;

import java.util.Scanner;

public class Homeworkif04 {

	public static void main(String[] args) {
		/*
		 4)Kullanıcıdan iki sayı alın eğer sayıların işaretleri  aynı ise ekrana “Aynı işaretli” yazdırın. 
		 Sayıların işaretleri  farklı ise ekrana “Farklı işaretli” yazdırın.
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("iki tane sayi girin");
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			if((a>=0 && b>=0) || ( a<0 && b<0)) {
				System.out.println("Ayni isaretli");
			}else {
				System.out.println("farkli isaretli");
			}
			scan.close();
	}

}
