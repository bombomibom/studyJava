package oop1;

public class ObjectMethod {
	public static void main(String[] args) {
		// 메서드
		// 입출력 중요. 메서드 내부는 보이지 않는 '블랙박스'라고도 함
		// 선언부(header)와 구현부(body)로 이루어져 있음
		
		// 1. 선언부
		// 반환타입, 메서드이름, 매개변수선언으로 구성 예) int add(int x, int y)
		
		// - 반환타입
		// 반환값이 없는 경우 void(=존재하지 않음) 선언 예) void add(int x, int y)
		
		// - 매개변수 
		// 일반적인 변수선언과 달리 두 변수 타입 같아도 생략 불가
		// 메서드 내에 선언된 것이므로 지역변수로 간주
		
		// 2. 구현부
		// return문은 반환타입과 일치하거나 자동 형변환(예를 들어 long -> double) 가능한 것이어야 함
		// return문은 단 하나의 값만 반환 가능
		// return문은 모든 메서드에 적어도 하나는 있어야 하나 void의 경우 컴파일러가 자동으로 추가해주기에 생략 가능
		
		// 3. 호출
		// main 메서드는 프로그램 실행시 OS에 의해 자동 호출
		MyMath myMath = new MyMath();
		myMath.print();
		int result = myMath.add(2, 5); // 메서드 호출 시 괄호() 안에 지정한 값을 인수(argument) 또는 인자라 함
		System.out.println(result);
	
		// 4. 호출스택(call stack)
		// 호출스택은 메서드의 작업에 필요한 메모리 공간을 제공
		// 메서드가 호출되면 호출스택에 호출된 메서드를 위한 메모리가 할당
		// 이 메모리는 메서드가 작업을 수행하는 동안 지역변수(매개변수 포함)들과 연산의 중간 결과 등을 저장하는데 사용
		// 작업 마치면 할당되었던 메모리 공간 반환되어 비어짐
		// 호출스택 제일 위에 있는 메서드가 현재 실행 중인 메서드. 아래에 있는 메서드가 바로 위의 메서드를 호출한 메서드
		// 반환타입이 있는 메서드는 종료되며 결과값을 자신을 호출한 메서드(caller)에게 반환
		// 대기상태에 있던 호출한 메서드(caller)는 넘겨받은 반환값으로 계속 수행
		
		// 5. 클래스 메서드 vs 인스턴스 메서드
		
		// 클래스 메서드
		// static 붙어 있음
		// 객체 생성없이 '클래스이름.메서드이름(매개변수)' 호출 가능
		// 클래스 메서드는 인스턴스 변수 사용 불가. 인스턴스를 생성해야하는데 그 여부를 알 수 없기 때문
		// 인스턴스 변수는 인스턴스 존재시 사용 가능. 클래스 메서드 호출시 인스턴스 존재 안 할 수 있기에 클래스 메서드에서 인스턴스 변수 사용 금지
		// 반면 인스턴스 변수나 메서드에서는 static 붙은 멤버 사용 가능. 인스턴스 변수가 존재한다는 것은 static 변수 이미 메모리에 존재한다는 것을 의미하기에
		// 메서드 중 인스턴스 변수 및 인스턴스 메서드 사용 안 한다면 static 붙이는 것 고려. 메서드 호출시간이 짧아지므로 성능 향상
		// static 안 붙은 메서드는 실행 시 호출되어야할 메서드 찾는 과정 추가적으로 필요
		// main method의 경우에도 인스턴스 생성 안 해도 작업 수행해야해서 static 붙음
		
		// 인스턴스 메서드
		// 객체 생성해야만 호출 가능
		
		System.out.println(MyMath2.add(2, 3)); // 클래스 메서드
		MyMath2 mm = new MyMath2();
		mm.a = 3;
		mm.b = 4;
		System.out.println("mm.add() : " + mm.add()); // 인스턴스 메서드

		// 6. 메서드 간 호출과 참조
		// 인스턴스 멤버(인스턴스 변수, 인스턴스 메서드) -> 인스턴스 멤버 or 클래스 멤버 호출 가능
		// 클래스 멤버 -> 인스턴스 멤버 호출하고자 하는 경우엔 꼭 인스턴스 생성
		// 인스턴스 멤버 존재 시점에 클래스 멤버는 항상 존재하나, 클래스 멤버 존재시에는 인스턴스 멤버 존재 안 할 수도 있기에
		// 아래 TestClass 참고
		
		// 7. 오버로딩
		// 같은 이름의 메서드라도 매개변수의 개수 또는 타입이 다르면 같은 이름 사용 가능
		// 반환타입은 관계 없음
		// 예) println(boolean x), println(String x)...
	}
}

class MyMath { // 매개변수, 반환타입
	void print() {
		System.out.println("그냥 프린트");
	}
	
	int add(int x, int y) {
		int result = x+y;
		return result;
	}
}

class MyMath2 { // 클래스 메서드 vs 인스턴스 메서드
	int a, b;
	
	static int add(int a, int b) { return a + b; }
	int add() { return a + b; }
}

class TestClass {
	int iv;
	static int iv2;
	
	void instanceMethod() {};
	static void staticMethod() {};
	
	void instanceMethod2() { // 인스턴스 메서드
		instanceMethod(); // 인스턴스 메서드, 클래스 메서드 둘 다 호출 가능
		staticMethod();
		
		System.out.println(iv); // 인스턴스 변수, 클래스 변수 둘 다 사용 가능
		System.out.println(iv2);
	}
	
	static void staticMethod2() { // 클래스 메서드 
		// instanceMethod(); // 인스턴스 메서드 호출 불가(인스턴스 존재 여부로 인해)
		staticMethod(); 
		
		// System.out.println(iv); // 인스턴스 변수 호출 불가
		System.out.println(iv2); 
	}
}