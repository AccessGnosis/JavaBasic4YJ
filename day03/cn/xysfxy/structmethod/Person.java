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
			this.name = "佚名";
		}
		else {
			this.name = "暂时不能发行该作者作品";
		}
	}
}
