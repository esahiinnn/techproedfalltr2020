package day35interfaceiterators;

public interface I01 {
	
	/*
	 		Method olustururken "default" ve "static" keyword'lerini kullanarak 
	 isterseniz interface icinde "concrete" methodlar olusturabilirsiniz.
	 */
	
	/*
	 		ONEMLI NOT: Interface icinde concrete method olusturmak icin kullanilan "default" 
	 keyword'u access modifier degildir. Asagidaki method'da gordugunuz gibi access modifier
	 public'dir. 
	 
	 		Not: "default" keyword'unu kullanarak olusturulan method'lara "default method" denir.	 
	 */

	/*
	 		Asagida gordugunuz gibi interface icinde concrete method olusturmanin 2 yolu vardir;
	 1)"default" keyword'unu kullanmak ==> Baska class'lardan bu methoda ulasmak icin 
	 																 object olusturmalisiniz
	 2)"static" keyword'unu kullanmak   ==>	 Baska class'lardan bu methoda ulasmak icin
	 																 object olusturmaniza gerek yok sadece interface 
	 																 ile method'a ulasabilirsiniz.
	 */
		public  default int add() {
			return 2;
		}
		public static int multiply() {
			return 4*3;
		}
}
