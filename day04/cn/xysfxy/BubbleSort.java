package cn.xysfxy;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// ���ݿ���
		// ��������д��
		int arr[] = { 3, 2, 4, 1, 5, 7, 6 };

		System.out.println("����ǰ");
		System.out.println(Arrays.toString(arr));

		int arr_sorted[] = sort(arr);

		System.out.println("�����");
		System.out.println(Arrays.toString(arr));
	}

	private static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = 0; j < arr.length - i - 1; ++j) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
