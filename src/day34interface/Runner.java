package day34interface;

public class Runner {

	public static void main(String[] args) {
		
		
		Civic c1 = new Civic();
		c1.hareket();
		c1.benzin();
		c1.koltuk();
		c1.direksiyon();
		c1.ayna();
		c1.far();
		c1.kaporta();
		c1.garanti();
		c1.jant();
		//Asagidaki code CTE verir cunku; interface'lerdeki tum variable'lar final variable'lar otomatik 
		//olarak final olurlar ve final variable'larin degerleri degistirilemez.
		//c1.fiyat = 30000;
		//"fiyat" variable'ina "interface" ile ulasabiliriz. Object uretmeye gerek yok.
		//Demek ki; interface'lerdeki variable'lar "static" dir.
		System.out.println(IcDonanim.FIYAT);
			
		//Interface'deki tum class member'lar "public" dir. Oyle ise;
		//Interface'deki variable'lar public + static + final'dir.
		
		//Ayni isimli ayni data type'li variable'lar parent interface'lerde olusturulursa
		//olusturulabilir. Ama ayni isimli variable'lari object kullanarak 
		//cagirirsaniz Java hangisini sececegine karar veremez ve CTE verir.
		//CTE almamak icin ayni isimli variable'lar kesinlikle "interface" isimleri kullanarak cagirilmalidir.
		//Zaten interface'lerdeki tum variable'lar static oldugundan dogrusu variable'lari 
		//interface ismi ile cagirmaktir. Java staticleri object ile cagirinca sari alt cizgi verir.
		//System.out.println(c1.MARKA);
		
		System.out.println(IcDonanim.MARKA); // Honda
		System.out.println(DisDonanim.MARKA); // Mazda
		System.out.println(Lastik.MARKA); // Mercedes
		
		
				
		
			

	}

}
