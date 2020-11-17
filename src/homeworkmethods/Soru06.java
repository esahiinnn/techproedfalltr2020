package homeworkmethods;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a letter, if it is uppercase check it is before “F” or not in alphabetical order.
If it is before “F” in alphabetical order output will be “ Big before F”, otherwise output will be
“Big after F.” If it is lowercase check it is before “h” or not in alphabetical order.
If it is before “h” in alphabetical order output will be “Small before h”, otherwise “Small after h”

		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Bir harf giriniz");
			char a = scan.next().charAt(0);
			
			if(a>='A' && a<= 'Z') {
				if ( a<'F' ) {
				System.out.println("Big before F");
			}else {
				System.out.println("Big after F");
			}
			}else if(a>='a' && a<='z') {
				if(a<'h') {
					System.out.println("Small before h");
				}else {
					System.out.println("Small after h");
				}
			}else {
				System.out.println("Duzgun gir asko");
			}
			scan.close();
	}

}
