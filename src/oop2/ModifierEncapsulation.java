package oop2;

public class ModifierEncapsulation {
	public static void main(String[] args) {
		// ĸ��ȭ
		// ������ ���߱�(data hiding): ���� ������ ����ó�� Ŭ���� �� ������ ���� �� ���� �Ұ��ϰ� �����ϴ� ��
		// ������ ���߱� �� �ܺο� ���ʿ��ϰ� �����ų �ʿ���� �κ� ���߱Ⱑ ��ü���ⰳ������ ���� �� ĸ��ȭ
		// �׳� ���� �����ϸ� ��ȿ���� �� �� ���⿡ private���� �����ϰ�, getter & setter�� ��ȿ�� ���� ����!!
		
		Time t = new Time();
		// t.hour = 2; �̷��� ���� �Ұ�
		t.setHour(34); // ��ȿ���� �ʱ⿡ ���� �� ��
		int result = t.getHour();
		System.out.println(result);
	}
}

class Time {
	private int hour;
	
	public int getHour() { return hour; }
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
}