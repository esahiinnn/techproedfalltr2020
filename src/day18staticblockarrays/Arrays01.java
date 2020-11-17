package day18staticblockarrays;

import java.util.Arrays;

public class Arrays01 {

		int x = 12;
		
		/*
		 	1) Array'ler birden fazla degeri depolamak icin kullanilir.
		 	2) Array'lere konulan degerlerin data type'leri ayni olmalidir.
		 	3) Array olustururken mutlaka kac eleman yerlestirecegimizi belirtmemiz gerekir.
		 	4) Array'lerde sadece a) primitive b)reference'lar depolanabilir.
		 */
	public static void main(String[] args) {
			//Array olusturmak
			int a[] = new int [4];
			//Olusturulan Array'i console'a yazdirmak
			System.out.println(Arrays.toString(a)); // [0, 0, 0, 0]
			
			//Array'e eleman eklemek
			a[0] =8;
			System.out.println(Arrays.toString(a));// [8, 0, 0, 0]
			a[2] = 15;
			System.out.println(Arrays.toString(a));// [8, 0, 15, 0]
			a[a.length-1] = 8;
			a[2] = 15;
			System.out.println(Arrays.toString(a));// [8, 0, 15, 8]
			a[1] = 23;
			System.out.println(Arrays.toString(a));// [8, 23, 15, 8]
			
			//Array'de kac eleman oldugunu bulmak
			//Stringlerde kullandigimiz "length()"'dir Arrayler'de kullandigimiz "length" dir.
			System.out.println(a.length);
			
			
			
			
			String b[] = new String [3];
			System.out.println(Arrays.toString(b)); //[null, null, null, null]
			b[0] = "Ali";
			System.out.println(Arrays.toString(b));//[Ali, null, null]
			b[1] = "Ayse";
			System.out.println(Arrays.toString(b));//[Ali, Ayse, null]
			b[2] = "Kemal";
			System.out.println(Arrays.toString(b));//[Ali, Ayse, Kemal]
			
			//Bir array'den specific bir elemani yazdirmak
			System.out.println(b[2]);//Kemal
			System.out.println(b[0]);//Ali
			System.out.println(b[1]);//Ayse
			
			//Array'deki elemanlari 1'er 1'er ekrana yazdirmak
			//b array'indeki elemanlari alt alta consele'a yazdiriniz
			
				for(int i=0; i<b.length; i++ ) {
					System.out.println(b[i]);
				}
			
			 // a array'indeki elemanlari ayni satira onlerine "*" koyarak tersten yazdirin
				for(int i=a.length-1; i>=0; i--) {
					System.out.print(" *" + a[i]);
				}
		
				//a array'inde index'i cift olanlari yazdirin
				
				System.out.println();
				for(int i=0; i<a.length; i++) {
					if(i%2==0) {
						System.out.print(a[i]+ " ");
					}
				}
				
				
				//Array'deki elemanlari kucukten buyuge(ascending order) siralamak
				
				//a Array'indeki elemanlari kucukten buyuge siralayiniz
				System.out.println();
				Arrays.sort(a); // [8, 8, 15, 23]
				System.out.println(Arrays.toString(a));
				
				//sort() methodunu b array'i icin kullanin.
				//String Array'lerde sort() methodu alfabetik siralama yapar.
				//Java'da kucukten buyuge siralama ve alfabetik siralama yerine "Natural order" kullanilir.
				
				
				Arrays.sort(b);
				System.out.println(Arrays.toString(b));
	}

}
