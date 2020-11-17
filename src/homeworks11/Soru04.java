package homeworks11;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		// Kullanıcıdan yaşadığı ülkenin ismini alın
		//bu ülkenin ismi Amerika ise ekrana USA, Ingiltere ise ekrana UK, Almanya ise ekrana DE yazdırın. Diğer ülkeler için ise NA yazdırın.

		
			Scanner scan = new Scanner(System.in);
			System.out.println("Hangi ulkere yasiyorsunuz");
			String a = scan.next();
			
			if(a.equalsIgnoreCase("Amerika")) {
				System.out.println("USA");
			}else if(a.equalsIgnoreCase("Ingiltere")) {
				System.out.println("UK");
			}else if(a.equalsIgnoreCase("Almanya")) {
				System.out.println("DE");
			}else {
				System.out.println("NA");
			}
			scan.close();
	}

}
