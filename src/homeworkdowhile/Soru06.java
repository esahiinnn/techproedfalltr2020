package homeworkdowhile;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir String alın ve bu String’in icinde “a” harfi varsa ekrana “a harfi var” yazdırın.
		   “a” harfi yoksa tekrar bir String girmesini isteyin.
		 */

		
			Scanner scan = new Scanner(System.in);
			String i = "";
			do {
				System.out.println("Bir string giriniz");
				String s = scan.nextLine();
				i = s;
				
				
				
			}while(!i.contains("a"));
			System.out.println("a harfi var");
			scan.close();
	}

}
