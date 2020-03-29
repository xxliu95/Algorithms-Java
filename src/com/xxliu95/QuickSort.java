package com.xxliu95;

public class QuickSort {

	public static void main(String[] args) {
		int[] luan = {7,2,8,5,9,10,2,3,1};
		//int[] luan2 = {6,7,9,3,0,1,-3,2,-25};
		printArray(luan);
		//printArray(luan2);

		sort(luan);
		//sort(luan2);	
		
		printArray(luan);

	}
	
	private static void sort(int[] array) {
		sort(array, 0, array.length - 1);
	}
	
	private static void sort(int[] array, int start, int end) {
		
		if (start > end) 
			return;
		
		int pivot = find(array, start, end);
		sort(array, start, pivot-1);
		sort(array, pivot+1, end);
	}
	
	
	
	private static int find(int[] array, int start, int end) {
		int idx = start;
		int pivot = end;
		
		for (int i=start+1; i<end; i++) {
			if (array[i] < array[pivot]) {
				swap(array, idx, i);
				idx++;
			}
		}
		swap(array, idx, pivot);
		
		return idx;	
	}

	private static void swap(int[] array, int a, int b) {
		int aux = array[a];
		array[a] = array[b];
		array[b] = aux;
	}
	private static void printArray(int[] array) {
		for(int a: array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
