package day18staticblockarrays;

public class StaticBlock01 {

		static double pi;
		static String s;
		static int i = 30;
		/*
		 	1) Static Block static variable'lara deger atamasi yapmak(initialize) icin kullanilir
		 	2) Static Block Class olusturulurken butun methodlardan(main method dahil) once calistirilir.
		 	3) Birden fazla Static Block varsa ustteki once calisir.
		 */

		static {
			pi = 3.14;
			System.out.println(pi);
		}
		static {
			s = "Ali " + pi;
			System.out.println(s);
		}
		
		
	public static void main(String[] args) {
		
		alanDaire(10);
			
	}

		public static void alanDaire(double r) {
			System.out.println("Dairenin Alani : " + pi*r*r);
			
		}
}
