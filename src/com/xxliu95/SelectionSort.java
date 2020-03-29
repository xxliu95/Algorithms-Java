package com.xxliu95;

public class SelectionSort {

	public static void main(String[] args) {
		int[] luan = {7,2,8,5,9,10,2,3,1};
		int[] luan2 = {6,7,9,3,0,1,-3,2,-25};
		printArray(luan);
		//printArray(luan2);

		sort(luan);
		//sort(luan2);	

	}
	
	private static void sort(int[] array) {
		int min;
		for (int i=0; i<array.length; i++) {
			min = i;
			for (int j=i; j<array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			int aux = array[i];
			array[i] = array[min];
			array[min] = aux;
			printArray(array);
		}
	}
	
	private static void printArray(int[] array) {
		for(int a: array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
