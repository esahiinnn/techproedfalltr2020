package day11stringmethods;

public class String01 {

	public static void main(String[] args) {
		//15. substring()
		
		String s1 = "Java OOP Languagedir";
		
		System.out.println(s1.substring(3));//a OOP Languagedir
		System.out.println(s1.substring(5));//OOP languagedir
		
		System.out.println(s1.substring(0));//J ava OOP Languagedir 
		// Son harfi ekrana yazdirin
		System.out.println(s1.substring(s1.length()-1));//r
		//s1.substring(9, 17) ifadesinde index 9 dahil index 17 harictir.Java ilk girilen indexi ( olarak son girilen indexi ] olarak kabul eder.
		System.out.println(s1.substring(9, 17));//Language
		//s1.substring(0, 1) String'deki ilk harfi verir , charAt(0) gibi
		//s1.substring(0, 1) String return eder, charAt(0) char return eder
		System.out.println(s1.substring(0,1));//J
		System.out.println(s1.substring(5,5));//Index'ler hicbirsey alirsiniz
		//substring() methodunda baslangic Index'i bitis Index'inden buyuk olamaz
		//buyuk olursa Run Time Error alirsiniz.
		//(s1.substring(5,1)
		
		
			//16.trim()
		String s2 = "          Java ogrenen diger dilleri cabucak ogrenir            ";
		//trim() Methodu bir String'in bas ve sonundaki space'leri siler.
		//String'in icindeki space'leri silmez
		System.out.println("trim() kullanmadan once : " + s2);
		System.out.println("trim() kullandiktan sonra : " + s2.trim());
	
		
		
		
		
		
	}

}
