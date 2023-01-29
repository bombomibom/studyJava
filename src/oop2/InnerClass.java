package oop2;

public class InnerClass {
	public static void main(String[] args) {
		// 내부클래스
		// 클래스 내에 선언된 클래스
		// 클래스에 다른 클래스를 선언하는 이유는 두 클래스 긴밀한 관계이기 때문
		// 다만 내부클래스는 외부에서 잘 사용되지 않는 것이어야 함
		
		// 내부클래스 장점
		// 1. 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있음
		// 2. 코드의 복잡성 줄일 수 있음(외부에는 불필요한 클래스를 감춤으로써 캡슐화)
		
		// 내부클래스 종류와 특징
		// 내부클래스 종류는 변수의 선언위치에 따른 종류와 같음. 또한 유효범위(scope)와 접근성(accessibility)도 동일
		// instance class: 외부클래스의 멤버변수 선언위치에 선언. 주로 외부클래스의 인스턴스 멤버들과 관련된 작업에 사용될 목적으로 선언
		// static class: 외부클래스의 멤버변수 선언위치에 선언. 외부클래스의 static 멤버, 특히 static메서드에서 사용될 목적으로 선언
		// local class: 외부클래스의 메서드나 초기화 블럭 안에 선언하며, 선언된 영역 내부에서만 사용 가능
		// anonymous class: 클래스의 선언과 객체의 생성을 동시에 하는 이름없는 클래스(일회용)
	
		// 내부클래스 제어자와 접근성
		// 멤버변수와 같은 성질 가짐. 인스턴스 멤버와 static 멤버 간 규칙 또한 똑같이 적용
		// static 변수는 static inner class에서만 선언 가능
	}
}

class Outer { // 외부클래스
	private class InstanceInner { // 인스턴스 내부클래스
		int iv = 100;
		// static int cv = 100; static 불가
		final static int CONST = 100; // final은 상수이므로 가능
	} 
	protected static class StaticInner { // 스태틱 내부클래스
		int iv = 100;
		static int cv = 100; // static만 static 멤버 정의 가능
		final static int CONST = 100; // 상수도 가능
	}
	
	void myMethod() {
		class LocalInner { // 로컬 내부클래스
			int iv = 100;
			// static int cv = 100; 불가
			final static int CONST = 100; 
		}
		LocalInner lv = new LocalInner();
	}
	
	// 인스턴스멤버 간에는 서로 직접 접근 가능
	InstanceInner iv = new InstanceInner();
	// static 멤버 간에는 서로 직접 접근 가능
	StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		// static멤버는 인스턴스멤버에 직접 접근 불가
		// InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
	
		// 굳이 접근하려면 아래와 같이 객체 생성해야 함
		// 인스턴스클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있음
		Outer outer = new Outer();
		// InstanceInner obj1 = outer.new.InstanceInner();
	}
	
	void instanceMethod() {
		// 인스턴스메서드에서는 인스턴스멤버와 static멤버 모두 접근 가능
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		// 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근 불가
		// LocalInner lv = new LocalInner();
	}

	public static void main(String args[]) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
