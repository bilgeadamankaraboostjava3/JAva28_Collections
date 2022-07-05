package com.muhammet.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RunnerArrayList {

	public static void main(String[] args) {
	
		List<String> listOgrenci = new ArrayList<>();
		// Ekleme-> add
		listOgrenci.add("Ahmet BAÞ"); // 0
		listOgrenci.add("Canan KUÞ"); // 1
		listOgrenci.add("Deniz HAKÝM"); // 2
		// Okuma -> get(index)
		System.out.println("1. Öðrenci...: "+ listOgrenci.get(0));
		// Sýralý okuma iþlemi
		System.out.println("------------------------------------");
		System.out.println("Öðrenci Listesi Foreach");
		for (String ogrenci : listOgrenci) {
			System.out.println("Öðrenci adý...: "+ ogrenci);
		}
		System.out.println("------------------------------------");
		System.out.println("Öðrenci Listesi For");
		// dizinin botunu öðrenmek
		for(int i=0; i<listOgrenci.size(); i++) {
			System.out.println((i+1)+". Öðrenci adý....: "+ listOgrenci.get(i));
		}
		// foreach(p-> {})
		System.out.println("------------------------------------");
		System.out.println("Öðrenci Listesi Method foreach");
		listOgrenci.forEach(l-> System.out.println("Öðrencinin adý...: "+ l));
		
		
	}

}
