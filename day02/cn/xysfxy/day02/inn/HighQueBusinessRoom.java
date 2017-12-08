package cn.xysfxy.day02.inn;

public class HighQueBusinessRoom extends BusinessRoom implements BookOrder{
	String bath;
	private String spcServce;
	
	private void spcical() {
		System.out.println("貴賓商務間的特殊服務："+spcServce);
	}
	
	void bath() {
		System.out.println("房間洗澡方式"+bath);
	}

	@Override
	public void meituan() {
		System.out.println("未開放團購");
	}

	@Override
	public void zhifubao() {
		System.out.println("房價是200元");
	}

	@Override
	public void crash() {
		System.out.println("房價是299元");
	}
}
