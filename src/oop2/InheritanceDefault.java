package oop2;

public class InheritanceDefault {
	public static void main(String[] args) {
		// ���
		// ������ ����� �ڼ��� ����� �� ���� + �ڼ� �ڽŸ��� ����� �߰� ����
		// �ڵ� ����ȭ�� ���� ���꼺 �� �������� ����
		// extends(���󺸴� ���� �Ӽ��� ��� ���� �� �ֱ⿡ Ȯ���� ����)
		// ��Ӱ�����(class hierarchy): ����, �ڼ�Ŭ������ ��Ӱ��踦 �׸����� ǥ���� ��
		
		// ���� ���(Single Inheritance)
		// �ڹٿ����� ���� ��Ӹ��� ���. Ŭ���� �� ���� ���� & ���� �̸��� ��� ���� ��ƴٴ� ���� ����

		// Object Ŭ����
		// ��� Ŭ���� ��Ӱ������� �ֻ����� �ִ� ����Ŭ����
		// � Ŭ�����κ��� ��ӹ޵��� �������� �ʴ´ٸ� �����Ϸ� �ڵ����� extends Object ó��
		// �ٸ� �̷��� ����� �޴´ٰ� �ϴ��� ��Ӱ������� ���� ����Ŭ������ ����Ŭ������ ã�� �ö󰡴� ���� �ֻ��� ������ Object
		// ��) toString(), equals(Object o)...
		
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		stv.displayCaption("�ڸ�");
		stv.caption = true;
		stv.displayCaption("�ڸ� ���̰� ����");
	}
}

class Tv {
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class SmartTv extends Tv {
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}