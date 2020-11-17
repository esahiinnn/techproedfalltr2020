package day34interface;

  interface IcDonanim {
	/*
	 		1) Java "interface"ler icindeki tum methodlarin abstract method olmasi gerektigini bilir.
	 	Bu yuzden siz method uretirken abstract yazsanizda olur yazmasaniz da olur.
	 	public abstract void koltuk(); ile public void koltuk(); tamamiyle aynidir.
	 	
	 		2) Interface'lerdeki hersey otamatik olarak public'dir. Bu yuzden access modifier'i 
	 	public olarak yazsaniz da olur yazmasaniz da olur.
	 	public abstract void koltuk(); ile  abstract void koltuk(); ile abstract void koltuk(); aynidir.
	 		
	 		3) Normalde access modifier yamayinca access modifier default olur ama interface'lerde 
	 	access modifier her zaman public oldugundan yazmasaniz da o public'dir.
	 		
	 		4) Interface class degildir, interface interface'dir.
	 */
	
		/*
		 	1) interface'deki tum variable'lar "final" dir.
		 	"final" variable olusturdugunuzda isimleri "bold" olarak yazilir.
		 	2) public static final String marka = "Honda"; ile String marka = "Honda"; tamamiyle aynidir.
		 	3) Genel kullanim olarak "final variable" larin isimleri buyuk harflerle yazilir.
		 */
	 int FIYAT = 20000;
	 
	 public static final String MARKA = "Honda";
	
	public abstract void koltuk();
	
	public void direksiyon();
	
	void ayna();

}
