package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 1 ) Elemanlarini kullanicinin girdigi bir list olusturunuz.
		 		Stringlerin tamami rakamlardan olussun
		 2) Bu listin elemanlarinin carpimini ekrana yazdiriniz.
		 
		 */

						Scanner scan = new Scanner(System.in);

						List<String> ls = new ArrayList<>();
						String str = "";
						do {
							System.out.println("Rakamlardan olusan String'ler giriniz \nString girmeyi durdurmak icin 'S' giriniz");
							str = scan.nextLine();
							ls.add(str);
							
							
						}while(!str.equals("S"));
						ls.remove("S");
						System.out.println(ls);
						int product = 1;
					for( int i=0; i<ls.size(); i++) {
						
						product *= Integer.parseInt(ls.get(i));
						
					}
				System.out.println("Carpim = " + product);
				scan.close();
	}

}
