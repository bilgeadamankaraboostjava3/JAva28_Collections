package com.muhammet.Vector;

import java.util.List;
import java.util.Vector;

public class RunnerVektor {

	public static void main(String[] args) {
		
		/**
		 * Vector->
		 */
		List<String> vektorList = new Vector<String>();
		vektorList.add("Nesne eklendi");
		vektorList.add("Yeni liste");
		vektorList.forEach(p-> System.out.println("Deðer....: "+p));
		
	}

}
