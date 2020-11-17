package day15variabletypes;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir String alin.
		 Bu String'in icinde kac tane harf, kac tane rakam, kac tane harf ve rakam disi
		 karakter oldugunu gosteren programi yaziniz
		 */

			Scanner scan = new Scanner(System.in);
			System.out.println("Bir String giriniz");
			String s = scan.nextLine().toLowerCase();
			
			int harfCounter = 0;
			int rakamCounter = 0;
			int digerCounter = 0;
			int k = 0;
			do {
				if(s.length()==0) {
					System.out.println("Sana String gir dedik");
				}
				else if(s.charAt(k)>='a' && s.charAt(k)<='z' ) {
					harfCounter++;
				}
				else if(s.charAt(k)>='0' && s.charAt(k)<='9') {
					rakamCounter++;
				}else {
					digerCounter++;
				}
				
				k++;
			}while(k<s.length());
			System.out.println("Stringde " + harfCounter + " tane harf vardir");
			System.out.println("Stringde " + rakamCounter + " tane rakam vardir");
			System.out.println("Stringde " + digerCounter + " tane harf ve rakam disi karakter vardir");
			scan.close();
	}

}
