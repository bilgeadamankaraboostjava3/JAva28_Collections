package com.muhammet.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class RunnerLinkedlist {

	public static void main(String[] args) {

		/**
		 * AVANTAJLARI
		 * ---> dinamil bellek yap�s� kullan�r. 
		 * ---> bo� kay�t yoktur.
		 * ---> ihtiyac� oldu�u kadar alan� kullan�r.
		 * ---> ba�a ya da sona Ekleme i�lemleri O(1) dir.
		 * DEZAVANTAJ
		 * ---> random eri�imi yoktur.
		 * ---> araya ekleme i�lemi nisbeten zordur.
		 * 
		 */
		
		List<String> personelAksyonlari = new ArrayList<String>();// polimorphism
		personelAksyonlari.add("Ahmet");
		personelAksyonlari.add("Deniz");
		personelAksyonlari.add(1,"Araya eklendi");
		System.out.println("Array liste 2. kay�t...: "+personelAksyonlari.get(1));
		personelAksyonlari.forEach(p-> System.out.println(p));
		getBuyukAksiyonar(personelAksyonlari);

		LinkedList<String> bagliListe = new LinkedList<String>();
		bagliListe.add("Pazartesi");
		bagliListe.add("Sal�");
		
		bagliListe.add("�ar�amba");
		System.out.println("BA�l� liste 2. kay�t...: "+bagliListe.get(1));
		System.out.println("*** BA�LI L�STE ***");
		bagliListe.forEach(p-> System.out.println(p));
		System.out.println("********************************");
		System.out.println("** ARAYA ELEMAN EKLEND� ** ");
		bagliListe.add(1,"Ara G�n");
		bagliListe.forEach(p-> System.out.println(p));
	}
	
	public static List<String> getBuyukAksiyonar(List<String> liste){
		//kod kod kod		
		return  liste;
	}

}
