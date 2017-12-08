public class EG_08_array_copy{
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 0};
		int[] copy = new int[arr.length];

		System.arraycopy(arr, 1, copy, 0, 3);
		copy[1] = 100;
		
		for(int i : copy){
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i : arr){
			System.out.print(i + " ");
		}
	} 
} 