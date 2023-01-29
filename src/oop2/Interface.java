package oop2;

public class Interface {
	public static void main(String[] args) {
		// �������̽�
		// �߻�ȭ ������ �� ���� ������ �߻�Ŭ����(�����α��� ���� �Ϲ� �޼��� �Ǵ� ������� ���������� ���� �� ����)
		// �߻�޼���� ������� ����� ���� �� ����
		// �߻�Ŭ������ '�̿ϼ� ���赵'��� �������̽��� '�⺻ ���赵'�� �� �� ����
		// ����: �� ��ü������ ����Ѵٱ� ���� �ٸ� Ŭ���� �ۼ��� ���� �� �������� ���
		
		// �������̽� �ۼ����
		// ���������ڷ� public �Ǵ� default�� ��� ����
		// ��� ��������� public static final �̾�� �ϸ�, ���� ����
		// ��� �޼���� public abstract �̾�� �ϸ�, ���� ����(�� static �޼���� default �޼���� ����. jdk 1.8����)
		// * default method, static method
		//   ������ �������̽� �߻�޼��常 ���� ��������. JDK1.8���� default&static�� �����ϰ� ��
		//   �������̽��� �޼��带 �߰��Ѵٴ� ���� ������ Ŭ���� ��ο� �߰��ؾ� �Ѵٴ� ���� �ǹ�
		//   ��������� �ִٸ� Ŭ���� ���θ� �ٲ��� �ʰ� �Ʒ�ó�� �߰��� �� ����
		//   default void newMethod() {} �̷��� �����α��� �����ؼ� �߰�. public ������ ����
	 	
		// �������̽� ���
		// �������̽��� �������̽��κ��͸� ��� ����. Ŭ������ �޸� �������̽� ���߻�ӵ� ����
		
		// �������̽� ����
		// �߻�Ŭ����ó�� �������̽��� �ڽſ� ���ǵ� �߻�޼����� ������ ������ִ� Ŭ���� ���� �ʿ�
		// ����� extends ��� �����Ѵٴ� �ǹ��� implements ���
		// ���, ���� �� �� ���� ��� ����
		
		// �������̽� ������
		// ������: �ڼ�Ŭ���� �ν��Ͻ� ���������� ����Ÿ������ ���� ����
		// ��ó�� �������̽� ���� �̸� ������ Ŭ������ �����̱⿡ �ڼ�Ŭ���� �ν��Ͻ��� �������̽� Ÿ������ ���� ����
		// ��������, �Ű����� void attact(Fightable f), ����Ÿ�� Fightable method() {} �� ����
		// �Ű������� �������̽� Ÿ���̶�� �� �޼��� ȣ��� �ش� �������̽��� ������ Ŭ������ �ν��Ͻ��� �Ű������� �����ؾ� �Ѵٴ� ���� �ǹ�
		// ����Ÿ���� �������̽���� �� �޼��尡 �ش� �������̽��� ������ Ŭ������ �ν��Ͻ��� ��ȯ�Ѵٴ� ���� �ǹ�
		// --> �������̽� ��ü�� �ƴ� �װ��� ������ ���� �����Ѵٴ� ��
		Fightable f = (Fightable)new Fighter(); // Fightable ���� ����
		
		// �������̽� ����
		// ���߽ð� ����: �޼��� ȣ���ʿ����� �޼��� ����θ� �˸� �Ǳ⿡
		// ǥ��ȭ ����: �⺻ Ʋ�� ������ �����ϱ⿡ �ϰ���
		// ���� ������� Ŭ������ ���� ���� �� ����: ��� �Ǵ� ���� ���� �ƴϾ ���� ���� �� ����
		// �������� ���α׷��� ����: ����� ������ �и���Ű�⿡ ���������� �������� ���α׷� �ۼ� ����
	}
}

interface PlayingCard {
	public static final int SPADE = 4; // ���� ���� ���� �Ʒ� ����
	final int DIAMOND = 3;
	static int HEART = 2;
	int CLOVER = 1;
	
	public abstract String getCardNumber(); // ���� ���� ���� �Ʒ� ����
	String getCardKind();
}

interface Movable {
	void move(int x, int y);
	default void newMove() { // ���� �߰� �޼���
		System.out.println("�̷��� ���Ŀ� �߰��ؾ��� �޼���� default �ٿ��� �ٸ� Ŭ���� ���� �߰��ؾ��ϴ� ���ŷο� ���� �� ����");
	}
}

interface Attackable {
	// ������ ���(u)�� �����ϴ� ����� �޼���
	void attack(Unit u); // ModifierAbstract�� ����
}

interface Fightable extends Movable, Attackable { } // ���� �������̽��κ��� ��ӹ��� �� ���� �߻�޼���, move�� attack�� ����� ���� ��

class Fighter implements Fightable { // �������̽��� ���ǵ� �߻�޼��� ��� ����
	public void move(int x, int y) {};
	public void attack(Unit u) {};
}

class Fighter2 extends Unit implements Fightable { // ��Ӱ� ���� ���ÿ� ����
	public void move(int x, int y) {};
	public void attack(Unit u) {};
}

abstract class Fighter3 implements Fightable { // �Ϻθ� ������ �� abstract ���� �ٿ��� ��
	public void move(int x, int y) {};
}