package day17constructorsstatickeyword;

public class StaticKeyword02 {

	public static void main(String[] args) {
		//Static olanlara sadece class ismi kullanarak ulasabilirsiniz
		System.out.println(StaticKeyword01.gender);
		System.out.println(StaticKeyword01.k);
		
		//Instance olanlara ulasmak icin object uretmek zorundasiniz
		StaticKeyword01 obj1 = new StaticKeyword01();
		System.out.println(obj1.i);
		System.out.println(obj1.name);
		
//		//Static olanlara object uzerinden ulasabilirsiniz ama tavsiye edilmez
//		System.out.println(obj1.gender);
//		System.out.println(obj1.k);
	}

}
