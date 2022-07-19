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
		 * Interface -> new yapamazs�n�z. 
		 * bir interface den miras alan s�n�flar� new leyerek onlardan nesne 
		 * olu�turarak atama yapabilirsiniz.
		 * --> Polimorphism
		 */
		/**
		 *  Key-1 -> "Ahmet BA�"
		 *  Key-1 -> {"Ahmet","Aslan"}
		 * 
		 */
		
		Map<String,List<String>> Tarihler = new HashMap<>();
		List<String> g�nler = List.of("Pazartesi","Sal�","�ar�amba","Per�embe","Cuma","Cumartesi","Pazar");
		List<String> aylar = List.of("Ocak","�ubat");
		List<String> mevsimler = List.of("�lk Bahar","Yaz","Sonbahar","K��");
		
		Tarihler.put("Gunler", g�nler);
		Tarihler.put("Aylar", aylar);
		Tarihler.put("Mevsimler",mevsimler);
		
		System.out.println("G�nler.. 3. g�n...: "+ Tarihler.get("Gunler").get(2)); 
		
		Map<Integer, String> tanim1;
 		
		Integer integer = 122;// references data type
		int sayi1; // 32 bit -> 0 0 0 0 0 0 0 0-> 0
		//integer = null;
		int sayi = 45; // primitive datatype
		// @Deprecated-> bu method daha �nceden kullan�l�yordu(�nceki s�r�mlerde kullan�l�yordu)
		// ilerleyen s�r�mlerde kullan�mdan kald�r�lacak demektir.
		// Peki Sorun Olur mu?
		// E�er java s�r�m�n� uygulad���n�z proje i�in g�ncellemeyecekseniz ve uygulaman�z�
		// kullanan ki�iler g�ncel java s�r�mleri kullanamayacak ise sorun olmaz b�yle devam eder.
		
		Integer indeger = new Integer(555); // Boxing
		integer = sayi;   // AutoBoxing
		sayi = integer;   // AutoUnBoxing
		//-----------------------------------------
		/**
		 * long longSayi = 2L;
		 * int intSayi = 5;
		 * longSayi = intSayi;
		 * �NEML�!!!!!
		 */
		Long rLongSayi=5L;
		long longSayi = 45L;
		rLongSayi = longSayi;
		longSayi = rLongSayi;
		int intdeger  = 5;
		longSayi = indeger;
		longSayi = 4555;
		// rLongSayi = indeger; // �ALI�MAZ
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		Map<Long,String> stokUrunleri = new HashMap<Long,String>();
		stokUrunleri.put(1L, "10gr �eker");
		stokUrunleri.put(1L, "50gr �eker");
		stokUrunleri.put(1L, "100gr �eker");
		stokUrunleri.put(2L, "200gr �eker");
		stokUrunleri.put(3L, "500gr �eker");
		stokUrunleri.put(4L, "1Kg Un");
		stokUrunleri.put(5L, "5Kg Un");
		
		System.out.println("map in uzunlulu...: "+ stokUrunleri.size());
		System.out.println("K->1 i�in.....: "+ stokUrunleri.get(1L));
		System.out.println("K->2 i�in.....: "+ stokUrunleri.get(2L));
		/**
		 * Bir listede silme i�lemi i�in index
		 * MAp -> silme ve okuma i�lemleri Key ile yap�yorsunuz.
		 */
		stokUrunleri.remove(2L);
		System.out.println("K->1 i�in.....: "+ stokUrunleri.get(1L));
		/**
		 * Bazen null gelen de�erler bizi soruna s�r�kler.
		 */
		/**
		 * gr yaz�n�z�n oldu�u index de�erini bulurum.(3) bulunla 0 index ten 
		 * ba�layarak ilgili index e kadar olan k�sm� al�r�m ve bunun o kay�t i�in
		 * gramaj oldu�unu belirlerim.		
		 */
		System.out.println("K->2 i�in.....: "+ 
		 stokUrunleri.getOrDefault(2L,"0gr �r�n")
				.substring(0,stokUrunleri.getOrDefault(2L,"0gr �r�n").indexOf("gr")));
		
		
		
		
		
	}

}
