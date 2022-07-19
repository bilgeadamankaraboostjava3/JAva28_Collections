package com.muhammet;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyArrayList {

	public static void main(String[] args) {


		List<String> liste = new ArrayList<String>();
		liste.add("");
		MyArrayList dizi = new MyArrayList();

		/**
		 * Polimorphism ->
		 * 
		 */
		/**
		 * mylist in tüm arayüzleri -> methodlarý 
		 * List interfacesinin arayüzleridir. 
		 * yarattýðýnýz nesnenini özel arayüzleri burada görünmez.
		 */
		List<String> mylist = new ArrayList<String>();
		mylist = new Stack<String>();
		/**
		 * DÝKKAT!!!!
		 * normalde stack içinde push, pop, gibi arayüzler vardýr. ancak polimorphism 
		 * ile nesne atamasý yapardanýz bu arayüzler aktarýlmaz.
		 */
		Stack<String> yigit = new Stack<String>();
		yigit.pop();
		yigit.push("dfdd");
		
	}

}
