package homeworkif;

import java.util.Scanner;

public class Homeworkif {

	public static void main(String[] args) {
		/*
		 1)Kullanıcıdan bir tamsayı alın eğer tamsayı 3 ile bölünebiliyorsa ekrana “3’ün katı” yazdırın. 
		 3 ile bölünemiyorsa ekrana “3’ün katı değildir” yazdırın.
		 */
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Bir tam sayi yazin");
			
			int sayi = scan.nextInt();
			
			if ( (sayi %3) == 0 ) {
				System.out.println("Sayi : " + "3'un katidir.");
			}else {
				System.out.println("Sayi : " + "3'un kati degildir");
				
			}
			
			scan.close();
	}

}
