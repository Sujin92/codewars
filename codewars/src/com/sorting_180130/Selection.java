package com.sorting_180130;
/*
 * codewars 에 있는 알고리즘 문제가 아닌, 단순 정렬 알고리즘 세가지
 */
public class Selection {

	public static void main(String args[]){
		int[] arr = {3,2,4,6,7,1,5,8};
		
		arr = sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("index : " + i + " value : " + arr[i]);
		}
		
	}
	public static int[] sort(int arr[]){ 
		if ( arr == null) return null;
		int maxPos;
		int temp;
		for ( int i = 0; i < arr.length - 1; i++) {
			maxPos = i;
			for ( int k = i + 1; k < arr.length; k++) {
				if (arr[maxPos] > arr[k]) {
					maxPos = k;
				}
			}
			
			temp = arr[maxPos];
			arr[maxPos] = arr[i];
			arr[i] = temp;
		}
		
		
		return arr;
		
	}
}
