package homeworks11;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan kredi kartı numarasını alın ve bu numaranın üçüncü, dördüncü ve sonuncu  rakamlarını ekrana yazdırın.
		 */

			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen kredi karti numaranizi giriniz");
			String a = scan.nextLine();
			a = a.substring(2, 3) + a.substring(3, 4) + a.substring(a.length()-1);
			System.out.println(a);
			scan.close();
	}

}
