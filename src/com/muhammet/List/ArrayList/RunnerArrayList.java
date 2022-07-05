package com.muhammet.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RunnerArrayList {

	public static void main(String[] args) {
	
		List<String> listOgrenci = new ArrayList<>();
		// Ekleme-> add
		listOgrenci.add("Ahmet BA�"); // 0
		listOgrenci.add("Canan KU�"); // 1
		listOgrenci.add("Deniz HAK�M"); // 2
		// Okuma -> get(index)
		System.out.println("1. ��renci...: "+ listOgrenci.get(0));
		// S�ral� okuma i�lemi
		System.out.println("------------------------------------");
		System.out.println("��renci Listesi Foreach");
		for (String ogrenci : listOgrenci) {
			System.out.println("��renci ad�...: "+ ogrenci);
		}
		System.out.println("------------------------------------");
		System.out.println("��renci Listesi For");
		// dizinin botunu ��renmek
		for(int i=0; i<listOgrenci.size(); i++) {
			System.out.println((i+1)+". ��renci ad�....: "+ listOgrenci.get(i));
		}
		// foreach(p-> {})
		System.out.println("------------------------------------");
		System.out.println("��renci Listesi Method foreach");
		listOgrenci.forEach(l-> System.out.println("��rencinin ad�...: "+ l));
		
		
	}

}
