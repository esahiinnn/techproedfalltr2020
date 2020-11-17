package homeworkmethods;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his kid’s name, if the name contains “a” output will be “This name contains ‘a’.”
if the name contains “z” output will be “This name contains ‘z’.” Otherwise, output will be
“This name contains neither ‘a’ nor ‘z’.”
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Cocugunuzun ismini giriniz");
			String a = scan.next();
			if (a.contains("a") && a.contains("z")) {
				System.out.println("This name contains both a and z");
			}
			else if(a.contains("a")) {
				System.out.println("This name contains 'a'");
			}else if(a.contains("z")) {
				System.out.println("This name contains 'z'");
			}else {
				System.out.println("This name contains neither 'a' nor 'z'");
			}
			scan.close();
	}

}
