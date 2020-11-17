package homeworknestedif;

import java.util.Scanner;

public class Homeworknestedif01 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan cinsiyetini girmesini isteyin.
Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Cinsiyetinizi girin");
			String a = scan.nextLine();
			System.out.println("Lutfen Yasinizi girin");
			int b = scan.nextInt();
			if(a.equalsIgnoreCase("erkek")) {
				if(b<18) {
					System.out.println("Erkek cocuk");
				}else {
					System.out.println("ADAM");
				}
			}else {
				if (a.equalsIgnoreCase("kadin")) {
				if(b<18) {
					System.out.println("Kiz cocuk");}
				else {
					System.out.println("Kadin");
				
				}
			
			}
		}
			scan.close();
	}
}