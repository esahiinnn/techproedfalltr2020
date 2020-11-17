package day13whileloop;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		/*
		 For Loop kullanarak asagidaki sekli kullanicidan alinan degerlerle ciziniz
		 
		 						*
		 					   * *
		 					  * * *
		 					 * * * *
		 					* * * * *
		 				   * * * * * * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Olusturulacak ucgenin satir sayisini giriniz");
		int s = scan.nextInt();
	
				for(int i=1; i<=s; i++) {
					//Space'ler icin Loop
					for(int j=s-1; j>=i; j--) {
						System.out.print(" ");
					}
						
						for(int k=1; k<=i; k++) {
							System.out.print("* ");
						}
					System.out.println();
				}
				scan.close();
	}

}
