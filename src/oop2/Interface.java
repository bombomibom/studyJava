package oop2;

public class Interface {
	public static void main(String[] args) {
		// 인터페이스
		// 추상화 정도가 더 높은 일종의 추상클래스(구현부까지 갖춘 일반 메서드 또는 멤버변수 구성원으로 가질 수 없음)
		// 추상메서드와 상수만을 멤버로 가질 수 있음
		// 추상클래스가 '미완성 설계도'라면 인터페이스는 '기본 설계도'라 할 수 있음
		// 목적: 그 자체만으로 사용한다기 보단 다른 클래스 작성에 도움 줄 목적으로 사용
		
		// 인터페이스 작성방법
		// 접근제어자로 public 또는 default만 사용 가능
		// 모든 멤버변수는 public static final 이어야 하며, 생략 가능
		// 모든 메서드는 public abstract 이어야 하며, 생략 가능(단 static 메서드와 default 메서드는 예외. jdk 1.8부터)
		// * default method, static method
		//   원래는 인터페이스 추상메서드만 선언 가능했음. JDK1.8부터 default&static도 가능하게 됨
		//   인터페이스에 메서드를 추가한다는 것은 구현한 클래스 모두에 추가해야 한다는 것을 의미
		//   변경사항이 있다면 클래스 전부를 바꾸지 않고 아래처럼 추가할 수 있음
		//   default void newMethod() {} 이렇게 구현부까지 생성해서 추가. public 생략된 형태
	 	
		// 인터페이스 상속
		// 인터페이스는 인터페이스로부터만 상속 가능. 클래스와 달리 인터페이스 다중상속도 가능
		
		// 인터페이스 구현
		// 추상클래스처럼 인터페이스도 자신에 정의된 추상메서드의 몸통을 만들어주는 클래스 생성 필요
		// 상속의 extends 대신 구현한다는 의미의 implements 사용
		// 상속, 구현 둘 다 같이 사용 가능
		
		// 인터페이스 다형성
		// 다형성: 자손클래스 인스턴스 참조변수를 조상타입으로 변형 가능
		// 위처럼 인터페이스 또한 이를 구현한 클래스의 조상이기에 자손클래스 인스턴스를 인터페이스 타입으로 변형 가능
		// 참조변수, 매개변수 void attact(Fightable f), 리턴타입 Fightable method() {} 다 가능
		// 매개변수가 인터페이스 타입이라는 건 메서드 호출시 해당 인터페이스를 구현한 클래스의 인스턴스를 매개변수로 제공해야 한다는 것을 의미
		// 리턴타입이 인터페이스라는 건 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미
		// --> 인터페이스 자체가 아닌 그것을 구현한 곳을 참조한다는 뜻
		Fightable f = (Fightable)new Fighter(); // Fightable 생략 가능
		
		// 인터페이스 장점
		// 개발시간 단축: 메서드 호출쪽에서는 메서드 선언부만 알면 되기에
		// 표준화 가능: 기본 틀을 가지고 개발하기에 일관됨
		// 서로 관계없는 클래스들 관계 맺을 수 있음: 상속 또는 같은 조상 아니어도 관계 맺을 수 있음
		// 독립적인 프로그래밍 가능: 선언과 구현을 분리시키기에 실제구현에 독립적인 프로그램 작성 가능
	}
}

interface PlayingCard {
	public static final int SPADE = 4; // 생략 가능 예시 아래 참고
	final int DIAMOND = 3;
	static int HEART = 2;
	int CLOVER = 1;
	
	public abstract String getCardNumber(); // 생략 가능 예시 아래 참고
	String getCardKind();
}

interface Movable {
	void move(int x, int y);
	default void newMove() { // 추후 추가 메서드
		System.out.println("이렇게 추후에 추가해야할 메서드는 default 붙여서 다른 클래서 전부 추가해야하는 번거로움 없앨 수 있음");
	}
}

interface Attackable {
	// 지정된 대상(u)를 공격하는 기능의 메서드
	void attack(Unit u); // ModifierAbstract에 있음
}

interface Fightable extends Movable, Attackable { } // 조상 인터페이스로부터 상속받은 두 개의 추상메서드, move와 attack을 멤버로 갖게 됨

class Fighter implements Fightable { // 인터페이스에 정의된 추상메서드 모두 구현
	public void move(int x, int y) {};
	public void attack(Unit u) {};
}

class Fighter2 extends Unit implements Fightable { // 상속과 구현 동시에 가능
	public void move(int x, int y) {};
	public void attack(Unit u) {};
}

abstract class Fighter3 implements Fightable { // 일부만 구현할 시 abstract 필히 붙여야 함
	public void move(int x, int y) {};
}