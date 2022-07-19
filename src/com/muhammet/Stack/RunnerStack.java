package com.muhammet.Stack;

import java.util.Stack;

public class RunnerStack {

	public static void main(String[] args) {

		/**
		 * Y���n-> 
		 */

		Stack<String> yigin = new Stack<String>();
		yigin.add("Pazartesi");
		yigin.add("Sal�");
		yigin.add("�ar�amba");
		yigin.add("Per�embe");
		yigin.add("Cuma");
		yigin.forEach(p-> System.out.println(p));
		/**
		 * Ben e�er bir de�ere eri�mi� isem o de�er y���ndan gitsin istiyorsam ne olacak
		 * 
		 */
		System.out.println("** Bir de�eri silmek ** ");
		//yigin.remove(2);
		//yigin.forEach(p-> System.out.println(p));
		System.out.println("**************************");
		
		/**
		 * last in firt out -> LIFO  **FIFO
		 * E-Ticaret, sat�� ve muhasebe. firmalar�n vergi kar�.
		 * ancak, muhasebe i�lemlerinde karma��kl�k oluyor.
		 * Avrup Birli�inde firmalar�n LIFO yapmas� yasak.
		 * 5-> 8, 8 sat. 9-> 12.
		 */
		System.out.println("** Y���ttan bir de�er okumak *** ");
		String deger = yigin.peek(); // y���t�n en �stteki de�erin okur ve yerinde b�rak�r.
		System.out.println("de�er...: "+ deger);
		String deger_2 = yigin.pop();// y���t�n e �stteki de�erini okur ve siler.
		System.out.println("de�er..: "+ deger_2);
		yigin.forEach(p-> System.out.println(p));
		System.out.println("**************************");
		
		/**
		 * 
		 */
		yigin.add("Cumartesi");
		yigin.push("Pazar");
		yigin.forEach(p-> System.out.println(p));
		System.out.println("**************************");
		
		
	}

}
