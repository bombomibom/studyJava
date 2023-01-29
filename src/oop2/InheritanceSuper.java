package oop2;

public class InheritanceSuper {
	public static void main(String[] args) {
		// �������� super
		// ��������� �������� �̸� ���� �� this �ٿ��� �����ϵ��� ��ӹ��� ����� �ڽ��� ��� �����ϱ� ����
		
		Child child = new Child();
		child.method();
		
		// ������ ������ super()
		// ������ ����� ����Ŭ�������� �ʱ�ȭ �ǵ��� �ۼ��ϴ� ���� �� �ٶ���
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
		//this.x = x; �̷��� ���� ����!
		//this.y = y;
		super(x, y);
		this.z = z;
	}
}