package day30exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class E02 {

	public static void main(String[] args) throws IOException  {

		/*
		 		Dosyanin path'i dosyaya sag tiklayip properties'e gidip ordan bulunabilir.
		 */
		
		// Dosyaya ulasmak
		FileInputStream fis = new FileInputStream("src/day30exceptions/TextFileTr");
		
		// Ulasilan dosya uzerinde islem yapmak, ornegin okumak
		int k;
		
		while((k = fis.read()) != -1) {
			System.out.print((char) k);
		}

	}

}
