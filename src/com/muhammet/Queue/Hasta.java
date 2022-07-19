package com.muhammet.Queue;


public class Hasta implements Comparable<Hasta>{

	private String ad;
	private int yas;
	
	@Override
	public int compareTo(Hasta o) {
		
		if(o.getYas()>65 || o.getYas()<8)
			return 1;
		else
			return -1;
		
		
		/*
		// yaşa göre sıralıyarak çıkarttı
		 
		if(this.getYas() > o.getYas())
			return 1;
		else if(this.getYas() < o.getYas())
			return -1;
		else 
			return 0;			
		*/
	}

	
	@Override
	public String toString() {
		return "Hasta [ad=" + ad + ", yas=" + yas + "]";
	}
	public Hasta(String ad, int yas) {
		super();
		this.ad = ad;
		this.yas = yas;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	


	
}
