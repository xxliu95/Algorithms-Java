package com.xxliu95;

public class QuickSortString {

	public static void main(String[] args) {
		String luan = "hello world";
		
		System.out.println(luan);
		luan = sort(luan);
		System.out.println(luan);
	}

	private static String sort(String s) {
		if (s.length() <= 1) {
			return s;
		}
		
		char pivot = s.charAt(0);
		s = s.substring(1);
		
		String left = "";
		String right = "";
		
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i) < pivot) {
				left += s.charAt(i);
			} else {
				right += s.charAt(i);
			}
		}
		
		left = sort(left);
		right = sort(right);

	
		return left + pivot + right;
		
	}

}
