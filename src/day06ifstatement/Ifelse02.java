package day06ifstatement;

import java.util.Scanner;

public class Ifelse02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir character aliniz 
		 Bu karakter harf ise console'a harf yazdirin
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Biseler yazin askolar");
			char ch = scan.next().charAt(0);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z' )){
				System.out.println("harfdir");
			}
			else {
				System.out.println("harf degildir.");
			}
			scan.close();
	}

}
