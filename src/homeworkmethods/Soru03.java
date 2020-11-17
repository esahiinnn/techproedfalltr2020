package homeworkmethods;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*
		 Ask user to enter password, if the password is okay for the following conditions output will be
“Your password is created successfully.” If the password is not okay for any of the following conditions
Output will be “Enter a new password according to the give conditions”
1.First letter must be uppercase
2.Last letter must be lowercase
3.Password must contain 6 characters
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Ilk harfi buyuk ve son harfi kucuk 6 harfli bir password giriniz");
			String a = scan.next();
			
			if(a.length()==6 && a.charAt(0) >='A' && a.charAt(0) <= 'Z' && a.charAt(5) >= 'a' && a.charAt(5) <='z') {
				System.out.println("Your password is created succesfully");
			}else {
				System.out.println("Enter a new password according to the given conditions");
			}
			scan.close();
	}

}
