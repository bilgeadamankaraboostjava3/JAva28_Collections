package com.muhammet.List.ArrayList;

import java.util.List;

public class Ogrenci {

	String okulno;
	String ad;
	String soyad;
	String adres;
	List<Ders> dersListesi;
	

	
	public Ogrenci(String okulno, String ad, String soyad, String adres, List<Ders> dersListesi) {
		super();
		this.okulno = okulno;
		this.ad = ad;
		this.soyad = soyad;
		this.adres = adres;
		this.dersListesi = dersListesi;
	}



	@Override
	public String toString() {
		return "Ogrenci [okulno=" + okulno + ", ad=" + ad + ", soyad=" + soyad + ", adres=" + adres + "]";
	}
	
	

	public List<Ders> getDersListesi() {
		return dersListesi;
	}



	public void setDersListesi(List<Ders> dersListesi) {
		this.dersListesi = dersListesi;
	}



	public String getOkulno() {
		return okulno;
	}
	public void setOkulno(String okulno) {
		this.okulno = okulno;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	
}
