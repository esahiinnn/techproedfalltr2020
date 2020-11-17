package day25stringbuilder;

public class Sb02 {

	public static void main(String[] args) {
		
		//StringBuilder Class'i kullanarak String uretmek
		
			//1.Yol :
		StringBuilder sb1 = new StringBuilder(); //Bos bir String urettik
		System.out.println(sb1.capacity()); //Bos bir String olusturuldugunda Java memory'de 
																//16 karakterlik yer ayirir.
		System.out.println(sb1.length()); // lenght() methodu var olan character sayisini verir ==> 0		
		sb1.append("Java");
		System.out.println(sb1); //Java		
		sb1.append(" guzeldir");
		System.out.println(sb1); //Java guzeldir		
		sb1.append(". Ama ").append(" calismak gerekir.");// Java guzeldir. Ama  calismak gerekir.
		System.out.println(sb1);
		System.out.println(sb1.capacity()); //70 ==> 16'yi asinca +16 yapiyor. 32'yi asinca 2*32+2 ekliyor
																//     ==> 32'yi astik bu yuzden 32 + 32 + 2 + 4(3.16'dan sonraki 4) = 70
		
		//2.Yol :
		StringBuilder sb2 = new StringBuilder(11); // Kapasitesi 11 olan bos bir String olusturuldu.
		System.out.println(sb2.capacity()); //11
		System.out.println(sb2.length());//0
		sb2.append("AliAliAli"); 
		System.out.println(sb2.capacity());//20
				
		//3.Yol:
		StringBuilder sb3 = new StringBuilder("Java"); //Belli bir String uretmek icin kullanilir.
		System.out.println(sb3.capacity()); //4+16 = 20
		System.out.println(sb3.length()); //4
		StringBuilder sb4 = new StringBuilder("JavaJavaJavaJavaJava");
		System.out.println(sb4.capacity()); //16 + 16 + 4 =36
		
		//Fazladan ayrilan capacity'yi azaltmak
		sb4.trimToSize();
		System.out.println(sb4.capacity());//20
	
		//Istenen bir character'i index'ine gore almak
		System.out.println(sb4.charAt(5));//a
		
		//Belli araliktaki character'leri almak
		System.out.println(sb4.subSequence(4, 11));//JavaJav
		
		//6.character'den sonraki tum characterleri almak istiyorum
		System.out.println(sb4.substring(5)); //avaJavaJavaJava
		
		//Belli bir index'deki characteri silmek
		sb4.deleteCharAt(5);
		System.out.println(sb4); //JavaJvaJavaJavaJava
		
		//Index 4'den index 6'ya kadar tum characterleri siliniz
		sb4.delete(4, 7);
		System.out.println(sb4); //JavaJavaJavaJava
		
		//Istenen index'e istenen character veya characterleri eklemek
		sb4.insert(4, "X");
		System.out.println(sb4); //JavaXJavaJavaJava
		
		//Istenen index'teki character'i degistirmek
		sb4.setCharAt(4, ' ');
		System.out.println(sb4); //Java JavaJavaJava
		
		//Istenen index'teki character'in yerine birden fazla character eklemek
		sb4.replace(9, 13, " ");
		System.out.println(sb4); //Java Java Java
		
		//Bir tane String olusturun, sonra bu String'i loop kullanarak tersten yazdirin.
		//1.Yol
		StringBuilder str = new StringBuilder("Merhaba Java");
		System.out.println(str);
		
		for(int i =str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		//2.Yol
		StringBuilder sb = new StringBuilder("Merhaba Java");
		sb.reverse();
		System.out.println(sb);
		
		//String ile StringBuilder karsilastirmasi
		String s01 = "Java";
		
		StringBuilder sb01 = new StringBuilder("Java");
		//System.out.println(s01== sb01); ==> Farkli data type'lari  "==" sembolu ile karsilastirilirsa CTE verir.
		
		System.out.println(s01.equals(sb01)); //false
		System.out.println(s01.equals(sb01.toString())); //true - toString() StringBuilder'i String'e donusturur.
		
	}

}
