package com.muhammet.Queue;


import java.util.PriorityQueue;
import java.util.Queue;

public class RunnerQueuePriority {

	public static void main(String[] args) {
		/**
		 * Peki hastalarda öncelik var ise ne olacak???
		 * Hasta bir sýnýf var içinde öncellekmek için yas bulunuyor.
		 * Hasta kuyruðu oluþturalýyým.
		 * 
		 */

		Queue<Hasta> hastaKuyrugu = new PriorityQueue<Hasta>();
		hastaKuyrugu.add(new Hasta("Ayþe", 16)); //-1
		hastaKuyrugu.add(new Hasta("Deniz", 66));// 1 
		hastaKuyrugu.add(new Hasta("Bahar", 3)); // 1
		hastaKuyrugu.add(new Hasta("Kerim", 52));
		hastaKuyrugu.add(new Hasta("Ali", 34));
		hastaKuyrugu.add(new Hasta("Fatma", 46));
		hastaKuyrugu.add(new Hasta("Ayþe", 87));
		System.out.println("** 1. hasta **");
		hastaKuyrugu.forEach(h-> System.out.println(h.toString()));
		System.out.println("** 2. hasta **");
		hastaKuyrugu.poll();
		hastaKuyrugu.forEach(h-> System.out.println(h.toString()));
		System.out.println("** 3. hasta **");
		hastaKuyrugu.poll();
		hastaKuyrugu.forEach(h-> System.out.println(h.toString()));
		System.out.println("** 4. hasta **");
		hastaKuyrugu.poll();
		hastaKuyrugu.forEach(h-> System.out.println(h.toString()));
		System.out.println("** 5. hasta **");
		hastaKuyrugu.poll();
		hastaKuyrugu.forEach(h-> System.out.println(h.toString()));
		System.out.println("** 6. hasta **");
		hastaKuyrugu.poll();
		hastaKuyrugu.forEach(h-> System.out.println(h.toString()));
		System.out.println("** 7. hasta **");
		hastaKuyrugu.poll();
		hastaKuyrugu.forEach(h-> System.out.println(h.toString()));
	}

}
