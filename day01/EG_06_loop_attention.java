public class EG_06_loop_attention{
	public static void main(String[] args){
		//1、循环变量的初值
		//2、循环退出条件
		//3、循环变量的变化
		for(int i = 0; i < 10; ++i){
			System.out.println("aaa");
		}

		int i = 0;
		while(i < 10){
			System.out.println("bbb");
			++i;
		}

		int j = 0;
		do{
			System.out.println("ccc");
			++j;
		}while(j < 10);
	}
}