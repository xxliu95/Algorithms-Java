package com.xxliu95;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class QuickSortList {

	public static void main(String[] args) {

		ArrayList<Integer> luan = new ArrayList<Integer>();
		luan.add(7);
		luan.add(2);
		luan.add(8);
		luan.add(5);
		luan.add(9);
		luan.add(10);
		luan.add(2);
		luan.add(3);
		luan.add(1);
		
		System.out.println(luan);
		
		luan = sort(luan);
		
		System.out.println(luan);
	}

	private static ArrayList<Integer> sort(ArrayList<Integer> array) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(array.size() <= 1)
			return array;
		int pivot = array.remove(0);
		
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		
		for (int num: array) {
			if (num < pivot) {
				left.add(num);
			} else {
				right.add(num);
			}
		}
		
		System.out.println("Pivot: " +pivot);
		System.out.println("Left: " +left);
		System.out.println("Right: " +right);

		left = sort(left);
		right = sort(right);
		
		result.addAll(left);
		result.add(pivot);
		result.addAll(right);
		
		return result;
	}

}
