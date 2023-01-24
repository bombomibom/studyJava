package basic;

public class Variable {
	public static void main(String[] args) {

		// �ڷ��� ����: �⺻��(primitive type), ������(reference type)
		// �⺻��: boolean, char, byte, short, int, long, float, double 
		// ������: �⺻�� �� ��ü�� �ּҸ� ������ ���� ����. ���� �Ұ�
		
		// ���� ����� ����
		int x;
		x = 5;

		// ���� Ÿ��
		int a = 100;
		double pi = 3.14;
		char ch = 'a';
		String str = "abc"; // String str = new String("abc"); �� ����. char�迭�� ���(�޼���)�� �߰��� ��

		// ���(constant)
		final int MAX_SPEED = 10; // �� ���� �Ұ�, final, �빮��, �ܾ� ���� '_'

		// ���ͷ�(literal)
		int year = 2014; // ���ͷ�: 2014. ����� �ٸ� �̸�. �� ��ü�� ���� �ǹ�
		final int MAX_VALUE = 100; // ���ͷ�: 100

		// ���ͷ� ����
		// ����, ������, �Ǽ���, ������, ���ڿ�
		// ������, �Ǽ���: ���� Ÿ���� �־� ���̻� �ٿ� ����. long Ÿ�� ���ͷ��� 'l', 'L'. ������ int Ÿ�� ���ͷ�
		// 2, 8, 10, 16���� ǥ���� ���ͷ� ���� ����� 16������ 0x, 0X. 8������ 0
		// ������: ''
		// ���ڿ�: ""
		boolean result = false;
		int octNum = 010;
		int hexNum = 0x10;
		long big = 100_000_000_000L;
		float pi2 = 3.14f; // or F
		double rate = 1.65d; // or D
		
		// ������ �����÷ο�
		// ��: 4bit(4�ڸ�) 2���� �ִ밪 1111�� 1�� ���ϸ� ���� 10000�� �Ǿ�� ������ 4bit�� ǥ�� �Ұ��� 1�� �ڸ��� 0000�� ǥ����. �ݴ�� 0000���� 1�� ���� 9999
		// �ִ밪 + 1 = �ּҰ�. �ּҰ� - 1 = �ִ밪 ����
		// ������ �ƴϳ� ���ϴ� ���� �ƴϴ� �̷��� �����÷ο찡 ������ �ʰ� ����� ũ���� Ÿ���� ������ ��� 
		
		// ���� �� �ٲٱ�
		// String�� update�� �ƴ� create �������� �����
		int var1 = 10;
		int var2 = 20;
		int tmp;
		
		tmp = var1;
		var1 = var2;
		var2 = tmp;
		
		System.out.println("var1: " + var1);
		
		// ����ȯ(casting)
		int intVal = 1;
		String strVal1 = "1";
		String strVal2 = "3.14";
		System.out.println((char)intVal); // ���� ��ȯ
		System.out.println(Integer.toString(intVal)); // ���ڿ� ��ȯ
 		System.out.println(Integer.parseInt(strVal1)); // ���� ��ȯ
		System.out.println(Double.parseDouble(strVal2)); // �Ǽ� ��ȯ
		
	}
}
