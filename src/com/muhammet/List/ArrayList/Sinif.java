package com.muhammet.List.ArrayList;

import java.util.List;

/**
 * 
 * @author MuhammetAli
 *
 */
public class Sinif {
	
	private int sirasayisi;
	private boolean projeksiyon;
	private int dolapsayisi;
	private String subeno; // 1-A, 5-C
	private List<Ogrenci> ogrenciListesi;
	private List<Ogretmen> bransOgretmenListesi;
	
	
	public Sinif(int sirasayisi, boolean projeksiyon, int dolapsayisi, String subeno, List<Ogrenci> ogrenciListesi,
			List<Ogretmen> bransOgretmenListesi) {
		super();
		this.sirasayisi = sirasayisi;
		this.projeksiyon = projeksiyon;
		this.dolapsayisi = dolapsayisi;
		this.subeno = subeno;
		this.ogrenciListesi = ogrenciListesi;
		this.bransOgretmenListesi = bransOgretmenListesi;
	}
	public int getSirasayisi() {
		return sirasayisi;
	}
	public void setSirasayisi(int sirasayisi) {
		this.sirasayisi = sirasayisi;
	}
	public boolean isProjeksiyon() {
		return projeksiyon;
	}
	public void setProjeksiyon(boolean projeksiyon) {
		this.projeksiyon = projeksiyon;
	}
	public int getDolapsayisi() {
		return dolapsayisi;
	}
	public void setDolapsayisi(int dolapsayisi) {
		this.dolapsayisi = dolapsayisi;
	}
	public String getSubeno() {
		return subeno;
	}
	public void setSubeno(String subeno) {
		this.subeno = subeno;
	}
	public List<Ogrenci> getOgrenciListesi() {
		return ogrenciListesi;
	}
	public void setOgrenciListesi(List<Ogrenci> ogrenciListesi) {
		this.ogrenciListesi = ogrenciListesi;
	}
	public List<Ogretmen> getBransOgretmenListesi() {
		return bransOgretmenListesi;
	}
	public void setBransOgretmenListesi(List<Ogretmen> bransOgretmenListesi) {
		this.bransOgretmenListesi = bransOgretmenListesi;
	}
	
	
}
