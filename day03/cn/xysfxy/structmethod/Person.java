package cn.xysfxy.structmethod;

public class Person {
	String name;

	public Person() {
	}

	protected Person(String name) {
		this.name = name;
	}

	public Person(boolean b) {
		if (b) {
			this.name = "����";
		}
		else {
			this.name = "��ʱ���ܷ��и�������Ʒ";
		}
	}
}
