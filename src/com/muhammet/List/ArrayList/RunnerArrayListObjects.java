package com.muhammet.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RunnerArrayListObjects {

	public static void main(String[] args) {

		
		
		List<Ogretmen> ogretmenListesi = new ArrayList<Ogretmen>();
		ogretmenListesi.add(new Ogretmen("Ay�e","KESK�N","0 555","Ankara",Branslar.SinifOgetmeni));
		List<Ogrenci> ogrenciListesi = new ArrayList<Ogrenci>();	
		
		List<Ders> dersListesi = new ArrayList<Ders>();
		dersListesi.add(new Ders(Dersler.Matematik,ogretmenListesi.get(0), 0, 0));
		dersListesi.add(new Ders(Dersler.Turkce,ogretmenListesi.get(0), 0, 0));
		dersListesi.add(new Ders(Dersler.Resim,ogretmenListesi.get(0), 0, 0));
		
		// ��reci olu�turabilmek i�i ders listesi eklemeliyim.
		ogrenciListesi.add(new Ogrenci("OKL001", "Kerim", "BA�", "Ankara",dersListesi));
		ogrenciListesi.add(new Ogrenci("OKL002", "Bahar", "KU�", "Ankara",dersListesi.subList(0, 2)));
		// sinif i�in ��renci ve ��retmen listesine ihtiyac�m var
		Sinif sinif = new Sinif(10, true, 10, "2-A", ogrenciListesi, ogretmenListesi);
		/**
		 *  Peki bu bilgilere nas�l ula�aca��z.
		 */
		
		sinif.getOgrenciListesi(); // S�n�f nesnesi i�indeki ��renci listesine eri�iyoruz.
		sinif.getOgrenciListesi().get(0); // sinif i�indeki -> ��renci listesindeki 1. ��renci
		sinif.getOgrenciListesi().get(0).getDersListesi(); // sinif->��rencilistesi 1. ��renci-> ders listesi
		sinif.getOgrenciListesi().get(0).getDersListesi()
					.forEach(d-> System.out.println(d.toString()));
		
		for (Ogrenci ogrenci : sinif.getOgrenciListesi()) {
			System.out.println("--------------------------------");
			System.out.println("��renci...: "+ ogrenci.getAd()+" "+ ogrenci.getSoyad());
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
		ogrenci.soyad = "BA�";
		ogrenci.okulno = "OKL001";
		ogrenci.adres = "Ankara";
		sinifListesi.add(ogrenci);
		ogrenci = new Ogrenci();
		ogrenci.ad = "Canan";
		ogrenci.soyad = "BA�";
		ogrenci.okulno = "OKL002";
		ogrenci.adres = "Ankara";
		sinifListesi.add(ogrenci);
		ogrenci = new Ogrenci();
		ogrenci.ad = "Kenan";
		ogrenci.soyad = "TA�";
		ogrenci.okulno = "OKL003";
		ogrenci.adres = "Ankara";
		sinifListesi.add(ogrenci);
		 
		 */
		// yeni bir nesne talep ediyor.
		//sinifListesi.add(new Ogrenci("OKL001", "Ahmet", "TA�", "ANKARA"));
		//sinifListesi.add(new Ogrenci("OKL002", "G�l�en", "TA�", "ANKARA"));
		//sinifListesi.add(new Ogrenci("OKL003", "Deniz", "TA�", "ANKARA"));
		
		//sinifListesi.forEach(o-> System.out.println(o.ad+" "+ o.soyad));
	}
	

}
