package javaClass;

public class MathClass {
	public static void main(String[] args) {
		// Math.random()
		// 0.0 ~ 1.0 ������ ������ ���ϴ� �ϳ��� double ���� ��ȯ 
		// step1: Math.random() * ����: 0.0 ~ ���� ���� �Ҽ��� ù°�ڸ� �� ���
		// step2: +1�� ���� ���ϴ� �������� ������ �� ��, int������ �ٲ㼭 �Ҽ��� �ڸ���
		int num = 0;
		for(int i = 0; i < 5; i++) {
			num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
		}
	}
}
