package day07ifelseifnestedif;

import java.util.Scanner;

public class IfElseIf03 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
1. 50 den az - D     2. 50(dahil) ile 60 arası - C       3. 60(dahil) ile 80 arası - B.     4. 80(dahil) ustu- A
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Notunuzu girin");
			int not = scan.nextInt();
			  if(not<0) {
				System.out.println("Mal misin  0 dan az not mu olur XD");
			}
			else if(not<50) {
				System.out.println("D");
			}else if(not<=50 && not <60) {
				System.out.println("C");
				}else if(not<=60 && not<80) {
					System.out.println("B");
				}else if(not>=80 && not<=100) {
					System.out.println("A");
				}
				else {
					System.out.println("Mal misin  100 den fazla not mu olur XD");
				}
			scan.close();
	}

}
