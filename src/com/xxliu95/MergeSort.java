package com.xxliu95;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] luan = {7,2,8,5,9,10,2,3,1};
		//int[] luan = {6,7,9,3,0,1,-3,2,-25};
		
		print(luan);

		sort(luan);
		//sort(luan);
		
		print(luan);
		
		
	}
	private static void sort(int[] array) {
		sort(array, 0, array.length-1);
	}
	
	private static void sort(int[] array, int left, int right) {

		if (left >= right) {
			return;
		}
		
		int mid = (left + right) / 2;

		sort(array, left, mid);
		sort(array, mid+1, right);
		
		merge(array, left, mid, right);
		
	}
	
	private static void merge(int[] array, int left, int mid, int right) {
		
		int l1 = mid-left+1; //length for the left array
		int l2 = right-mid;
		int idxl=0, idxr=0, idx=left; //index of left, right and the result array
		
		int[] arrLeft = new int[l1];
		int[] arrRight = new int[l2];
		
		for (int i=0; i<l1; i++) {
			arrLeft[i] = array[left + i];
		}
		for (int j=0; j<l2; j++) {
			arrRight[j] = array[mid + j + 1];
		}
		
		print(arrLeft);
		print(arrRight);
		
		while (idxl < l1 && idxr < l2) {
			
			if (arrLeft[idxl] <= arrRight[idxr]) {
				array[idx] = arrLeft[idxl];
				idxl++;
			} else {
				array[idx] = arrRight[idxr];
				idxr++;
			}
			idx++;
		}
		
		//At this point either arrLeft or arrRight is empty
		//Insert the left remaining
		while (idxl < l1) {
			array[idx] = arrLeft[idxl];
			idx++;
			idxl++;
		}
		
		//Or insert the right remaining
		while (idxr < l2) {
			array[idx] = arrRight[idxr];
			idx++;
			idxr++;
		}
		

	}
	
	private static void print(int[] array) {
		
		for(int a: array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
