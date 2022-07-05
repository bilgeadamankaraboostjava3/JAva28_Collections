package com.muhammet.List.ArrayList;

public class Ogretmen {

	String ad;
	String soyad;
	String telefon;
	String adres;
	Branslar brans; // ???, Sinif Öðretmen, snfOgrt, 
	
	
	public Ogretmen(String ad, String soyad, String telefon, String adres, Branslar brans) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.telefon = telefon;
		this.adres = adres;
		this.brans = brans;
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
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public Branslar getBrans() {
		return brans;
	}
	public void setBrans(Branslar brans) {
		this.brans = brans;
	}


	
}
