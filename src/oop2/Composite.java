package oop2;

public class Composite {
	public static void main(String[] args) {
		// ���԰���
		// �� Ŭ������ �ٸ� Ŭ������ ��������� ������ ���Խ�Ű�� ��
		
		// ��� vs ����
		// ��Ӱ���: ~�� ~�̴� ��) SportsCar�� Car�̴�
		// ���԰���: ~�� ~�� ������ �ִ� ��) Deck(ī�� �� ��)�� Card�� ������ �ִ�
	}
}

class Car3 { // �Ʒ�ó�� Car�� �ϳ��ϳ� �����ϴ� �ͺ��� ���� �����ؼ� ���Խ�Ű�� �� �����ϰ� ���뼺 ����
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