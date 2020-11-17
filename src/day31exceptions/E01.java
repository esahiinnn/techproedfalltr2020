package day31exceptions;

public class E01 {
		
		/*
		 			1) ArithmeticException class'i Java'da matematiksel islemler yapilirken olusabilecek hatalarda kullanilir.
		 		Mesela; 12'yi 0'a bolersek Java Exception throw eder. Bu Exception ArithmeticException kullanilarak halledilebilir.
		 		Run Time Exception'dir.
		 		
		 			Note: Java'da iki tip Exception vardir; birisi siz code yazarken kirmizi alt cizgi verir (CTE) verir, digeri
		 		kirmizi alt cizgi vermez.
		 		Compile Time Error veren Exception'lara "Compile Time Exception" veya "Checked Exception" denir.
		 		Compile Time Error vermeyenlere ise "Run Time Exception" veya  "Unchecked Exception" denir.
		 		
		 			Note: "Compile Time Exception" larda ya "throws" veya "try-catch" kullanmalisiniz aksi takdirde 
		 	    code calismaz. Ama "Run Time Exception" larda isterseniz "throws", isterseniz "try-catch", isterseniz
		 	    hicbir sey kullanmayabilirsiniz.
		 	    
		 	@@@    Yani; “Compile Time Exception” lar “handle” edilmelidirler ama “Run Time Exception” lar handle edilmese de olur.
		 	  		2) NullPointerException class'i ornegin null atamasi yapilan bir String'de length() methodu kullanildiginda
		 	  	olusur. Run Time Exception'dir.
		 	  	
		 	  		3) ArrayIndexOutOfBoundsException class'i array'lerde olmayan bir index ile islem yapmaya calisirsak devreye girer.
		 	  		Run Time Exception'dir.
		 	  		
		 	  		4) NumberFormatException class'i sayi formatinda olmayan bir String'i parseInt() methodu kullanarak integer'a cevirmek
		 	  	istediginizde devreye girer.Run Time Exception'dir.
		 	  		
		 	  		5) ClassCastException class'i birbirine donusturulemeyen data type'lar birbirine donusturulmek istenirse devreye girer.
		 	  		Ornegin; Object data type'i String data type'ina donusturulemez. Java'ya illa donustur diye israr edersek ClassCastException aliriz
		 	  		Run Time Exception'dir. 
		 	  		
		 	  		6)IllegalArgumentException class'i kullanilmasini istemedigimiz degerlerde programimizin hata vermesini istiyorsak
		 	  	devreye girer. Mesela; yas icin negatif sayilarin kullanilmasi dogru degildir. Kullanici yas icin negatf sayi kullandiginda
		 	  	program hata vermeilidir. Bunu throw new IllegalArgumentException code'unu yazarak temin edebiiriz.
		 	  	Run Time Excaption'dir.
		 	  	
		 	 		Soru : "throw" ile "throws" arasindaki farklar nelerdir?
		 	 			a) throws main method parantezinin kapanis parantezi ile method body'nin acilis parantezi arasinda kullanilir.
		 	 				"throw" method body'nin icinde kullanilir.
		 	 			b) "throws" keywordunden sonra birden fazla Exception yazilabilir. Fakat "throw" keywordunden sonra 
		 	 				sadece bir tane Exception yazilabilir.
		 	 			c) "throws" keywordunden sonra sadece Exception class'inin ismini yazariz fakat "throw" keywordunden sonra
		 	 				Exception class'indan object olustururuz.
		 	 			d) "throws" keywordu methodun ilk satirinda sadece bir kere kullanilabilir ama "throw" keywordu method body'si 
		 	 				icinde nerede Exception atmak istersek orada istedigimiz kadar kullanabiliriz.
		 	 				
		 	 		Note: catch block'lardan sonra finally block kullanilabilir, finally block'in ozelligi Exception olussada olusmasada
		 	 				  calismasidir.
		 	 				  finally block cloud'da yapilan islemlerden sonra cloud ile connection'i kesmek icin kullanilir. Cloud ile
		 	 				  connection yazdigimiz kod basarili bir sekilde calisirsa isimiz bittigi icin kesilmelidir. Yazdigimiz code
		 	 				  Exception atarsa cloud ile connection yine kesilmeli ve code tamir edilmelidir. Cloud ile connection 
		 	 				  kesilmez ise fatura pahali olabilir.
*/
}
