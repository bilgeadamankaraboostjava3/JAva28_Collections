package com.muhammet.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class RunnerKuyruk {

	public static void main(String[] args) {
		
		Queue<String> hastaneKuyrugu = new LinkedList<String>();
		System.out.println("** HASTAHANE KUYRUK **");
		hastaneKuyrugu.add("Ay�e");
		hastaneKuyrugu.add("Hasan");
		hastaneKuyrugu.add("Caner");
		hastaneKuyrugu.add("Bet�l");
		hastaneKuyrugu.forEach(p-> System.out.println(p));
		System.out.println("********************************");
		
		String okunanhasta = hastaneKuyrugu.peek();
		System.out.println("Tabelada g�r�nen hasta..: "+ okunanhasta);
		String icerialinanhasta = hastaneKuyrugu.remove();
		// poll()-> remove ilk eleman� al�r ve s�radan siler.
		System.out.println("��eride muayene olan hasta...: "+ icerialinanhasta);
		hastaneKuyrugu.forEach(p-> System.out.println(p));
		System.out.println("********************************");
		
		/**
		 * Kuyru�a ekleme i�lemi
		 * E�er kuyru�unuzu k�s�tl� tutmak istiyorsan�z. s�n�rlayabilrisiniz.
		 * D�KKAT!!! add ile k�s�tl� kuyruklarda ekleme yaparken e�er kuyruk dolu ile eleme yapmaz
		 * ve hata verir.
		 * offer -> ekleme i�lemini dener ekleyebilirse ekler ekleyemez ise hata vermez.
		 */
		
		Queue<String> kovitKuyruk = new  ArrayBlockingQueue<String>(3);
		kovitKuyruk.add("1. hasta");
		kovitKuyruk.add("2. hasta");
		kovitKuyruk.offer("3. hasta");
		kovitKuyruk.offer("4. hasta");
		kovitKuyruk.offer("5. hasta");
		kovitKuyruk.forEach(p-> System.out.println(p));
		
	}

}
