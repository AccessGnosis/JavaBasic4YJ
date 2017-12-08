package cn.xysfxy.day02.inn;

public abstract class Room {
	int no;
	double area;
	String state;
	
	void wish() {
		System.out.println(no+"號房能洗澡");
	}
	
	void sleep() {
		System.out.println("休息面積"+area);
	}
}
