package homeworkdternaryoperations;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		//Kullanıcıdan bir tamsayı girmesini isteyin, ekrana o tamsayının mutlak degerini yazdırın
			Scanner scan = new Scanner(System.in);
			System.out.println("Tam sayi giriniz");
			int a = scan.nextInt();
			int result = a<0 ? a*-1 : a;
			System.out.println(result);
			scan.close();
	}

}
