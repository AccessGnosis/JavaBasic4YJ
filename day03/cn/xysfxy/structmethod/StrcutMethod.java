package cn.xysfxy.structmethod;

public class StrcutMethod {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "����";
		
		Person p2 = new Person("����");
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		//Ĭ��������
		Person p3 = new Person(true);
		System.out.println(p3.name);
		Person p4 = new Person(true);
		System.out.println(p4.name);
		Person p5 = new Person(false);
		System.out.println(p5.name);
		
		Student s1 = new Student();
	}

}
