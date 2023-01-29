package oop2;

public class InheritanceDefault {
	public static void main(String[] args) {
		// 상속
		// 조상의 멤버를 자손이 사용할 수 있음 + 자손 자신만의 멤버도 추가 가능
		// 코드 공통화를 통해 생산성 및 유지보수 용이
		// extends(조상보다 많은 속성과 기능 가질 수 있기에 확장의 개념)
		// 상속계층도(class hierarchy): 조상, 자손클래스의 상속관계를 그림으로 표현한 것
		
		// 단일 상속(Single Inheritance)
		// 자바에서는 단일 상속만을 허용. 클래스 간 관계 복잡 & 같은 이름의 멤버 구분 어렵다는 단점 때문

		// Object 클래스
		// 모든 클래스 상속계층도의 최상위에 있는 조상클래스
		// 어떤 클래스로부터 상속받도록 지정하지 않는다면 컴파일러 자동으로 extends Object 처리
		// 다만 이렇게 상속을 받는다고 하더라도 상속계층도를 따라 조상클래스의 조상클래스를 찾아 올라가다 보면 최상위 조상은 Object
		// 예) toString(), equals(Object o)...
		
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		stv.displayCaption("자막");
		stv.caption = true;
		stv.displayCaption("자막 보이게 시작");
	}
}

class Tv {
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class SmartTv extends Tv {
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}