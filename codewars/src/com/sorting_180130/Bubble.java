package com.sorting_180130;
/*
 * codewars 에 있는 알고리즘 문제가 아닌, 단순 정렬 알고리즘 세가지
 */
public class Bubble {
	public static void main(String args[]) {

		int[] arr = { 3, 2, 1, 0, 4, 5 };
		arr = sort(arr);
		
		for (int i=0; i< arr.length; i++) {
			System.out.println("index : " + i + "value : " + arr[i]);
		}
	}

	public static int[] sort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1 ; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
