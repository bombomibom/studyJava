package basic;

public class Operator {
	public static void main(String[] args) {
		
		// ������(operator): ������ �����ϴ� ��ȣ ex) +,- 
		// �ǿ�����(operand): ������ ���
	
		// ���������: +,-,*,/,%
		// �񱳿�����: >,<,>=,<=,==,!=
		// ��������: &&,||,!
		// ���Կ�����: =
		// ����������: ++,--
		// ��Ÿ(����ȯ, ����, instanceof): (type),?:,instanceof
		
		// ������ ���� ����
		for(int i = 0; i < 10; i++) {
			if(i%2==0)
				System.out.println(i); // 2�� ���
			else if(i%3==0)
				System.out.println(i); // 3�� ���
		}
		
		// ���ڿ� ��: equals()
		String str = "abc";
		boolean result = str.equals("abc");
		boolean resultStr = str.equalsIgnoreCase("abC"); // ��ҹ��� ����
		System.out.println(resultStr);
		
		// ��ҹ��� ��
		
		// ���׿�����
		int x = 10;
		int y = 20;
		String result2;
		
		result2 = (x < y) ? "true" : "false" ; // ���ǽ� ? ��1 : ��2
		
	}
}
