package oop2;

public class Modifier {
	public static void main(String[] args) {
		// 제어자
		// 클래스, 변수 또는 메서드의 선언부와 함께 사용되어 부가적인 의미를 부여
		
		// 제어자 종류
		// 접근 제어자: public, protected, (default), private
		// 그     외: static, final, abstract, native, transient, synchronized, volatile, strictfp
		
		// 제어자 특징
		// 접근 제어자는 네 가지 중 하나만 선택해서 사용 가능. 그 외는 여러 개 조합 가능
		// 접근 제어자를 제일 왼쪽에 놓는 경향 있음
		
		// 접근 제어자(access modifier)
		// 사용 목적1: 클래스, 멤버변수, 메서드, 생성자에서 사용. 해당하는 멤버 또는 클래스를 외부에서 접근하지 못하도록 제한해 클래스 내부에 선언된 데이터 보호. 또는 데이터 유효한 값 유지하도록 하기 위함
		// 사용 목적2: 클래스 내에서만 사용되는, 내부 작업을 위해 임시로 사용되는 멤버변수나 부분작업을 처리하기 위한 메서드 등의 멤버들을 클래스 내부에 감추기 위함
		// 접근 제어자 따로 지정 안 되어 있다면 접근 제어자 default를 의미. 생략 가능
		// private(같은 클래스 내에서 접근 가능) < default(같은 패키지 내 접근 가능) < protected(같은 패키지 내, 그리고 다른 패키지의 자손클래스에서 접근 가능) < public(접근 제한 없음)
		
		// 제어자 - static
		// '클래스의', '공통적인' 
		// 클래스 변수(static이 붙은 변수): 인스턴스에 관계없이 같은 값을 가짐
		// 클래스 메서드(static이 붙은 메서드): 메서드, 초기화 블럭 인스턴스 없이도 생성 가능. 따라서 인스턴스 멤버 사용하지 않는 메서드라면 static 붙이는 것을 고려. 성능!
		
		// 제어자 - final
		// '마지막의', '변경될 수 없는'
		// 변수 사용시 변경할 수 없는 상수가 도미
		// 메서드 사용시 오버라이딩 불가
		// 클래스 사용시 자신을 확장하는 자손클래스 정의하지 못함
		// 아래 예시
		
		// 제어자 - abstract
		// '추상의', '미완성의'
		// 클래스, 메서드에서 사용 가능
		// 클래스 사용시, 클래스 내에 추상 메서드가 선언되어 있음을 의미
		// 메서드 사용시, 메서드의 선언부만 작성하고 실제 수행내용은 구현하지 않은 추상 메서드를 선언하는데 사용
		// 추상 클래스는 인스턴스 생성 불가! 미완성 설계도 이므로! 예) AbstractTest a = new AbstractTest(); 에러
		// 아래 예시
		
	}
}

final class FinalTest {
	final int MAX_SIZE = 10; // 값 변경 불가한 멤버변수(상수)
	
	final void getMaxSize() { // 오버라이딩 불가한 메서드
		final int LV = MAX_SIZE; // 값 변경 불가한 지역변수(상수)
	}
}

abstract class AbstractTest { // 추상 클래스(추상 메서드를 포함한 클래스)
	abstract void move(); // 추상 메서드(구현부가 없는 메서드)
}