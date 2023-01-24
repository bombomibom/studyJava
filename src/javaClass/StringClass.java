package javaClass;

public class StringClass {
	public static void main(String[] args) {
		String str = "abcde";
		
		// char charAt(int index): ���ڿ����� ������ index�� �ִ� �� ���ڸ� ������
		char ch = str.charAt(3);
		System.out.println(ch);
		
		// int length(): ���ڿ� ���� ��ȯ
		int strLen = str.length();
		System.out.println(strLen);
		
		// String substring(int from, int to): ���ڿ����� �ش� ������ ���ڿ� ��ȯ(to�� ���� x)
		String subStr = str.substring(0, 3);
		System.out.println(subStr);
		
		// boolean equals(Object obj): ���ڿ� ���� ������ Ȯ��(���ڿ��� ������ equals�� ��)
		if(str.equals("abcde")) {
			System.out.println("����");
		}
		if(str.equalsIgnoreCase("ABCDE")) { // ��ҹ��� ���� �� �� ��
			System.out.println("��ҹ��� ���� �� �ϰ� ����");
		}
		
		// char[] toCharArray(): ���ڿ��� ���ڹ迭(char[])�� ��ȯ�ؼ� ��ȯ
		char[] chaArr = str.toCharArray();
		System.out.println(chaArr);
	}
}
