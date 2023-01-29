package oop2;

public class Polymorphism {
	public static void main(String[] args) {
		// 다형성
		// 여러 가지 형태를 가질 수 있는 능력
		// 상속관계에 있는 경우, 조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있음
		// 아래 둘 다 같은 타입의 인스턴스지만 참조변수 타입에 따라 사용할 수 있는 멤버의 개수가 달라짐
		
		SmartTv2 s = new SmartTv2();
		Tv2 t = new SmartTv2(); // 참조변수 t로는 SmartTv2 인스턴스의 모든 멤버를 사용할 수 없음 
		// SmartTv2 s2 = new Tv2(); // 자손클래스를 참조변수로 두는 건 불가! Tv2에서 소환할 수 없는 멤버가 있기에!
		
		// 참조변수의 형변환
		// 서로 상속관계에 있는 클래스 사이 형변환 가능 조상 <-> 자손
		// Object로 형변환 가능한 이유 -> 모든 클래스 조상
		// 목적: 사용 가능한 멤버 개수를 조절하기 윈한 것
		// 조상타입으로 형변환 할 경우 사용 가능한 멤버 개수 줄어들기에 안전
		
		Car2 car2 = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car2 = fe; // car = (Car)fe;에서 형변환됨
		// car.water(); Car 타입의 참조변수로는 water() 호출 불가
		fe2 = (FireEngine)car2; // 자손타입 <- 조상타입 인 경우 형변환 생략 불가
		fe2.water();
		
		// instanceof 연산자
		// 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 사용
		// instanceof 왼쪽에는 참조변수, 오른쪽에는 타입(클래스명)이 피연산자로 위치
		// 연산 결과는 true or false. true는 참조변수가 검사한 타입으로 형변환 가능하다는 뜻
		// 조상타입의 참조변수로는 실제 자손타입 인스턴스를 모두 사용할 수 없기에, 실제 인스턴스와 같은 타입의 참조변수로 형변환 해야만 인스턴스 모든 멤버들을 사용할 수 있음
		// 예) Car2 c = new FireEngine(); -> c는 FireEngine의 water() 사용 불가
		//    따라서 c instanceof FireEngine 가능한지 체크 후 true 나오면 (FireEngine)c로 형변환 해 water() 사용!
		fe2.doWork(car2);
		
		// 매개변수의 다형성
		// 매개변수를 조상클래스로 해주면 자손타입 어느 것이나 받아들일 수 있다는 뜻 예) Product -> Desk, Chair...
		Buyer b = new Buyer();
		// Desk d = new Desk();
		// Chair c = new Chair();
		// b.buy(d);
		// b.buy(c);
		b.buy(new Desk()); // 위 대신 이렇게도 생성 가능
		b.buy(new Chair());
		b.summary();
		
		// 객체배열
		// 조상타입의 참조변수 배열을 사용해, 공통의 조상을 가진 서로 다른 종류의 객체를 배열로 묶어서 다룸
		// Product p1 = new Desk(); Product p2 = new Chair(); ... 이런 걸 아래처럼 사용
		// Product p[] = new Product[2];
		// p[0] = new Desk();
		// p[1] = new Chair();
		
	}
}

class Tv2 {
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class SmartTv2 extends Tv2 {
	String text;
	void caption() {}
}

class Car2 {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~~");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car2 { // 소방차
	void water() { // 물 뿌리는 기능
		System.out.println("water!!");
	}
	
	void doWork(Car2 c) {
		if(c instanceof FireEngine) {
			FireEngine fe = (FireEngine)c;
			fe.water();
		}
	}
}

class Chair extends Product {
	Chair(){
		super(100); // 조상클래스의 생성자 Product(int price) 호출
	}
	
	public String toString() { return "Chair"; } // Object클래스의 toString()을 오버라이딩
}

class Desk extends Product {
	Desk() {
		super(200);
	}
	
	public String toString() { return "Desk"; }
}

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product(){
		
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] cart = new Product[10]; // 현재는 10개로 딱 고정했는데 11개 이상일 때 문제. 이때 Vector 클래스 사용
	int i = 0;
	
	void buy(Product p) { // Chair, Desk 등 어떤 것을 살지 모를 때 + 추가할 때 용이
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p; // 무엇을 샀는지 표시
		System.out.println(p + "을/를 구입하셨습니다."); // 여기서 p를 데려오면 toString에 있는 내용 가져와짐
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0; i < cart.length; i++) {
			if(cart[i] == null) break;
			sum += cart[i].price;
			itemList += (i==0) ? "" + cart[i] : ", " + cart[i]; // 삼항연산자로 마지막 , 지움
		}
		
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}
