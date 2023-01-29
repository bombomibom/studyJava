package oop2;

public class Polymorphism {
	public static void main(String[] args) {
		// ������
		// ���� ���� ���¸� ���� �� �ִ� �ɷ�
		// ��Ӱ��迡 �ִ� ���, ����Ŭ���� Ÿ���� ���������� �ڼ�Ŭ������ �ν��Ͻ��� ������ �� ����
		// �Ʒ� �� �� ���� Ÿ���� �ν��Ͻ����� �������� Ÿ�Կ� ���� ����� �� �ִ� ����� ������ �޶���
		
		SmartTv2 s = new SmartTv2();
		Tv2 t = new SmartTv2(); // �������� t�δ� SmartTv2 �ν��Ͻ��� ��� ����� ����� �� ���� 
		// SmartTv2 s2 = new Tv2(); // �ڼ�Ŭ������ ���������� �δ� �� �Ұ�! Tv2���� ��ȯ�� �� ���� ����� �ֱ⿡!
		
		// ���������� ����ȯ
		// ���� ��Ӱ��迡 �ִ� Ŭ���� ���� ����ȯ ���� ���� <-> �ڼ�
		// Object�� ����ȯ ������ ���� -> ��� Ŭ���� ����
		// ����: ��� ������ ��� ������ �����ϱ� ���� ��
		// ����Ÿ������ ����ȯ �� ��� ��� ������ ��� ���� �پ��⿡ ����
		
		Car2 car2 = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car2 = fe; // car = (Car)fe;���� ����ȯ��
		// car.water(); Car Ÿ���� ���������δ� water() ȣ�� �Ұ�
		fe2 = (FireEngine)car2; // �ڼ�Ÿ�� <- ����Ÿ�� �� ��� ����ȯ ���� �Ұ�
		fe2.water();
		
		// instanceof ������
		// ���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� �˾ƺ��� ���� ���
		// instanceof ���ʿ��� ��������, �����ʿ��� Ÿ��(Ŭ������)�� �ǿ����ڷ� ��ġ
		// ���� ����� true or false. true�� ���������� �˻��� Ÿ������ ����ȯ �����ϴٴ� ��
		// ����Ÿ���� ���������δ� ���� �ڼ�Ÿ�� �ν��Ͻ��� ��� ����� �� ���⿡, ���� �ν��Ͻ��� ���� Ÿ���� ���������� ����ȯ �ؾ߸� �ν��Ͻ� ��� ������� ����� �� ����
		// ��) Car2 c = new FireEngine(); -> c�� FireEngine�� water() ��� �Ұ�
		//    ���� c instanceof FireEngine �������� üũ �� true ������ (FireEngine)c�� ����ȯ �� water() ���!
		fe2.doWork(car2);
		
		// �Ű������� ������
		// �Ű������� ����Ŭ������ ���ָ� �ڼ�Ÿ�� ��� ���̳� �޾Ƶ��� �� �ִٴ� �� ��) Product -> Desk, Chair...
		Buyer b = new Buyer();
		// Desk d = new Desk();
		// Chair c = new Chair();
		// b.buy(d);
		// b.buy(c);
		b.buy(new Desk()); // �� ��� �̷��Ե� ���� ����
		b.buy(new Chair());
		b.summary();
		
		// ��ü�迭
		// ����Ÿ���� �������� �迭�� �����, ������ ������ ���� ���� �ٸ� ������ ��ü�� �迭�� ��� �ٷ�
		// Product p1 = new Desk(); Product p2 = new Chair(); ... �̷� �� �Ʒ�ó�� ���
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

class FireEngine extends Car2 { // �ҹ���
	void water() { // �� �Ѹ��� ���
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
		super(100); // ����Ŭ������ ������ Product(int price) ȣ��
	}
	
	public String toString() { return "Chair"; } // ObjectŬ������ toString()�� �������̵�
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
	Product[] cart = new Product[10]; // ����� 10���� �� �����ߴµ� 11�� �̻��� �� ����. �̶� Vector Ŭ���� ���
	int i = 0;
	
	void buy(Product p) { // Chair, Desk �� � ���� ���� �� �� + �߰��� �� ����
		if(money < p.price) {
			System.out.println("�ܾ� ����");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p; // ������ ����� ǥ��
		System.out.println(p + "��/�� �����ϼ̽��ϴ�."); // ���⼭ p�� �������� toString�� �ִ� ���� ��������
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0; i < cart.length; i++) {
			if(cart[i] == null) break;
			sum += cart[i].price;
			itemList += (i==0) ? "" + cart[i] : ", " + cart[i]; // ���׿����ڷ� ������ , ����
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}
