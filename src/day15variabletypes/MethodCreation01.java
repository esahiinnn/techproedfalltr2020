package day15variabletypes;

public class MethodCreation01 {
	/*
	 Static method'un icinde kullanilan hersey static olmalidir.
	 */
	
	/*
	 Method olustururken ayni method isimlerinin kullanabilirsiniz ama parametreler farkli olmak kaydiyla
	 		Parametreleri farkli yapmanin 3 yontemi vardir.
	 			1)Parametre sayilarini farkli yapabilirsiniz
	 			2)Parametrelerin data type'larini degistirebilirsiniz.
	 			3)Data type'lari farkli ise parametrelerin yerlerini degistirebilirsiniz.
	 */

	public static void main(String[] args) {
		
		
		toplama(3, 5); 
		toplama(6.3, 1.2);
		
		carpma(2, 3);
		carpma(5, 10.5);
		
		carpma(5, 6, 10);
		
		
		
		
		
		
	}

	public static void toplama (double a, double b) {
		System.out.println(a+b);
	}
	
	//Iki double'i carpan Carpma methodu create edin
	//Bu methodu main method icinden cagirarak calistirin
	
	
	/*
	 Method parantezinin icindeki variable'lara parametre denir.
	 Methodu main methoda cagirirken ki kullanilan sayilara argument denir.
	 */
		
	
	public static void carpma(double a, double b) {
		System.out.println(a*b);
	}
	
	public static void carpma(int  a, double b) {
		System.out.println(a*b);
	}
	public static void carpma(int  b, int a) {
		System.out.println(a*b);
	}
	
	//Uc double'i carpan bir carpma methodu olusturun
	//Bu methodu main method icinden cagirarak calistirin
	
	
	public static void carpma(double a, double b, double c) {
		System.out.println(a*b*c);
	}
}
