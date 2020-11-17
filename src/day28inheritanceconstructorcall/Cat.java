package day28inheritanceconstructorcall;

public class Cat extends Mammal{

		public void mC() {
			System.out.println("Cat");
		}
		public int c = 2;
		public int d = 5;
		
		public Cat() {
			super();
				System.out.println("Parametresiz Cat");
		}
		public Cat(String s) {
				this();
				/*
				 		Parent Class'dan variable veya method secmek icin 
				 super keyword'unu kullanabilirsiniz.
				 */
				System.out.println(super.c);
				System.out.println("Parametreli Cat");
		}
}
	
		