package day34interface;

public abstract class Honda {
	/*
	 	1) Interface'lerde "concrete" methodlar kullanilamaz, sadece "abstract" methodlar kullanilabilir.
	 	Interface'ler SADECE mecbur yapilmasi gerekenleri depolamak icin kullanilir.
	 	
	 	2) Java Multiple Inheritance'i desteklemez ama parent'lar class ise desteklemez. Parent'lar interface
	 	ise Java multiple inheritance'i destekler.
	 	
	 	3) Birden fazla parent class oldugunda farkli parent class'larda ayni isimli methodlarin olmasi mumkundur
	 	Bu tip durumlarda child class ayni isimli farkli body'li methodlardan hangisini kullanacagina karar veremez.
	 	Fakat interface'lerde method'larin body'leri olmadigindan ayni isimli methodlar birbirinin tamamiyla aynisidir.
	 	Bu methodlardan birini override etmek hepsini override etmek manasina gelir.
	 	
	 	Note: Ayni method signature sahip ama return type'lari farkli methodlar varsa Java interface'ler icin de CTE verir.
	 	
	 	4) 
	 */

		public abstract void hareket();
		
		public void dizel() {
			System.out.println("Dizel");
		}
		public void benzin() {
			System.out.println("Benzinli");
		}
}
