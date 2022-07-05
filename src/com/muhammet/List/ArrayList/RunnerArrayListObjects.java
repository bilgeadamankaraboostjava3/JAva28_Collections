package com.muhammet.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RunnerArrayListObjects {

	public static void main(String[] args) {

		
		
		List<Ogretmen> ogretmenListesi = new ArrayList<Ogretmen>();
		ogretmenListesi.add(new Ogretmen("Ayþe","KESKÝN","0 555","Ankara",Branslar.SinifOgetmeni));
		List<Ogrenci> ogrenciListesi = new ArrayList<Ogrenci>();	
		
		List<Ders> dersListesi = new ArrayList<Ders>();
		dersListesi.add(new Ders(Dersler.Matematik,ogretmenListesi.get(0), 0, 0));
		dersListesi.add(new Ders(Dersler.Turkce,ogretmenListesi.get(0), 0, 0));
		dersListesi.add(new Ders(Dersler.Resim,ogretmenListesi.get(0), 0, 0));
		
		// öðreci oluþturabilmek içi ders listesi eklemeliyim.
		ogrenciListesi.add(new Ogrenci("OKL001", "Kerim", "BAÞ", "Ankara",dersListesi));
		ogrenciListesi.add(new Ogrenci("OKL002", "Bahar", "KUÞ", "Ankara",dersListesi.subList(0, 2)));
		// sinif için öðrenci ve öðretmen listesine ihtiyacým var
		Sinif sinif = new Sinif(10, true, 10, "2-A", ogrenciListesi, ogretmenListesi);
		/**
		 *  Peki bu bilgilere nasýl ulaþacaðýz.
		 */
		
		sinif.getOgrenciListesi(); // Sýnýf nesnesi içindeki öðrenci listesine eriþiyoruz.
		sinif.getOgrenciListesi().get(0); // sinif içindeki -> öðrenci listesindeki 1. öðrenci
		sinif.getOgrenciListesi().get(0).getDersListesi(); // sinif->öðrencilistesi 1. öðrenci-> ders listesi
		sinif.getOgrenciListesi().get(0).getDersListesi()
					.forEach(d-> System.out.println(d.toString()));
		
		for (Ogrenci ogrenci : sinif.getOgrenciListesi()) {
			System.out.println("--------------------------------");
			System.out.println("Öðrenci...: "+ ogrenci.getAd()+" "+ ogrenci.getSoyad());
			ogrenci.getDersListesi().forEach(d-> System.out.println(d.toString()));
			System.out.println("--------------------------------");
		}
	}
	
	private static void ilkkod() {
		//List<Ogrenci> sinifListesi = new ArrayList<Ogrenci>();
		//Ogrenci ogrenci = new Ogrenci(null, null, null, null);
		/**
		 
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.ad = "Ahmet";
		ogrenci.soyad = "BAÞ";
		ogrenci.okulno = "OKL001";
		ogrenci.adres = "Ankara";
		sinifListesi.add(ogrenci);
		ogrenci = new Ogrenci();
		ogrenci.ad = "Canan";
		ogrenci.soyad = "BAÞ";
		ogrenci.okulno = "OKL002";
		ogrenci.adres = "Ankara";
		sinifListesi.add(ogrenci);
		ogrenci = new Ogrenci();
		ogrenci.ad = "Kenan";
		ogrenci.soyad = "TAÞ";
		ogrenci.okulno = "OKL003";
		ogrenci.adres = "Ankara";
		sinifListesi.add(ogrenci);
		 
		 */
		// yeni bir nesne talep ediyor.
		//sinifListesi.add(new Ogrenci("OKL001", "Ahmet", "TAÞ", "ANKARA"));
		//sinifListesi.add(new Ogrenci("OKL002", "Gülþen", "TAÞ", "ANKARA"));
		//sinifListesi.add(new Ogrenci("OKL003", "Deniz", "TAÞ", "ANKARA"));
		
		//sinifListesi.forEach(o-> System.out.println(o.ad+" "+ o.soyad));
	}
	

}
