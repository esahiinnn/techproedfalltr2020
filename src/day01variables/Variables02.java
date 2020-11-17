package day01variables;

public class Variables02 {

	public static void main(String[] args) {
		
		//Variable olusturmak
		// 1)Data type yaz 2)Variable Ismi 3)"=" koy 4)Variable'a bir deger atamasi yapin 5)";" koyun
		
		//1.yol:Makbul(Recommended)
		int age = 23; 
		int salary = 5000;
		System.out.println(age);//23
		System.out.println(salary);//5000
		
		//2.yol:
		int length;  //Variable olusturuldu. ==> Declaration
		length = 12; //Variable'a deger atamasi yapildi. ==> Assignment
		System.out.println(length); //12
		
		//3.yol:
		//int width = 22;
		//int height = 32;
		//int money = 42;
		
		
		int width = 22, height = 32, money = 42;
		System.out.println(width + height + money);
			
		//Bir Class'da ayni isimle sadece 1 tane variable olusturabilir.
		
		
		/*
		 Java'da temelde 2 farkli data type vardir.
		 1)Primitive Data Type:8 tanedir.
		   
		   a)boolean: True veya False durumlarinda kullanilir.
		   		booelan'lar sadece iki farkli deger alabildigi icin memory'de az yer kaplar
		   		bir booelan variable memory'de bir bit'lik yer kaplar.
		   
		   b)char :Tek character'li (her bir sembole karakter denir.) ifadeler icin char data type'i kullanilir.S, ?, 3, *, ==> char olabilir.
		   		bir char memory'de 16 bit'lik yer kaplar.
		   		char data type'inde variable olustururken deger mutlaka tek tirnak icine konulmadilir, yoksa hata verir.
		   		char'larla matematiksel islemler yaparsaniz charlarin ASCII Table'daki degerlerini kullanir.
		   
		   c)byte : -128'den +127 ye kadar tum tam sayilari icerir.
		   		byte'lar memory'de 8 bitlik yer kaplar.
		   
		   d)short : -32768'den 32767'ye kadar tum tam sayilari icerir.
		   		short'lar memory'de 16 bıt yer kaplar.
		   
		   e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayilari icerir.
		  		int'ler memory'de 32 bit yer kaplar.
		   
		   f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayilari degerlerini icerir.
		   		long'lar memory'de 64 bit yer kaplar.
		   
		   g)float : ondalikli sayilar icin kullanilan data type'laridir.
		   		float memory'de 32 bit kullanir.
		   		float'lar ondalik kisimlarinda en fazla 7 rakam barindirabilirler.
		   		0.1234567
		   		Bir ondalikli sayinin float oldugunu belirlemek icin en sona 'f' veya 'F' yazmak gerekir.
		   		2.23f veya 2.23F yazmaliyiz. Sonuna 'f' veya 'F' konulmayan ondalik sayilari Java otomatik olarak double kabul eder.
		   		
		   h)double : ondalikli sayilar icin kullanilan data type'laridir.
		   		double memory'de 64 bit kullanir.
		 		double'lar ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
		 		0.1234567890123456
		 		
		 2)Non-Primitive Data Type
		 	String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusur.
		 */
		
		//bit memory'nin en kucuk yapitasina denir.
		//byte 8 bit bir byte olarak adlandirilir.
		
		boolean emekli = false;
		boolean engelli = true;
		
		System.out.println(emekli);
		System.out.println(engelli);
		char initial = 'S';
		char ch1 = '?';
		char ch2 = 'a';
		char ch3 = ' '; //space bir character'dir ve char olarak kullanilabilir.
		//char ch4 = '';  char olustururken tek tirnak arasinda mutlaka bir character olmalidir.
		//Sifir character veya birden fazla character kabul edilmez.
		//a ==> 97 ==> 0 ve 1 lere ceviririz.
		//b ==> 98 
		char ch5 = 'A';
		
		
		
		System.out.println(initial);//S
		System.out.println(ch1 + ch2);//63 + 97 = 160
		System.out.println(ch5 > ch2);//Karsilastirma islemlerinin sonucu true ya da false olur; yani islemin sonucu boolean olur.
									  //Buyuk harflerin ASCII degerleri kucuk harflerden kucuktur.
		//Herhangi bir char'in ASCII degerini kod yazarak bulmak.
		
		System.out.println(ch3+0);
		
		byte b1 = 12;
		byte b2 = -125;
		
		System.out.println(b1 * b2);
		
		
		float f1 = 2.23f;
		float f2 = 0.123456123F;
		
		System.out.println(f1*f2);
		double d1 = 2.23;
		double d2 = 2.231231231231123213213;
		
		System.out.println(d1*d2);
		
		//Primitive data type'lerinin buyukten kucuge siralayalim.
		//byte < short < int < long <float < double ** önemli bilinmeli.
		
		String str1 = "";
		String str2 = "A";
		String str3 = "Alican okula gitti.Eve daha gelmedi.";
		System.out.println(str3 + str2 +str1);
		/*
		 Primitive Data Type ile Non-Primitive Data Type arasindaki farklar nelerdir?
		 1) Primitive Data Type isimlerinde tum harfler kucuk harf olmalidir, Non-Primitive Data Type'larinda ilk harf buyuk yazilmalidir.
		 2) Primivite Data Type'larini Java olusturmustur, Biz Primitive Data Type olusturamayiz. Fakat Non-Primitive Data Type'lari Java Programcilari
		 tarafindan istenildigi kadar olusturulabilir.
		 3) Primivite Data Type'larin memory'de kapladigi yer Data Type'ina gore degisir. Fakat Non-Primivite Data Type'larinin memory'de kapladigi yer 
		 her zaman aynidir Type'a gore degismez
		 4) Primitive Data Type'larinin memory'de ayirdigi alanda sadece o Primitive Data'nin degeri vardir. Fakat, Non-Primitive'lerin memory'de ayirdigi
		 alanda o Non-Primivite Data'nin degerinin yaninda kullanima hazir cok faydali onlarca method vardir.
		 */
	}

}
