package homeworkdowhile;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya bir String girmesini söyleyin ve
		  bu String’in ilk harfi ile son harfi aynı ise ekrana  “Simetrik” yazdırın. Aynı değilse tekrar bir String girmesini isteyin.
		 */

			Scanner scan = new Scanner(System.in);
			
			char i = 0;
			char j = 0;
			
			do {
				System.out.println("Bir String giriniz");
				String s = scan.nextLine().toLowerCase();
				 i = s.charAt(0);
				 j = s.charAt(s.length()-1);
				
				
				
			}while(i!=j);
			System.out.println("Simetrik");
			scan.close();
			
	}
}
