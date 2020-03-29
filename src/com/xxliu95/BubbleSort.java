package com.xxliu95;

public class BubbleSort {
	
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
		boolean sorted = false;
		int aux;
		while (!sorted) {
			sorted = true;
			for(int i=1; i<array.length; i++) {
				if (array[i] < array[i-1]) {
					aux = array[i-1];
					array[i-1] = array[i];
					array[i] = aux;
					sorted = false;
				}
			}
		}
	}
}
