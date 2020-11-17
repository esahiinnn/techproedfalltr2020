package homework18;



public class Arrays04 {

	public static void main(String[] args) {
		
		/*
		 6) Bir array’de herhangi iki elemanın aynı olup olmadığını kontrol
eden bir program yazınız.Aynı eleman varsa “Aynı eleman var” yoksa
“Aynı eleman yok” yazdırınız.
		 */
		int a[] = {0, 1, 2, 3, 4, 2,7};
		int count = 0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<i; j++){
				if(a[i]==a[j]) {
					count++;
				}
			}
		}
		if(count>0) {
			System.out.println("Ayni eleman var");
		}else {
			System.out.println("Ayni eleman yok");
		}
		
			
	}

}
