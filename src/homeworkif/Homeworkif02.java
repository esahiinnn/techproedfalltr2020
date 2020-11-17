package homeworkif;

import java.util.Scanner;

public class Homeworkif02 {

	public static void main(String[] args) {
		/*
		 2)Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın.
		  “b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.
		 */
				Scanner scan = new Scanner(System.in);
				System.out.println("Bir harf giriniz");
				char a = scan.next().charAt(0);
				if(a == 'a' || a =='e' || a =='i' || a == 'o' || a =='u' ) {
					System.out.println("Sesli harf");
				}
				if( a == 'b' || a == 'c' || a == 'd' || a == 'f') {
					System.out.println("Sessiz harf");
				}
				scan.close();
	}

}
