package com.muhammet.Stack;

import java.util.Stack;

public class RunnerStack {

	public static void main(String[] args) {

		/**
		 * Yýðýn-> 
		 */

		Stack<String> yigin = new Stack<String>();
		yigin.add("Pazartesi");
		yigin.add("Salý");
		yigin.add("Çarþamba");
		yigin.add("Perþembe");
		yigin.add("Cuma");
		yigin.forEach(p-> System.out.println(p));
		/**
		 * Ben eðer bir deðere eriþmiþ isem o deðer yýðýndan gitsin istiyorsam ne olacak
		 * 
		 */
		System.out.println("** Bir deðeri silmek ** ");
		//yigin.remove(2);
		//yigin.forEach(p-> System.out.println(p));
		System.out.println("**************************");
		
		/**
		 * last in firt out -> LIFO  **FIFO
		 * E-Ticaret, satýþ ve muhasebe. firmalarýn vergi karý.
		 * ancak, muhasebe iþlemlerinde karmaþýklýk oluyor.
		 * Avrup Birliðinde firmalarýn LIFO yapmasý yasak.
		 * 5-> 8, 8 sat. 9-> 12.
		 */
		System.out.println("** Yýðýttan bir deðer okumak *** ");
		String deger = yigin.peek(); // yýðýtýn en üstteki deðerin okur ve yerinde býrakýr.
		System.out.println("deðer...: "+ deger);
		String deger_2 = yigin.pop();// yýðýtýn e üstteki deðerini okur ve siler.
		System.out.println("deðer..: "+ deger_2);
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
