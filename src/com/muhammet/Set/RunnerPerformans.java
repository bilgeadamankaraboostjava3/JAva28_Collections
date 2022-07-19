package com.muhammet.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RunnerPerformans {

	public static void main(String[] args) {
		List<String> kelimeler = new ArrayList<String>();
		HashSet<String> kelimelerHash = new HashSet<String>();
		TreeSet<String> kelimelerTree = new TreeSet<String>();
		String bulunankelime;
		long start = System.nanoTime();
		for(int i=0;i<100_000_000;i++) {
			kelimeler.add("kelime"+i);
		}
		long end = System.nanoTime();
		System.out.println("List ekleme h�z�...: "+ (end-start));
		start = System.nanoTime();
		bulunankelime = kelimeler.stream()
				.filter(k-> k.equals(("kelime"+48956125)))
				.collect(Collectors.toList()).get(0);
		end = System.nanoTime();
		System.out.println("List arama h�z�...: "+(end-start));
		System.out.println("------------------------------------");
		start = System.nanoTime();
		for(int i=0;i<100_000_000;i++) {
			kelimelerHash.add("kelime"+i);
		}
		end = System.nanoTime();
		System.out.println("HashSet ekleme h�z�...: "+ (end-start));
		start = System.nanoTime();
		bulunankelime = kelimelerHash.stream()
				.filter(k-> k.equals(("kelime"+48956125)))
				.collect(Collectors.toList()).get(0);
		end = System.nanoTime();
		System.out.println("HashSet arama h�z�...: "+(end-start));
		System.out.println("------------------------------------");
		start = System.nanoTime();
		for(int i=0;i<100_000_000;i++) {
			kelimelerTree.add("kelime"+i);
		}
		end = System.nanoTime();
		System.out.println("TreeSet ekleme h�z�...: "+ (end-start));
		start = System.nanoTime();
		bulunankelime = kelimelerTree.stream()
				.filter(k-> k.equals(("kelime"+48956125)))
				.collect(Collectors.toList()).get(0);
		end = System.nanoTime();
		System.out.println("TreeSet arama h�z�...: "+(end-start));
	}
	
	public static String kelimeUret() {
		//65-90
		Random rd = new Random(); 
		return "";
		//return c1+c2+c3+c4+c5+c6+"";
	}
}
