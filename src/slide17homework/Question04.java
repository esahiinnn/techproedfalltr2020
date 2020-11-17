package slide17homework;

public class Question04 {

	public static void main(String[] args) {
		/*
		 For-each loop Soru 3:
İki String array oluşturunuz ve bu array’lerdeki ortak elemanları
For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
Ortak eleman yoksa ekrana “Ortak eleman yok” yazdırınız
		 */

				String arr[] = {"A", "B", "C", "D"};
				String arr2[] = {"B", "C", "Z", "H"};
//				int counter = 0;
//				for(int i = 0; i<arr.length; i++){
//					for(int j = 0; j<arr2.length; j++) {
//						if(arr[i].equals(arr2[j])) {
//							System.out.print(arr[i] + " ");
//							counter++;
//						}
//					}
//				}
//				System.out.println();
//				System.out.println("Iki loop arasinda " +  counter + " tane ortak eleman vardir");
				
				int sayici = 0;
				for(String w: arr) {
					for(String i : arr2) {
						if(w.equals(i)) {
							System.out.println(i);
							sayici++;
						}
					}
				}
				if(sayici==0) {
					System.out.println("Ortak eleman yoktur");
				}else{
					System.out.println("Yukarida yazan elemanlar iki dizinin ortak elemanlaridir.");
				}
				
	}

}
