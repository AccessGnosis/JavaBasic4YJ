package cn.xysfxy.day02.inn;

public abstract class Room {
	int no;
	double area;
	String state;
	
	void wish() {
		System.out.println(no+"̖����ϴ��");
	}
	
	void sleep() {
		System.out.println("��Ϣ��e"+area);
	}
}
