package cn.xysfxy.method.overload;

public class MethodOverloadDemo {
	public static void main(String[] args) {
		//方法的重载
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(sum(a, b));
		System.out.println(sum(a, "hello"));
//		System.out.println(sum(a, b, c));
//		System.out.println(sum(a, b, c, 10));
	}
	//overload
	private static int sum(int a, int b) {
		return a+b;
	}
	private static int sum(int a, int b, int c) {
		return a+b+c;
	}
	private static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	private static int sum(int a, String b) {
		System.out.println(b);
		return 10;
	}
}
