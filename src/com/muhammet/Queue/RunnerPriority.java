package com.muhammet.Queue;

import java.util.PriorityQueue;

public class RunnerPriority {

	public static void main(String[] args) {
		/**
		 * Sayý ise 0...0
		 * MEtin ise a...z
		 */
		PriorityQueue<Integer> sayilar = new PriorityQueue<Integer>();
		sayilar.add(300);
		sayilar.add(100);
		sayilar.add(500);
		sayilar.add(900);
		sayilar.add(50);
		System.out.println("***** SAYILAR KUYRUÐU *****");
		sayilar.forEach(s-> System.out.println(s));
		System.out.println("-----------------------------------");
		Integer okunansayi = sayilar.remove();
		System.out.println("Okunan Sayý....: "+ okunansayi);
		okunansayi = sayilar.remove();
		System.out.println("Okunan Sayý....: "+ okunansayi);
		okunansayi = sayilar.remove();
		System.out.println("Okunan Sayý....: "+ okunansayi);
		okunansayi = sayilar.remove();
		System.out.println("Okunan Sayý....: "+ okunansayi);
		
	

	}

}
