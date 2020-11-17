package day03ifstatement;

public class Comparators {

	public static void main(String[] args) {
			//Comparator : Karsilastirma islemleri.
			//Java'da iki variable'in degeri karlilastirildiginda Java sonuc olarak boolean return eder.
			//Yani karsilastirma yaptiginizda Java size true veya false der.
			System.out.println(5 > 3);//true
			System.out.println(5 < 3);//false
			//Matematik'de esittir demek icin 1 tane "=" sembolu yeter fakat Java'da esittir demek icin "==" sembolu gerekir.
			
			System.out.println(5 == 3);//false
			
			System.out.println(5 <= 5);
			
			System.out.println(5 >= 3);
			
			//Unlem isareti (!) olumsuzluk anlaminda kullanilir.
			System.out.println(5 != 3);
			
	}

}
