package cn.xysfxy.day02.inn;

public class MainClass {

	public static void main(String[] args) {
		Room room = new HighQueBusinessRoom();
		HighQueBusinessRoom br = (HighQueBusinessRoom) room;
		br.netSpeed = 4;
		br.onNet();
		br.area = 100;
		br.sleep();
		br.zhifubao();
	}

}
