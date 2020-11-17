package homeworkswitch;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan ay ismi alın eğer ay ismi  31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın. 
		 Eğer ay ismi  30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın. 
		 Eğer ay ismi  28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır” yazdırın. 
		 Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Bir ay giriniz");
			String ay = scan.next().toLowerCase();
			switch(ay) {
				case "ocak":
				case "mart":
				case "mayis":	
				case "temmuz":
				case "agustos":	
				case "ekim":
				case "aralik":	
					System.out.println("Bu ay 31 gundur");
					break;
				case "subat" :
					System.out.println("Bu ay 28 veya 29");
					break ;
				case "nisan" :
				case "haziran" :
				case "eylul" :
				case "kasim" :
					System.out.println("Bu ay 30 gundur");
					break ;
			default :
				System.out.println("Gecersiz aylar");
			scan.close();
			}
	}

}
