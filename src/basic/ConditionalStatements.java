package basic;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		// ���ǹ�: switch
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("������ ������ ���Դϴ�.");
				break;
			case 6: case 7: case 8:
				System.out.println("������ ������ �����Դϴ�.");
				break;
			default:
				System.out.println("���ǿ� ������ default�� �ɴϴ�.");
		}
	}
}
