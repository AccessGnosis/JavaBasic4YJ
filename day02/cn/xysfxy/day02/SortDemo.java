package cn.xysfxy.day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		int a = 1;
		Integer arr[] = { 3, 2, 4, 5, 1, 0, 9, 6 };

		System.out.println("≈≈–Ú«∞£∫");
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		Collections.reverse(list);
		
		System.out.println("≈≈–Ú«∞£∫");
		System.out.println(list);
	}

}
