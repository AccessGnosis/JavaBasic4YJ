public class EG_07_loop_array{
	public static void main(String[] args){
		int brr[] = {1, 2, 3, 4, 5, 6};
		int arr[][] = {{1, 1, 1, 1},
			{2, 2, 2, 2},
			{3, 3, 3, 3, 3}};

		//for(int i = 0; i < arr.length; ++i){
		//	System.out.println(arr[i]);
		//}

		/*
		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		*/

		//foreach
		//for(int i : brr){
		//	System.out.println(i);
		//}
		for(int[] i : arr){
			for(int j : i){
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}