package com.xxliu95;

public class InsertionSort {

	public static void main(String[] args) {
		int[] luan = {7,2,8,5,9,10,2,3,1};
		int[] luan2 = {6,7,9,3,0,1,-3,2,-25};
		sort(luan);
		sort(luan2);
		
		for(int a: luan) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		for(int a: luan2) {
			System.out.print(a + " ");
		}
		
		
	}

	private static void sort(int[] array) {
		int j = 0;
		for(int i=0; i < array.length; i++) {
			while (j >= 0 && array[j+1] < array[j]) {
				int aux = array[j];
				array[j] = array[j+1];
				array[j+1] = aux;
				j--;
			}
			j=i;
		}
	}
}
