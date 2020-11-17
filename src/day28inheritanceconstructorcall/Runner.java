	package day28inheritanceconstructorcall;
	
	public class Runner {
	
		public static void main(String[] args) {
			
			Cat c1 = new Cat();
			
			/*
			  Ayni isimli variable'lardan hangisinin kullanildigina 
			karar vermek icin olusturulan object'in data type'ina bakiniz.
			Variable'i arastirmaya data type'i classindan baslayiniz.
			*/
			System.out.println(c1.a); // 0
			System.out.println(c1.c); // 2 
			System.out.println(c1.d); // 5
			System.out.println(c1.m); // 1
			
			Mammal c2 = new Cat("X");
			System.out.println(c2.c); // 4
			System.out.println(c2.a); // 0		
			System.out.println(c2.m); // 1
			
			Cat c3 = new Cat();
			/*
			 Method cagirilirken ayni isimli methodlardan
			 hangisinin kullanilacagina Constructor karar verir.
			 Methodlari arastirmaya Consctuctor ismini tasiyan 
			 class'dan baslayin ve parentlarda arastirmaya devam edin.
			 */
			c3.mA();
			c3.mC();
			c3.mM();
			
			Mammal c4 = new Mammal();
			c4.mA();
			c4.mC();
			c4.mM();
			
			/*
			 		Data Type ve Consctructor farkli classlardan ise
			 method arastirmaya parent olan class'dan baslayin.
			 */
			Mammal c5 = new Cat();
			c5.mA();
			c5.mC();
			c5.mM();
			
			
		}
	
	}
