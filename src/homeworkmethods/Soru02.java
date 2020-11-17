package homeworkmethods;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		//Ask user to enter a String and output will be the number of the characters in the String
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir dize giriniz");
		String s = scan.nextLine();
		System.out.println(s.length()-1);
		scan.close();


	}

}
