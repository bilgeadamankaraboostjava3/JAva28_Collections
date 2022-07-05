package com.muhammet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.muhammet.List.MyArrayList;

public class Runer {

	public static void main(String[] args) {
		
		// Veri Yap�lar� ve Algoritmalar.
		/**
		 * S�ralama algoritmalar�-> 
		 * Veri Yap�lar� ->
		 * --->  LinkedList(Ba�l� Listeler)
		 * --->  Tree -> BinaryTree -> AVL
		 * --->  Queue -> 
		 * --->  Hash->
		 * --->  FIFO - LIFO
		 * 
		 */
		
		/**
		 * Collection
		 * ->List -> Interface, add,remove, forEach, deleteIf
		 * bir liste tan�mlarken listenini t�r� istenilen bir tipte olabilir. kullanmak
		 * isteyen programc� tipi kendisi belirtir.
		 * NOT: abstract ve interface ler new lenemezler. 
		 */
		List<String> sinifListesi = new ArrayList<String>(); // polimorphism
		List<String> isimListesi = new LinkedList<String>();
		
		ArrayList<String> listem = new ArrayList<String>();
		
		MyArrayList<String> list = new MyArrayList<String>();
		list.dizi = new String[] {"Ahmet"};
		
		MyArrayList<Integer> list1 = new MyArrayList<Integer>();
		list1.dizi = new Integer[]{12,12};
		
		MyArrayList<Runer> list2 = new MyArrayList<Runer>();
		
		
	}

}
