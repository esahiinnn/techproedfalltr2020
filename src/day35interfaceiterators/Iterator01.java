package day35interfaceiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

	public static void main(String[] args) {

			
		List<String> list1 = new ArrayList<>();
		
		list1.add("B");
		list1.add("C");
		list1.add("A");
		list1.add("D");
		System.out.print(list1);
		System.out.println();
		System.out.println("===========");
		
		//List elemanlarini for loop kullanarak yazdiriniz
		for(int i = 0; i<list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();
		System.out.println("================");
		//List elemanlarini for-each lop kullanarak yazdiriniz
		for(String w : list1) {
			System.out.print(w + " ");
		}
		System.out.println();
		System.out.println("============");
		
		//list1'i for loop kullanarak update ediniz	
		for(int i = 0; i<list1.size(); i++) {
			list1.set(i, list1.get(i) + "!");
		}
		System.out.println(list1);
		System.out.println("============");
		
		//list1'i for each kullanarak update ediniz elemanlarinin sonuna "!" ekleyin
		//Gordugunuz gibi set() method'unu kullanabilmek icin index lazim ama for each loop
		//index kullanmaz. Bu yuzden for-each loop kullanarak list'ler update edilemezler.
		
		/*
		 	for loop kullanarak list'leri update etmek istemiyorum, for-each loop da listleri
		update edemiyor. Bu durumda for loop kullanmadan list'leri update edebilmek icin
		iterator'larik kullaniriz.
		 */
		
		List<String> list2 = new ArrayList<>();
		list2.add("U");
		list2.add("V");
		list2.add("Y");
		list2.add("Z");
		System.out.println(list2);
		System.out.println("============");
		
		Iterator<String> it2 = list2.iterator();
		while(it2.hasNext()) {
			 it2.next();
			it2.remove();
		}
		
		System.out.println(list2);
		System.out.println("============");
		
		List<String> list3 = new ArrayList<>();
		list3.add("K");
		list3.add("L");
		list3.add("M");
		System.out.println(list3);
		System.out.println("==============");
		
		ListIterator<String> it3 = list3.listIterator();
		while(it3.hasNext()) {
			String el = it3.next();
			it3.set(el + "!");//list elemanlarini update eder
			it3.add(el);//list'e eleman ekler
			
		}
		System.out.println(list3);
		System.out.println("============");
		List<String> list4 = new ArrayList<>();
		list4.add("e");
		list4.add("f");
		list4.add("g");
		System.out.println(list4);
		
		ListIterator<String> it4 = list4.listIterator();
		
		/*
		 		Not: hasPrevious() ve previous() method'larini kullanmadan once 
		 	hasNext() ve next() methodlarini kullanarak pointer'i en saga yollamaliyiz.
		 */
		
		/*
		 		Sadece son elemanin basina "*" koyunuz ve list elemanlarini sondan basa dogru yazdiriniz.
		 */
		int counter = 0;
		while(it4.hasNext()) {
			String el = it4.next();
			if(counter == list4.size()-1) {
				it4.set("*" + el);
			}
			counter++;
		}
		while(it4.hasPrevious()) {
			String el = it4.previous();
			System.out.print(el + " ");
			
		}
		
		/*
		 "iterator" ile "listiterator" in farklari nelerdir?
		 	1) "iterator" sadece hasNext(), next() ve "remove()" methodlarini icerir
		 		"listiterator" ise "hasNext()", "next()", "remove()", "hasPrevious()", "previous()",
		 		"add()", "set()" methodlarini icerir.
		 	2) "listiterator" adindan da anlasilacagi gibi sadece list'ler icin kullanilir.
		 		"iterator" ise list, map, set gibi diger collection'lar icin de kullanilir.
		 	3) "iterator" kullanarak sadece bastan sonra dogru seyahat edebilirsiniz.
		 		"listiterator" kullanarak cift yonlu seyahat edebilirsiniz.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
