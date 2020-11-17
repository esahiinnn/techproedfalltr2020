package day38collectionsmaps;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapProject {
	static HashMap<String, String> person = new HashMap<>();

	public static void main(String[] args) {
		
		/*
		 		1) Kullanicidan kimlik numarasini(4 haneli), tam ismini, adresini, telefonunu, alin
		 		2) Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin 
		 		saveInfo() method olusturun:
         		3)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
         		4)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
         		5)Ayni kimlik numarasi ile bilgi girilmesine engel olun.
         
         	getInfo() method olusturun:
         1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
         2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.
         
         	removeInfo() method olusturun:
         1)Kimlik numarasini girerek data silin.
         2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
         3)Collection bos ise kullaniciya hata mesaji verin.
         
         	selectOption() method olusturun:
         1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
		 */
				
			selectOption();
			
	}
	
	public static void saveInfo() {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("4 haneli kimlik numaranizi giriniz");
			String key = scan.next();
			
			if(person.containsKey(key)) {
				System.out.println("Var olan bir kimlik numarasi girdiniz lutfen yeniden deneyiniz");
				saveInfo();
			}else {
				
				System.out.println("Isminizi giriniz");
				String name = scan.next();
				
				System.out.println("Soyisminizi giriniz");
				String surName = scan.next();
				
				System.out.println("Adresinizi giriniz");
				String address = scan.next();
				
				System.out.println("Telefon numaranizi giriniz");
				String phoneNum = scan.next();
				
				String value = name + " " + surName + address + " " + phoneNum;
				person.put(key, value);
				
				System.out.println("Ekleme islemi basariyla gerceklesmistir\nListenin yeni hali: " + person);
				selectOption();
				
			}
			
		
			
	}
	public static void getInfo() {
			
				Scanner scan = new Scanner(System.in);
				System.out.println("Aradiginiz elemanin kimlik numarasini giriniz");
				String key = scan.next();
				if(person.containsKey(key)) {
					System.out.println(person.get(key));
				}else if(person.isEmpty()){
					System.out.println("Listeye eleman girisi yapilmamistir.");
				}else {
					System.out.println("Aradiginiz kimlik'de kimse yok veya hatali tuslama yaptiniz\nLutfen tekrar deneyin");
					getInfo();
				}
				
	}
	public static void removeInfo() {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen silmek istediginiz kisinin kimlik no'sunu giriniz");
			String key = scan.next();
			if(person.containsKey(key)) {
				person.remove(key);
				System.out.println("Kisi basariyla silinmistir\nListenin yeni hali " + person);
			}else if(person.isEmpty()){
				System.out.println("Listeye eleman girisi yapilmamistir");
			}else {
				System.out.println("Girdiginiz kimlik no'sunda eleman yoktur lutfen tekrar deneyin");
				removeInfo();
			}
	}
	public static void cikis() {
		System.out.println("Guzel bir gun gecirmeniz dilegiyle...");
	}
	public static void selectOption() {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen yapmak istediginz islemi giriniz\n0:Uygulamadan Cikma\n1:Kullanici ekleme\n2:Kimlik no ile bilgi alma\n3:Eleman silme");
			int entry = scan.nextInt();
			switch(entry) {
			case 0:
				cikis();
				break;
			case 1:
				saveInfo();
				selectOption();
				break;
			case 2:
				getInfo();
				selectOption();
				break;
			case 3:
				removeInfo();
				selectOption();
				break;
				
				default:
					System.out.println("Yanlis giris yaptiniz Lutfen tekrar deneyin");
					selectOption();
					break;
			}
			
	}
	

}
