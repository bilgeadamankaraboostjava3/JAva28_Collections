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
		 * mylist in t�m aray�zleri -> methodlar� 
		 * List interfacesinin aray�zleridir. 
		 * yaratt���n�z nesnenini �zel aray�zleri burada g�r�nmez.
		 */
		List<String> mylist = new ArrayList<String>();
		mylist = new Stack<String>();
		/**
		 * D�KKAT!!!!
		 * normalde stack i�inde push, pop, gibi aray�zler vard�r. ancak polimorphism 
		 * ile nesne atamas� yapardan�z bu aray�zler aktar�lmaz.
		 */
		Stack<String> yigit = new Stack<String>();
		yigit.pop();
		yigit.push("dfdd");
		
	}

}
