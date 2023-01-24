package basic;

import java.util.Scanner;

public class InputConsole {
	public static void main(String[] args) {
		
		// print
		System.out.println("print(): �ٹٲ� �� ��");
		System.out.println("println(): �ٹٲ� ��");
		System.out.println("printf(specifier, ������): ���� �������� ��ȯ�� ��½� ���"); 
		
		int age = 14;
		int year = 2014; 
		String url = "www.naver.com";
		System.out.printf("%nage:%d%nyear:%d%n", age, year); // %d(10����), %n(�ٹٲ�), %x(16����), %f(�Ҽ���), %c(����), %s(���ڿ�)
		System.out.printf("[%20s]%n", url); // �ּ� 20���� ��°��� Ȯ��(��������)
		System.out.printf("[%-20s]%n", url); // �ּ� 20���� ��°��� Ȯ��(��������)
		System.out.printf("[%.8s]%n", url); // ���ʿ��� 8���ڸ� ���
		
		// Scanner
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine(); // �Է� �� ���� ������ ���ڿ��� ��ȯ
		int input2 = scanner.nextInt(); // �Ǵ� float �� ������ string���� �ް� ��ȯ�ϴ� ���� ����
		System.out.println(input1);
		
	}
}
