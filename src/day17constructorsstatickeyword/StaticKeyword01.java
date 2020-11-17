package day17constructorsstatickeyword;

public class StaticKeyword01 {
	/*
	 	=> Class'in icinde methodlarin disinda olusturulan variable'lara "instance variable" denir.
	 	=> Class'in icinde methodlarin disinda olusturulan static variable'lara "Class variable" denir.
	 	=> Instance variable'lar gibi Class variable(Static variable)'lar icin de default value vardir.
	 	=> Static variable'lara ulasmak icin object olusturmaya gerek yoktur.
	 	=> Direkt class icinden static olanlara ulasilabilir.
	 	=> Instance variable(Object Variable)'lara ulasmak icin object olusturmak zorundayiz.Object olusturmadan
	 instance variable'a ulasilamaz.
	 	=> Static variable'lara object uzerinden ulasilabilir fakat mantikli degildir.
	 	=> Eger static variable'lara object uzerinden ulasirsaniz Java sizi sari alt cizgi ile uyarir.
	 	
	 */
	int i;	
	static int k;
	String name = "Ali";
	static String gender = "Erkek";
	public static void main(String[] args) {
		

	}

}
