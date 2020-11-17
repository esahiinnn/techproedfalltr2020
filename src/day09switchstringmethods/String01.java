package day09switchstringmethods;

public class String01 {

	public static void main(String[] args) {
		
			//1.Method
			String s1= "Study hard stay humble";
			
			System.out.println(s1.charAt(0));//S
			//7.harfi ekrana yazdirin
			System.out.println(s1.charAt(6));//y
			//Son characteri ekrana yazdirin
			System.out.println(s1.charAt(s1.length()-1));//e
			
			//Ortadaki characteri ekrana yazdirin
			if(s1.length()%2!=0) {
			System.out.println(s1.charAt((s1.length()-1)/2));
			
			}		else {
				System.out.println("Orta karakter yoktur");
			}
			//charAt() Methodunda olmayan bir index kullandiginizda programi calistirdiktan sonra
			//ekranda kirmizi hata mesaji alirsiniz
			//System.out.println(s1.charAt(38));
			/*
			    	Java'da temelde iki tur hata vardir 
			 1) Compile time error : kod yazarken alinan kirmizi alt cizgiler
			 2) Run time error :yazilan code calistirildiktan sonra console'da gokuken kirmizi mesajlardir.
			 		Run time error olustugunda sonraki kodlar calistirilmaz
			 		Java kod calistirmayi durdurur.
			 */
			
			//2.
			String s2 = "Ogreten ogrenir";
			//String Methodlari gecici degisiklik yapar. Orjinal String degismez 
			System.out.println(s2.concat(" tamam mi ? "));// Ogreten ogrenir tamam mi ?
			
			//3.
			String s3 = " Java ogren zengin ol ";
			//Contains methodu boolean return eder.
			System.out.println(s3.contains("J"));
			System.out.println(s3.contains("x"));
			System.out.println(s3.contains("ogren"));
			System.out.println(s3.contains("Zengin"));
			System.out.println(s3.contains(""));
			System.out.println(s3.contains(" "));
			
			
			//4.
			String s4 = "Cok calis is bul";
			System.out.println(s4);
			
	}

}
