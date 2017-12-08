public class EG_05_action_scope{
	static int a = 10;
	private static char[] sum;

	public static void main(String[] args){
		//EG_05_action_scope e = new EG_05_action_scope();
		int a = 20;
		//System.out.println(EG_05_action_scope.a);				
		for(int i = 0; i < 1; ++i){
			int sum = 10;
				
		}
		sum();
		System.out.println(sum);
	}
	
	public static void sum(){
		int sum = 20;
	}
}