package day21arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
		
		//Array'i List'e cevirmek
		
		String arr[] = {"Aliye", "Veli", "Canan", "KemaL"};
		
		//Array'i List'e cevirmek icin Arrays class'indan asList () methodunu kullaniriz.
		List<String> l1 = Arrays.asList(arr);
		
		System.out.println(l1); //[Aliye, Veli, Canan, KemaL]
		
		//Array'den uretilen list'lerde size'i degistiren methodlar kullanilamaz.
		//Ornegin; add (), remove (), clear (), gibi...
		//Bu methodlardan kullanirsaniz Java Run Time Error verir. (Unsupported0perationException)
		//l1.add("Yahya");
		//System.out.println(l1);
		
		//List'i Array'e cevirmek
		String arrayFromList[] = l1.toArray(new String[0]);
		System.out.println(Arrays.toString(arrayFromList));
		
		//Not : remove () methodu integer list'lerde kullanilirken remove () methodunun icine konulan deger 
		//her zaman index olarak alinir, eleman olarak dusunulmez.
		List<Integer> l2 = new ArrayList<>();
		l2.add(5);
		l2.add(2);
		l2.add(4);
		l2.add(3);
		l2.add(1);
		System.out.println(l2);
	
		l2.remove(2);
		System.out.println(l2);
	
	}

}
