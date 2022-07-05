package com.muhammet.List;
/**
 * Type -> T -> datatype, String, Long, Integer, Runner -> Class olmalý
 * @author MuhammetAli
 *
 * @param <T>
 */
public class MyArrayList<T> {

	int sayi=15;
	
	int toplam  = 5 + sayi;
	
	public void name() {
		System.out.println("Toplam..: "+ sayi+ " + 5 = "+ toplam);
	}
	
	public T[] dizi;
	
	public T get(int index) {
		return dizi[index];
	}
	
}
