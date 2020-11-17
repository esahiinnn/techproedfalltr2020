package day13whileloop;

import java.util.Scanner;

public class ForLoop06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
					Scanner scan = new Scanner(System.in);
					System.out.println("Satir sayisini giriniz");
					int s = scan.nextInt();
					
					
					for(int i=0; i<s; i++) {
						//Yildizlar
						for(int k=0; k<i; k++) {
							System.out.print(" ");
						}
						for(int j=1; j<=s-i; j++) {
							System.out.print("* ");
						}
						
						
						System.out.println();
					
					}	
					scan.close();
					
	}

}
