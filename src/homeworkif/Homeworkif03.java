package homeworkif;

import java.util.Scanner;

public class Homeworkif03 {

	public static void main(String[] args) {
		/*
		 )Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdırın. 
		 “Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdırın.
		 “Pazar” ise ekrana  “Hıristiyanlar icin kutsal gün” yazdırın
		 */
				Scanner scan = new Scanner(System.in);
				System.out.println("Bir gun giriniz");
				String gun = scan.nextLine();
			
				if(gun.equals("cuma")) {
					System.out.println("Muslumanlar icin kutsal gun");
				}
				if(gun.equals("cumartesi")) {
					System.out.println("Yahudiler icin kutsal gun");
				}
				if(gun.equals("pazar")) {
					System.out.println("Hristiyanlar icin kutsal gun");
				}
				
				scan.close();
	}

}
