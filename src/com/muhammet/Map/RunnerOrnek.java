package com.muhammet.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class RunnerOrnek {

	public static void main(String[] args) {
		/**
		 * List<>
		 * ArrayList<>
		 * HashSet<>
		 * 
		 * (K)ey-> Reference Data Type -> new 
		 */
		HashSet<String> deger = new HashSet<String>();
		ArrayList<String> arrayList = new ArrayList<String>();
		/**
		 * Interface -> new yapamazsýnýz. 
		 * bir interface den miras alan sýnýflarý new leyerek onlardan nesne 
		 * oluþturarak atama yapabilirsiniz.
		 * --> Polimorphism
		 */
		/**
		 *  Key-1 -> "Ahmet BAÞ"
		 *  Key-1 -> {"Ahmet","Aslan"}
		 * 
		 */
		
		Map<String,List<String>> Tarihler = new HashMap<>();
		List<String> günler = List.of("Pazartesi","Salý","Çarþamba","Perþembe","Cuma","Cumartesi","Pazar");
		List<String> aylar = List.of("Ocak","Þubat");
		List<String> mevsimler = List.of("Ýlk Bahar","Yaz","Sonbahar","Kýþ");
		
		Tarihler.put("Gunler", günler);
		Tarihler.put("Aylar", aylar);
		Tarihler.put("Mevsimler",mevsimler);
		
		System.out.println("Günler.. 3. gün...: "+ Tarihler.get("Gunler").get(2)); 
		
		Map<Integer, String> tanim1;
 		
		Integer integer = 122;// references data type
		int sayi1; // 32 bit -> 0 0 0 0 0 0 0 0-> 0
		//integer = null;
		int sayi = 45; // primitive datatype
		// @Deprecated-> bu method daha önceden kullanýlýyordu(önceki sürümlerde kullanýlýyordu)
		// ilerleyen sürümlerde kullanýmdan kaldýrýlacak demektir.
		// Peki Sorun Olur mu?
		// Eðer java sürümünü uyguladýðýnýz proje için güncellemeyecekseniz ve uygulamanýzý
		// kullanan kiþiler güncel java sürümleri kullanamayacak ise sorun olmaz böyle devam eder.
		
		Integer indeger = new Integer(555); // Boxing
		integer = sayi;   // AutoBoxing
		sayi = integer;   // AutoUnBoxing
		//-----------------------------------------
		/**
		 * long longSayi = 2L;
		 * int intSayi = 5;
		 * longSayi = intSayi;
		 * ÖNEMLÝ!!!!!
		 */
		Long rLongSayi=5L;
		long longSayi = 45L;
		rLongSayi = longSayi;
		longSayi = rLongSayi;
		int intdeger  = 5;
		longSayi = indeger;
		longSayi = 4555;
		// rLongSayi = indeger; // ÇALIÞMAZ
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		Map<Long,String> stokUrunleri = new HashMap<Long,String>();
		stokUrunleri.put(1L, "10gr Þeker");
		stokUrunleri.put(1L, "50gr Þeker");
		stokUrunleri.put(1L, "100gr Þeker");
		stokUrunleri.put(2L, "200gr Þeker");
		stokUrunleri.put(3L, "500gr Þeker");
		stokUrunleri.put(4L, "1Kg Un");
		stokUrunleri.put(5L, "5Kg Un");
		
		System.out.println("map in uzunlulu...: "+ stokUrunleri.size());
		System.out.println("K->1 için.....: "+ stokUrunleri.get(1L));
		System.out.println("K->2 için.....: "+ stokUrunleri.get(2L));
		/**
		 * Bir listede silme iþlemi için index
		 * MAp -> silme ve okuma iþlemleri Key ile yapýyorsunuz.
		 */
		stokUrunleri.remove(2L);
		System.out.println("K->1 için.....: "+ stokUrunleri.get(1L));
		/**
		 * Bazen null gelen deðerler bizi soruna sürükler.
		 */
		/**
		 * gr yazýnýzýn olduðu index deðerini bulurum.(3) bulunla 0 index ten 
		 * baþlayarak ilgili index e kadar olan kýsmý alýrým ve bunun o kayýt için
		 * gramaj olduðunu belirlerim.		
		 */
		System.out.println("K->2 için.....: "+ 
		 stokUrunleri.getOrDefault(2L,"0gr ürün")
				.substring(0,stokUrunleri.getOrDefault(2L,"0gr ürün").indexOf("gr")));
		
		
		
		
		
	}

}
