package cn.xysfxy.structmethod;

public class StrcutMethod {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "张三";
		
		Person p2 = new Person("李四");
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		//默认是佚名
		Person p3 = new Person(true);
		System.out.println(p3.name);
		Person p4 = new Person(true);
		System.out.println(p4.name);
		Person p5 = new Person(false);
		System.out.println(p5.name);
		
		Student s1 = new Student();
	}

}
