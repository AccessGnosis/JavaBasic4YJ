package cn.xysfxy.day02.method;

import java.util.Arrays;

public class MethodDemo {

	public static void main(String[] args) {
		int arr[] = {3, 2, 4, 5, 1, 0, 9, 6};
		arr = bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		int arr1[] = {1, 3, 2, 2, 10, 3, 2, 4, 5, 1, 0, 9, 6};
		arr1 = bubbleSort(arr1);
		System.out.println(Arrays.toString(arr1));
	}
	
	public static int[] bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length; ++i) {
			for(int j = 0; j < arr.length - i - 1; ++j) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

}
