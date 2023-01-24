package oop1;

public class CncpOfObject {
	public static void main(String[] args) {
		// 객체지향 언어
		// 재사용성 높음, 유지보수 용이, 신뢰성 높음(제어자와 메서드 이용 데이터 보호)
		
		// 클래스와 객체
		// 클래스는 단지 객체를 생성하는데 사용될 뿐, 객체 그 자체는 아님
		
		// 객체 구성요소
		// 속성(멤버변수), 기능(메서드)
		// 객체가 가진 속성과 기능을 객체의 멤버(구성원, member)라 함
	
		// 객체와 인스턴스
		// 인스턴스화: 클래스로부터 객체를 만드는 과정
		// 인스턴스: 어떤 클래스로부터 만들어진 객체. 그 클래스의 인스턴스라 함. 한 클래스에 여러 인스턴스 생성 가능
		// 학생은 객체다. 학생은 학생 클래스의 인스턴스다.
		
		// 객체 생성과 사용
		Tv tv = new Tv();
		tv.channel = 7;
		tv.channelUp();
		System.out.println("현재 채널은 " + tv.channel + "입니다.");
		
		// 객체배열
		Tv[] tvArr = new Tv[2]; // 참조변수 배열(객체 배열)을 생성. 공간만 만든 것!
		tvArr[0] = new Tv(); // 이제 객체 생성!
		tvArr[1] = new Tv();
		
		Tv[] tvArr2 = { new Tv(), new Tv()}; // 한 줄로 배열 생성 및 객체 생성 가능
		
		Tv[] tvArr3 = new Tv[100];
		for(int i = 0; i < tvArr3.length; i++) {
			tvArr3[i] = new Tv(); // 수가 많을 땐 for문으로 처리
		}
	}
}

class Tv {
	// Tv의 속성(멤버변수)
	boolean power;
	int channel;
	
	// Tv의 기능(메서드)
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}