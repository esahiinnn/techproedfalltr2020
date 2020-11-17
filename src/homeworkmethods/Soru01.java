package homeworkmethods;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a word which has 4 letters and output will be inverse of the word.
For example; if user enters “MARK” output will be “KRAM”

		 */
		Scanner scan = new Scanner(System.in);
        System.out.println("4 harfli bir metin giriniz");
        String a = scan.next();
        if(a.length()==4) {
        	
        
        System.out.println(a.charAt(3) + "" + a.charAt(2) + "" + a.charAt(1)  + "" + a.charAt(0));
        
        	}else {
        		System.out.println("Lutfen 4 harfli bir metin giriniz");
        	}
        scan.close();
        }
	}
