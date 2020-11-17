package day17constructorsstatickeyword;

public class Insan {
	
	int age;
	String name;
	int height;
	boolean isHonest;
	String job;
	String gender;
	
	/*
	 	1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
	 Aksi takdirde Compile Time Error alirsiniz.
	 	2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
	 birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
	 */
	public Insan() {
		this("Nurse", "Erkek");
		System.out.println("Parametresiz");
		
	}
	
	public Insan(String name) {
		this();
		System.out.println("Name parametreli");
	}
	
	public Insan(String job, String gender) {
		
		System.out.println("Job ve Gender parametreli");
		
	}
	
	public static void main(String[] args) {
		/*
		 
		 */
		Insan i1 = new Insan("Ahmet");
		System.out.println(i1.name);
	}

}
