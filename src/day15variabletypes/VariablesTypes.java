package day15variabletypes;

public class VariablesTypes {
	/*												INSTANCE VARIABLE
	 
	 	1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde 
	 		olusturulan variable'lara "instance variable" denir.
	 	2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye
	 		bu variable'lar monte edilir.
	 	3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
	 		Asagida goruldugu gibi "i" variable'ina deger atamasi yaptim "k" variable'ina yapmadim.
	 		Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
	 			"i" variable'i initialize edildi, digerleri initialize edilmedi.
	 	4) Initialize edilmeyen "instance variable" lar icin Java kendisi deger atamasi yapar.		
	 		Java'nin instance variable'lara kendisinin verdigi degerlere "default value" denir.
	 				byte, short, int, long icin default value 0'dir.
	 				float, double icin default value 0.0'dir.
	 				char icin default value 0'dir.
	 				boolean icin default value false'dur.
	 				String icin default value "null" dir.
	 		
	 */
	
	int i = 12;
	int k;
	String s;
	boolean b;
	double d;
	char c;
	
	/*															LOCAL VARIABLE
	 
	 	1) Main method'un veya olusturdugumuz baska bir method'un icinde olusturulan variable'lara
	 		"local variable" denir.
	 	2) Local variable'lara deger atamasi yapmak zorundayiz, aksi takdirde o variable'i kullanamayiz.
	 		Java local variable'lar icin "default value" atamasi yapmaz.
	 
	 */

	public static void main(String[] args) {
		
		int a = 13;
		System.out.println(a);
		


	}

}
