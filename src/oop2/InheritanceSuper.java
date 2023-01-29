package oop2;

public class InheritanceSuper {
	public static void main(String[] args) {
		// 참조변수 super
		// 멤버변수와 지역변수 이름 같을 때 this 붙여서 구별하듯이 상속받은 멤버와 자신의 멤버 구별하기 위함
		
		Child child = new Child();
		child.method();
		
		// 조상의 생성자 super()
		// 조상의 멤버는 조상클래스에서 초기화 되도록 작성하는 것이 더 바람직
	}
}

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20; 
	void method() {
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

class Point2 {
	int x, y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point3D2 extends Point2 {
	int z;
	
	Point3D2(int x, int y, int z){
		//this.x = x; 이렇게 하지 말고!
		//this.y = y;
		super(x, y);
		this.z = z;
	}
}