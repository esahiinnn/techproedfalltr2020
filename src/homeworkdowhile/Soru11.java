package homeworkdowhile;

import java.util.Scanner;

public class Soru11 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya bir String girmesini söyleyin ve bu String’i yukarıdan aşağıya doğru yazdıran  Program yazınız. 
		 Ornegin; CAN ==> 
		 C                                                               
		 A                                                              
		  N 
		 */

		
		
				Scanner scan = new Scanner(System.in);
				System.out.println("Bir string giirniz");
				String s = scan.nextLine();
				
				yukaridanasagi(s);
				scan.close();
	}

			public static void yukaridanasagi(String s) {
				
				for(int i=0; i<s.length(); i++) {
					System.out.println(s.charAt(i));
				}
				
				
			}
}
