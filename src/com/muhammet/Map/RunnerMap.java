package com.muhammet.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RunnerMap {

	public static void main(String[] args) {
		/**
		 * MAP -> <Key,Value>
		 *---> <long, String> -> <1111111111,Vatandas.class>
		 *---> <Class, [Class-List<String>.... v.s.]>
		 */
		List<Bolum> bolumListesi = new ArrayList<Bolum>();
		bolumListesi.add(new Bolum(18, "Bilgi ��lem"));
		bolumListesi.add(new Bolum(42, "�nsan Kaynaklar�"));
		bolumListesi.add(new Bolum(35, "Muhasebe"));
		bolumListesi.add(new Bolum(41, "G�venlik"));
		
		List<Personel> personelList = new ArrayList<Personel>();
		// �NEML� -> buraya mevcut bulnan departman bilgilerinden atam yapmal�s�n�z.
		// D�KKAT!!! -> get ile ald���m �ey, bir listenini i�indeki elemalar�n index de�eri ile 
		// al�nan bilgilerdir.
		personelList.add(new Personel(1, "Ahmet", "TA�", "0 555 111 1111",bolumListesi.get(0)));
		personelList.add(new Personel(2, "Canan", "TA�", "0 999 111 1111",bolumListesi.get(0)));
		personelList.add(new Personel(3, "Bahar", "TA�", "0 888 111 1111",bolumListesi.get(0)));
		personelList.add(new Personel(4, "Taner", "BULU�", "0 999 111 1111",bolumListesi.get(1)));
		personelList.add(new Personel(5, "Hakan", "DOK", "0 888 111 1111",bolumListesi.get(1)));
		personelList.add(new Personel(6, "Tuana", "TEK", "0 555 111 1111",bolumListesi.get(3)));
		personelList.add(new Personel(7, "Temel", "TA�", "0 999 111 1111",bolumListesi.get(3)));
		personelList.add(new Personel(8, "Tahir", "TEK", "0 888 111 1111",bolumListesi.get(3)));
		personelList.add(new Personel(9, "Taha", "TA�", "0 555 111 1111",bolumListesi.get(3)));
		personelList.add(new Personel(10, "Tun�", "TEK", "0 999 111 1111",bolumListesi.get(3)));
		personelList.add(new Personel(11, "G�ven�", "BEKTA�", "0 888 111 1111",bolumListesi.get(2)));
		
		/***
		 * Key -> Departman
		 * Value -> �al��an Listesi
		 */
		Map<Bolum, List<Personel>> bolumPersonelLisesi;
		/**
		 * 
		 */
		bolumPersonelLisesi = personelList.stream()
							.collect(Collectors.groupingBy(Personel::getBolum));

		System.out.println("1- Bilgi ��lem");
		System.out.println("2- �nsan Kaynaklar�");
		System.out.println("3- Muhasebe");
		System.out.println("4- G�venlik");
		System.out.print("Personel listele....: ");
		Scanner sc = new Scanner(System.in);
		int secim = sc.nextInt()-1;
		Bolum bolum = bolumListesi.get(secim); // B�l�m se�iliyor.
		// bir K->V yap�s�nda anahtar verildi�inde de�eri d�ner
		List<Personel> secilenBolumPersonelListesi = bolumPersonelLisesi.get(bolum);
		secilenBolumPersonelListesi.forEach(x-> System.out.println(x.toString()));
		
	}//
}//
