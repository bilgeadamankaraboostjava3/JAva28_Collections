package com.muhammet.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class RunnerKuyruk {

	public static void main(String[] args) {
		
		Queue<String> hastaneKuyrugu = new LinkedList<String>();
		System.out.println("** HASTAHANE KUYRUK **");
		hastaneKuyrugu.add("Ayþe");
		hastaneKuyrugu.add("Hasan");
		hastaneKuyrugu.add("Caner");
		hastaneKuyrugu.add("Betül");
		hastaneKuyrugu.forEach(p-> System.out.println(p));
		System.out.println("********************************");
		
		String okunanhasta = hastaneKuyrugu.peek();
		System.out.println("Tabelada görünen hasta..: "+ okunanhasta);
		String icerialinanhasta = hastaneKuyrugu.remove();
		// poll()-> remove ilk elemaný alýr ve sýradan siler.
		System.out.println("Ýçeride muayene olan hasta...: "+ icerialinanhasta);
		hastaneKuyrugu.forEach(p-> System.out.println(p));
		System.out.println("********************************");
		
		/**
		 * Kuyruða ekleme iþlemi
		 * Eðer kuyruðunuzu kýsýtlý tutmak istiyorsanýz. sýnýrlayabilrisiniz.
		 * DÝKKAT!!! add ile kýsýtlý kuyruklarda ekleme yaparken eðer kuyruk dolu ile eleme yapmaz
		 * ve hata verir.
		 * offer -> ekleme iþlemini dener ekleyebilirse ekler ekleyemez ise hata vermez.
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
