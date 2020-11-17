package homeworkmethods;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
If it is greater than 10 multiply it by 2 and print it on the console. Otherwise keep the number same
and print it on the console
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Bir Tam sayi giriniz");
			int a = scan.nextInt();
			int result = a<10 ? a*a : a==10 ? a : a*2 ;
			System.out.println(result);
			scan.close();
	}

}
