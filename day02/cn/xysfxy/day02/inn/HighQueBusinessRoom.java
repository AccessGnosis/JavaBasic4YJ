package cn.xysfxy.day02.inn;

public class HighQueBusinessRoom extends BusinessRoom implements BookOrder{
	String bath;
	private String spcServce;
	
	private void spcical() {
		System.out.println("�F�e�̄��g��������գ�"+spcServce);
	}
	
	void bath() {
		System.out.println("���gϴ�跽ʽ"+bath);
	}

	@Override
	public void meituan() {
		System.out.println("δ�_�ňFُ");
	}

	@Override
	public void zhifubao() {
		System.out.println("���r��200Ԫ");
	}

	@Override
	public void crash() {
		System.out.println("���r��299Ԫ");
	}
}
