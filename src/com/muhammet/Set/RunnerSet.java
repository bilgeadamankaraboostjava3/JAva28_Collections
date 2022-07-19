package com.muhammet.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class RunnerSet {

	public static void main(String[] args) {
	
		List<String> isimler = new ArrayList<>();
		isimler.add("Ahmet");
		isimler.add("Zeynep");
		isimler.add("Can");
		isimler.add("Cumhur");
		isimler.add("Temel");
		isimler.add("Bahad�r");
		isimler.add("Ahmet");
		isimler.add("Can");
		isimler.add("Duran");
		isimler.add("Beyhan");
		isimler.add("�ebnem");
		isimler.forEach(p-> System.out.println(p));
		System.out.println("-----------------------------");
		/**
		 * Set -> tekrar eden kay�tlar olu�turmaz. 
		 * HashSet, TreeSet
		 * --- karma denilen bir yap� kullanarak depolama yapar.
		 * --- benzersiz kay�tlar� tutar.
		 * --- bo� kay�t tutabilir.
		 * --- default de�erleri vad�r. default kapasitesi 16 d�r. y�k fakt�r� 0.75
		 * 
		 */
		HashSet<String> isimler2 = new HashSet();
		isimler2.add("Ahmet");
		isimler2.add("Zeynep");
		isimler2.add("Can");
		isimler2.add("Cumhur");
		isimler2.add("Temel");
		isimler2.add("Bahad�r");
		isimler2.add("Ahmet");
		isimler2.add("Can");
		isimler2.add("Duran");
		isimler2.add("Beyhan");
		isimler2.add("�ebnem");
		isimler2.forEach(p-> System.out.println(p));		
		System.out.println("-------------------------------------------");
		TreeSet<String> isimler3 = new TreeSet<String>();
		isimler3.add("Ahmet");
		isimler3.add("Zeynep");
		isimler3.add("Can");
		isimler3.add("Cumhur");
		isimler3.add("Temel");
		isimler3.add("Bahad�r");
		isimler3.add("Ahmet");
		isimler3.add("Can");
		isimler3.add("Duran");
		isimler3.add("Beyhan");
		isimler3.add("�ebnem");
		isimler3.forEach(p-> System.out.println(p));
		
	}//Method Sonu
}//Class Sonu
