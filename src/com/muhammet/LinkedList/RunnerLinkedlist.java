package com.muhammet.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class RunnerLinkedlist {

	public static void main(String[] args) {

		/**
		 * AVANTAJLARI
		 * ---> dinamil bellek yapýsý kullanýr. 
		 * ---> boþ kayýt yoktur.
		 * ---> ihtiyacý olduðu kadar alaný kullanýr.
		 * ---> baþa ya da sona Ekleme iþlemleri O(1) dir.
		 * DEZAVANTAJ
		 * ---> random eriþimi yoktur.
		 * ---> araya ekleme iþlemi nisbeten zordur.
		 * 
		 */
		
		List<String> personelAksyonlari = new ArrayList<String>();// polimorphism
		personelAksyonlari.add("Ahmet");
		personelAksyonlari.add("Deniz");
		personelAksyonlari.add(1,"Araya eklendi");
		System.out.println("Array liste 2. kayýt...: "+personelAksyonlari.get(1));
		personelAksyonlari.forEach(p-> System.out.println(p));
		getBuyukAksiyonar(personelAksyonlari);

		LinkedList<String> bagliListe = new LinkedList<String>();
		bagliListe.add("Pazartesi");
		bagliListe.add("Salý");
		
		bagliListe.add("Çarþamba");
		System.out.println("BAðlý liste 2. kayýt...: "+bagliListe.get(1));
		System.out.println("*** BAÐLI LÝSTE ***");
		bagliListe.forEach(p-> System.out.println(p));
		System.out.println("********************************");
		System.out.println("** ARAYA ELEMAN EKLENDÝ ** ");
		bagliListe.add(1,"Ara Gün");
		bagliListe.forEach(p-> System.out.println(p));
	}
	
	public static List<String> getBuyukAksiyonar(List<String> liste){
		//kod kod kod		
		return  liste;
	}

}
