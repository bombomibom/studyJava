package oop2;

public class ModifierEncapsulation {
	public static void main(String[] args) {
		// 캡슐화
		// 데이터 감추기(data hiding): 접근 제어자 목적처럼 클래스 내 데이터 접근 및 변형 불가하게 제한하는 것
		// 데이터 감추기 및 외부에 불필요하게 노출시킬 필요없는 부분 감추기가 객체지향개념으로 봤을 때 캡슐화
		// 그냥 냅다 저장하면 유효한지 알 수 없기에 private으로 제어하고, getter & setter로 유효한 값만 저장!!
		
		Time t = new Time();
		// t.hour = 2; 이렇게 접근 불가
		t.setHour(34); // 유효하지 않기에 저장 안 됨
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