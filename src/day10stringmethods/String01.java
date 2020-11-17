package day10stringmethods;

public class String01 {

	public static void main(String[] args) {
		//4
		//endsWith() String ile calisir char kabul etmez 
		// stringin icindeki cumlenin ne ile bittigini bulur veya bulmaz
		
		String s1 = "Testi al kendini gor";
		System.out.println(s1.endsWith("r"));//true
		System.out.println(s1.endsWith("gor"));//true
		System.out.println(s1.endsWith(""));//true
		System.out.println(s1.endsWith("kendini gor"));//true
		System.out.println(s1.endsWith("Testi al kendini gor"));//true
		System.out.println(s1.endsWith(s1)); //true
		
		
		//5 equals()
		//String data type larinda == yerine equals() kullanilir
		System.out.println("Ali".equals("Ali")); //true
		System.out.println("Ali".equals("ALI"));//false
		System.out.println("Ali" == "Ali");//true
		
		//6 equalsIgnoreCase()
		//karsilastirmalarda harfin buyuk veya kucuk oldugunu umursamaz
		
		System.out.println("Ali".equalsIgnoreCase("ALI"));//true
		
		//7 indexOf()
		//Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
		//indexOf() methodunda hem char hem de String ile kullanilabilir.
		//indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
		System.out.println(s1.indexOf('i'));//4
		System.out.println(s1.indexOf('T'));//1
		System.out.println(s1.indexOf(' '));//5
		System.out.println(s1.indexOf("al"));//6
		
		//indexOf() Methodu olmayan char'lar icin "-1" return eder.
		System.out.println(s1.indexOf('x'));
		System.out.println(s1.indexOf(""));
		
		String s2 = "Cabuk ogrenilen cabuk unutulur";
		
		System.out.println(s2.indexOf('a', 6)); //17
		System.out.println(s2.indexOf('r', 8));//8
		System.out.println(s2.indexOf("buk", 5	));
		
		//9 isEmpty
		//isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
		//Yani o String'in length() 0 demektir.
		String s3 = "Tekrar et tekrar unutma";
		System.out.println(s3.isEmpty());//false
		System.out.println("".isEmpty());//true
		
		//10 lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
		System.out.println(s3.lastIndexOf('e')); //11
		System.out.println(s3.lastIndexOf("rar")); //13
		System.out.println(s3.lastIndexOf('r', 16)); //15
		System.out.println(s3.lastIndexOf("k", 14));//12
		
		//11 length()
		//Bu method String'in icinde kac tane character oldugunu return eder.
		System.out.println(s3.length()); // 23
		
		//12 replace ( , ) 
	
		System.out.println(s3.replace('e', 'E'));//TEkrar Et tEkrar unutma
		System.out.println(s3.replace('x', 'M'));// Tekrar et tekrar unutma
		System.out.println(s3.replace("krar", "miz" )); //Temiz et temiz unutma
		System.out.println(s3.replace("a", "" ));//Tekrr et tekrr unutm
		System.out.println(s3.replace(" ","" ));//Tekrarettekrarunutma
		System.out.println(s3.replace("", "/"));///T/e/k/r/a/r/ /e/t/ /t/e/k/r/a/r/ /u/n/u/t/m/a/
		
		//13 replaceAll()
		
		
		/*
		 Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space 
		 	 \\S   ==> space disindaki hersey
		 */
		String s4 = "Code1 yazarak2 ogrenilir3__";
		
		
		System.out.println(s4.replaceAll("\\d", "*")); //Code* yazarak* ogrenilir__*
		System.out.println(s4.replaceAll("\\D", "*"));//****1********2**********3__
		System.out.println(s4.replaceAll("\\w", "*"));//***** ******** ************
		System.out.println(s4.replaceAll("\\W", "*"));//Code1*yazarak2*ogrenilir3__
		System.out.println(s4.replaceAll("\\s", "*")); //Code1*yazarak2*ogrenilir3__
		System.out.println(s4.replaceAll("\\S", "*")); //***** ******** ************
		
		//14 startsWith()
		// String'in basladigi characteri dogular
		System.out.println(s4.startsWith("C"));//true
		System.out.println(s4.startsWith("c"));//false
		System.out.println(s4.startsWith("Code"));//true
		
		
		//s4 String'inin 4.character'i (index 3 demektir) "e" mi
		System.out.println(s4.startsWith("e", 3));//true
		
		
		
	}

}
