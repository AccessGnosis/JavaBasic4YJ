package cn.xysfxy.day02;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int count = 0;
		int arr[] = { 3, 2, 4, 5, 1, 0, 9, 6 };

		System.out.println("����ǰ��");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; ++i) {
			for (int j = i+1; j < arr.length; ++j) {
				if (arr[i] > arr[j]) {
					count++;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("�����");
		System.out.println(Arrays.toString(arr));
		System.out.println("һ����ѭ���� "+count+" ��");
	}

}
