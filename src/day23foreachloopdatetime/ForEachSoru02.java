package day23foreachloopdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachSoru02 {

		static int no = 1000;
	public static void main(String[] args) {
		/*
		 	Giris Yili + Ad ve Soyadinin Ilk Harfleri + Sira Numarasi seklinde ogrenci numarasi
		olusturan programi yaziniz.
		 */

			
			Scanner scan = new Scanner(System.in);
			String adSoyad ="";
			
			
			List<String> isimler = new ArrayList<>();
			
			do{	
				
				System.out.println("Lutfen Isminizi ve Soyisminizi giriniz");
				 adSoyad = scan.nextLine();
				 
				 if(!adSoyad.equalsIgnoreCase("X")) {
					 isimler.add(adSoyad);
				 }
				 
				
			}while(!adSoyad.equalsIgnoreCase("X"));	
			
			System.out.println(isimler);
			
			for(String w : isimler) {
				System.out.println(w + " id "+ 20 +	"" +	w.charAt(0)  + w.charAt(w.indexOf(" ") +1) + no);
				no++;
				}
			scan.close();
	}

}
