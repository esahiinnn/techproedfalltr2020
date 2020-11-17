package day35interfaceiterators;

public class Runner implements I01{

	public static void main(String[] args) {
		
		//multiply() method'u "static" keyword ile olusuruldugundan
		//ulasmak icin sadece interface ismi yeterlidir.
		System.out.println(I01.multiply());
		
		//add() method'u "default" keyword kullanilarak olusturuldugunda
		//ulasmak icin mecburen object uretmek zorundayiz. Object uretmeden
		//ulasmaniz mumkun degildir.
		I01 obj = new Runner();
		System.out.println(obj.add());
		
		/*
		 		Concrete bir class, bir interface'in child class'i oldugunda interface'deki
		 tum abstract method'lari Override etmek zorundadir. Fakat bu zorunluluk
		 "default" ve "static" keyword'ler kullanilarak olusturulan concrete method'lar
		 icin yoktur.
		 
		 		Burada gordugunuz gibi, add() ve multiply() method'larini Override etmedik
		 cunku oyle bir zorunluluk yok ama istersek Override edebiliriz.
		 */

	}

}
