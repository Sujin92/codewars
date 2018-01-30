package com.sorting_180130;
/*
 * codewars 에 있는 알고리즘 문제가 아닌, 단순 정렬 알고리즘 세가지
 */
public class Insertion {

	public static void main(String args[]) {
		int[] arr = { 3, 2, 6, 5, 4, 1, 7 };

		arr = sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("index : " + i + " value : " + arr[i]);
		}
	}

	public static int[] sort(int[] arr) {
		if (arr == null)
			return null;
		int temp;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			int k;
			for (k = i - 1; k >= 0; k--) {
				if (temp >= arr[k]) {
					break;
				}
				arr[k + 1] = arr[k];
			}
			arr[k + 1] = temp;
		}
		return arr;
	}
}
