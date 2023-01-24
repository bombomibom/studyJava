package oop1;

public class ObjectMethodConstructor {
	public static void main(String[] args) {
		// 생성자
		// 인스턴스 생성될 때 호출되는 인스턴스 초기화 메서드
		// 인스턴스 변수 초기화 및 인스턴스 생성 시 실행되어야 하는 작업용
		// 클래스 이름과 동일. 오버로딩 가능
		// 연산자 new가 인스턴스를 생성하는 것. 생성자가 인스턴스를 생성하는 게 아님
		// 생성자는 단순히 인스턴스 변수들의 초기화에 사용되는 조금 특별한 메서드
		// 클래스 내 생성자가 하나도 없을 때 기본 생성자 컴파일러가 제공
		// 선택한 클래스의 어떤 생성자로 인스턴스를 생성할 것인가에 대해 고민!
		
		// 생성자에서 다른 생성자 호출
		// this()로 호출
		// this는 참조변수이고, this()는 생성자
		// 첫쨰줄에서 호출. 그 앞에서 초기화 작업해봤자 다시 생성자 호출해서 초기화하면 무용지물이기에
		// 생성자들 유기적으로 연결해주면 더 좋은 코드 얻을 수 있음. 수정이 필요한 경우 보다 적은 코드만 변경하면 되므로 유지보수 용이
		
		Car car = new Car();
		car.color = "white";
		
		Car car2 = new Car("white", "auto", 4); // 이렇게 사용하는 것이 위보다 간결하고 직관적
		Car car3 = new Car("red"); 
		System.out.println(car3.door); // 생성자에서 다른 생성자 호출했기에 조회됨 
	}
}

class Car {
	String color;
	String gearType;
	int door;
	
	Car() { // 기본 생성자
		
	}
	
	Car(String color){ 
		this(color, "auto", 4); // 생성자에서 다른 생성자 호출
	}
	
	Car(String color, String gearType, int door) { // 매개변수가 있는 생성자
		this.color = color; // 이 this도 인스턴스 멤버만 사용 가능. static의 경우 인스턴스 생성하지 않고도 호출 가능하므로 static 호출된 시점에 인스턴스 존재 안 할 수도 있기 때문
		this.gearType = gearType;
		this.door = door;
	}
	
}