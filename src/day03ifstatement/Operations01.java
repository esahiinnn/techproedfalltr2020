package day03ifstatement;

public class Operations01 {

	public static void main(String[] args) {
		
		//char'lari int data type'inda bir variable'a atarsaniz Java o char'in ASCII degerini variable'in icine koyar.
		int harf = 'a';
		
		System.out.println(harf);
		
		int unlem = '!';
		System.out.println(unlem);

		//Java matematikteki tum islemleri dogru olarak yapar.
		int a = 10;
		int b = 11;
		int c = 47;
		
		System.out.println(a+b); //21
		
		//int'i int'e boldugunuz zaman sonuc int cikar.
		//Java yuvarlama islemi yapmaz, sonucun tam kismini bolme isleminin sonucu olarak ekrana yazar.
		//Ornegin 47/10 isleminin sonucu matematikte 4.7'dir fakat Java'da 4'dür.
		System.out.println(c / a);//4
		
		/*
		 Islem Onceligi:
		  1)Parantez ici islemler once yapilir.
		  2)Carpma ve bolmeler yapilir.
		  3)Toplama ve cikarmalar yapilir.
		 */
		
		System.out.println(b+ a * c);//481
		System.out.println(b + (c - 2 * b) / 2);//23
		System.out.println(c - a / (b - c ) + a*b);
		
		//Farkli data type'lari ile matematiksel islemler yaparsaniz sonuc buyuk data type'inda verilir.
		//byte < short < int < long < float < double 
			int d = 12;
			double e = 4;
			float f = 4f;
			System.out.println(d / e);//3.0
			System.out.println(d + e);//16.0
			System.out.println(e / d );//0.3333333333333333
			System.out.println(f / d );//0.33333334
		
			//Modulus Islemi : Iki ondalik olmayan sayi birbirine bolundugunde kalani verir
			// 													Java'da Modulus Islemi'nin sembolu "%" isaretidir.
			
			System.out.println(13%5);
			System.out.println(245 % 3);
			
			//Cift Sayi (even) : 2'ye bolundugunde 0 kalanini veren sayilardir.
			//Tek Sayi (odd) : 2'ye bolundugunde 1 kalanini veren sayilardir.
			
			System.out.println(1234567 % 2);//Sonuc 1 ise tek sayidir, 0 ise cift sayidir
			
			//Concatenation : String'leri birlestirmek icin kullanilir.Sembolu "+"'dir.
			String s1 = "Java ";
			String s2 = "kolaydir.";
			System.out.println(s1 + s2);
			int g = 2;
			int h = 3;
			String i = "Java";
			System.out.println(i + g + h);//Java23
			System.out.println(i +(g + h));//Java5
			//Concatination'un sonucu her zaman String'dir.
			
			System.out.println(g + h + i);//23Java
			//g h ve i variable'larini kullanarak 61Java-1 yazdirin.
			
			System.out.println((g*h) + ""+ (h-g) + i + (g - h));
			
			
			
	}

}
