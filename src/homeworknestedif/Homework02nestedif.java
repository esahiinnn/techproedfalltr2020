package homeworknestedif;

import java.util.Scanner;

public class Homework02nestedif {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Bir harf giriniz");
			char a = scan.next().charAt(0);
			if(a>= 'a' && a<= 'z') {
				if(a == 'a') {
					System.out.println("Ilk kucuk harf");
				}else {
					System.out.println("Ilk kucuk harf degil");
				}
			}else {
				if(a>= 'A' && a<='Z') {
				 if(a=='Z') {
					 System.out.println("Son buyuk harf");
				 }else {
					 System.out.println("Son buyuk harf degil");
				 }
				
				}
			}
	
	scan.close();
	}

}
