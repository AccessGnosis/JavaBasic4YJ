package cn.xysfxy.day02.inn;

public class BusinessRoom extends Room {
	int netSpeed;
	
	void onNet() {
		System.out.println("房間的網速是"+netSpeed);
	}
}
