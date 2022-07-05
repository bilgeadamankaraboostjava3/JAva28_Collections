package com.muhammet.List.ArrayList;

public class Ders {

	Dersler ad;// ???
	Ogretmen ogretmen;
	int not1;
	int not2;
	
	

	public int ort() {
		return (not1+not2)/2;
	}

	



	public Ders(Dersler ad, Ogretmen ogretmen, int not1, int not2) {
		super();
		this.ad = ad;
		this.ogretmen = ogretmen;
		this.not1 = not1;
		this.not2 = not2;
	}


	
	
	@Override
	public String toString() {
		return "Ders [ad=" + ad + ", ogretmen=" + ogretmen.getAd() + ", not1=" + not1 + ", not2=" + not2 + "]";
	}





	public Ogretmen getOgretmen() {
		return ogretmen;
	}



	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}



	public Dersler getAd() {
		return ad;
	}

	public void setAd(Dersler ad) {
		this.ad = ad;
	}

	public int getNot1() {
		return not1;
	}

	public void setNot1(int not1) {
		this.not1 = not1;
	}

	public int getNot2() {
		return not2;
	}

	public void setNot2(int not2) {
		this.not2 = not2;
	}
	
	
}
