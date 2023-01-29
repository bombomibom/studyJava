package oop2;

public class Composite {
	public static void main(String[] args) {
		// 포함관계
		// 한 클래스에 다른 클래스를 멤버변수로 선언해 포함시키는 것
		
		// 상속 vs 포함
		// 상속관계: ~은 ~이다 예) SportsCar는 Car이다
		// 포함관계: ~은 ~을 가지고 있다 예) Deck(카드 한 벌)은 Card를 가지고 있다
	}
}

class Car3 { // 아래처럼 Car에 하나하나 저장하는 것보단 따로 관리해서 포함시키는 게 간결하고 재사용성 높음
	Engine e = new Engine(); 
	Door[] d = new Door[4];
}

class Engine {
	String lpg;
	String gdi;
}

class Door {
	String color;
}