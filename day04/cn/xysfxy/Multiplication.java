package cn.xysfxy;

public class Multiplication {
	public static void main(String[] args) {
		int x = 0, y = 0;
		int pro=product(x,y);
		
		System.out.println(pro);
	}
 public static  int product(int i, int j)
	{
	 int k = 0;
	 for(i = 1; i <= 9; i ++) 
		 for(j = 1; j <= i; j ++) 
			 k = i * j;
		  
	    return k;
	}
	
}
