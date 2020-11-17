package homeworkswitch;

import java.util.Scanner;

public class Switch05 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan A, B, C, D harflerinden birini alın eğer harf C ise ekrana “Doğru cevap” yazdırın. 
		 A, B, D den biri ise ekrana “Yanlış cevap” yazdırın.
		  Bu harflerin dışındaki harfler için “Geçersiz cevap şıkkı” yazdırın
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Harf giriniz");
			char a = scan.next().charAt(0);
			switch(a) {
			case 'C' :
				System.out.println("Dogru cevap");
				break;
			case 'A' :
			case 'B' :
			case 'D' :
				System.out.println("Yanlis cevap");
				break;
				default :
					System.out.println("Gecersiz cevap sikki");
					scan.close();
			}
	}

}
