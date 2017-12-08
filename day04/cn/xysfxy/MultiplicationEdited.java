package cn.xysfxy;

public class MultiplicationEdited {

	public static void main(String[] args) {
		printProduction(9);
	}

	public static void printProduction(int n) {
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

}
