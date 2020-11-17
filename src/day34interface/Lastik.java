package day34interface;

public interface Lastik extends DisDonanim{
	public static final String MARKA = "Mercedes";
	
		/*
		 		Interface'i interface'e parent yaparken extends keyword kullanilir.
		 		
		 		class ==> class : extends 
		 		interface ==> interface : extends
		 		class ==> interface : implements
		 		interface ==> class : OLMAZ bir interface'in parent'i class olamaz
		 */
	
	void garanti();
	
	void jant();

}
