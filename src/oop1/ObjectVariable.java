package oop1;

import java.util.Arrays;

public class ObjectVariable {
	public static void main(String[] args) {
		// ��ü ����(=�Ӽ�)
		// ���� ���� ��ġ�� ���� ����: �������(Ŭ���� ����, �ν��Ͻ� ����), ��������
		
		// Ŭ���� ����
		// �ν��Ͻ� ���� �� static ���� ����
		// Ŭ���� ������ ����ǰ�, Ŭ������ �޸𸮿� �ö� �� ������. ���� �ν��Ͻ� ���� �ʰ� �ٷ� ��� ���� ��) Ŭ�����̸�.Ŭ��������
		// ��� �ν��Ͻ��� ����� ��������� ����
		// ������� �� ��� �ν��Ͻ��� ����� ���� �����ؾ��ϴ� �Ϳ� static ����
		
		// �ν��Ͻ� ����
		// Ŭ���� ������ ����ǰ�, �ν��Ͻ� ������ �� ����
		// ������ ��������� �����Ƿ� ���� �ٸ� �� ���� �� ����
		
		// ��������
		// �޼��� ���� ����. ���� ���� ����Ǿ��� �� ����
		// �޼��� ����Ǹ� �Ҹ�
		
		// Ŭ���� ���� vs �ν��Ͻ� ����
		System.out.println("Card.width = " + Card.width); // Ŭ���� ������ �ν��Ͻ� �������� �ٷ� ��� ����

		Card c1 = new Card();
		Card c2 = new Card();
		c1.kind = "Spade"; // �ν��Ͻ� ���� �� ����
		c2.kind = "Heart";
		
		System.out.println("c1.kind = " + c1.kind); // �ν��Ͻ� ������ ���� �ٸ� �� ���� �� ����
		System.out.println("c2.kind = " + c2.kind);
		
		c1.width = 200; 
		System.out.println("c1.width = " + c1.width); // Ŭ���� ������ �ϳ��� �ٲ㵵 ����. �ٸ�, �ν��Ͻ� ������ �����ϱ� ����� 'Ŭ�����̸�.Ŭ��������'�� ���
		System.out.println("c2.width = " + c2.width);
		
		// ���� �ʱ�ȭ
		// ��������� ����. ���������� �ʼ�. �ٸ� �����ϸ� ����� ���ÿ� ������ ������ �ʱ�ȭ �ϴ� ���� �ٶ���
		// Ŭ���� ����(cv) -> �ν��Ͻ� ����(iv) ������ �ʱ�ȭ
		// �ڵ� �ʱ�ȭ -> ����� �ʱ�ȭ(����) -> �ʱ�ȭ ��, ������(����) ������ �ʱ�ȭ
		
		// ����� �ʱ�ȭ
		int a = 4; // �⺻�� ���� �ʱ�ȭ
		Card card = new Card(); // ������ ���� �ʱ�ȭ
		
		// �ʱ�ȭ ��
		// ����: Ŭ���� �ʱ�ȭ ��(Ŭ���� ���� �ʱ�ȭ�� ���), �ν��Ͻ� �ʱ�ȭ ��(�ν��Ͻ� ���� �ʱ�ȭ�� ���)
		// ���� ������ �ʱ�ȭ �۾��� �ʿ��� ��
		// Card Ŭ���� �޸𸮿� �ε��� �� Ŭ���� �ʱ�ȭ �� ���� ���� ����. �� ���� �ν��Ͻ� �ʱ�ȭ ��. �� ���� ������ ����
		// Ŭ���� �ʱ�ȭ ���� �޸𸮿� �ε��� �� �ѹ��� ����. �ν��Ͻ� �ʱ�ȭ �� �� �����ڴ� �ν��Ͻ� ������ ������ ����
		// �Ʒ� Card, ResetExample ����
		ResetExample re = new ResetExample();
		System.out.println(Arrays.toString(re.arr));
		
	}
}

class Card {
	String kind;
	int num;
	static int width = 100;
	static int height = 250;
	
	static {
		System.out.println("static { }"); // Ŭ���� �ʱ�ȭ ��
	}
	{
		System.out.println("{ }"); // �ν��Ͻ� �ʱ�ȭ ��
	}
	
	Card(){
		System.out.println("������");
	}
}

class ResetExample {
	static int[] arr = new int[10];
	
	static {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
	
}
