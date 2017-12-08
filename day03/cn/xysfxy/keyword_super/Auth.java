package cn.xysfxy.keyword_super;

public class Auth extends Person {
	String name;
	
	public Auth(String name) {
		super(name);
		//super.xxx = "xxx";
		//super()代表调用了父类的构造方法
		
		this.name = name;
	}
}
