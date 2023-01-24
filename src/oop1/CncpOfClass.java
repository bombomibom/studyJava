package oop1;

public class CncpOfClass {
	public static void main(String[] args) {
		// 클래스 
		// 객체지향이론의 관점: 객체를 생성하기 위한 틀
		// 프로그래밍적 관점: 데이터와 함수의 결합
		
		// 데이터 저장형태의 발전과정
		// 변수: 하나의 데이터를 저장할 수 있는 공간
		// 배열: 같은 종류의 여러 데이터를 하나의 집합으로 저장할 수 있는 공간 
		// 구조체: 서로 관련된 여러 데이터를 종류에 관계없이 하나의 집합으로 저장할 수 있는 공간
		// 클래스: 구조체 + 함수 예) String 클래스. 문자열과 문자열을 다루는데 필요한 함수를 함께 묶기 위해 클래스로 생성됨
		
		// 사용자 정의 타입
		// 클래스로 묶지 않고 변수 2개를 만든다면 int hour1, hour2 이렇게 재사용성 떨어짐. 배열로 생성한다해도 hour, minute, second 매칭 어려움
		// 따라서 아래와 같이 클래스를 만들고 인스턴스 생성
		Time t1 = new Time();
		Time t2 = new Time();
		t1.setHour(2);
	}
}

class Time {
	private int hour; // 제어자: private을 사용해 변수의 값을 직접 변경하지 못 하게 하고, 대신 메서드를 통해 값을 변경하도록 작성
	private int minute;
	private float second;
	
	public void setHour(int h) {
		if(h < 0 || h > 23) return; // 유효성 검사. 0~23 사이일 경우만 hour 변경 가능하도록 조건 추가
		this.hour = h;
		System.out.println(this.hour);
	}
}
