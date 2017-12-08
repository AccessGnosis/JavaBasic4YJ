package cn.xysfxy.day02;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {3, 2, 4, 5, 1, 0, 9, 6};
		int count = 0;
		
		System.out.println("排序前：");
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; ++i) {
			for(int j = 0; j < arr.length - i - 1; ++j) {
				if(arr[j] < arr[j+1]) {
					count++;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("排序后：");
		System.out.println(Arrays.toString(arr));
		System.out.println("一共进循环了 "+count+" 次");
	}

}
