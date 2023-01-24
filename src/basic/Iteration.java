package basic;

import java.util.Scanner;

public class Iteration {
	public static void main(String[] args) {
		// �ݺ���
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// for�� while�� ��
		for(int i = 0; i < 5; i++) { // �ʱ�ȭ, ���ǽ�, ������
			System.out.println(i);
		}
		
		int i = 0; // �ʱ�ȭ
		while(i < 5) { // ���ǽ�
			System.out.println(i);
			i++; // ������
		}
		
		// do - while��
		// while���� ���ǽ��� ����� ���� ���� �� ���� ������� ���� �� ������, do-while�� �ּ� �� ���� ����
		// ���� ������ ������, �ݺ������� ������� �Է��� �޾� ó���� �� ����
		int input = 0, answer = 0;
		
		answer = 22;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1�� 100 ������ ������ �Է��ϼ���.");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
			} else if(input < answer) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			}
		} while(input != answer);
		
		System.out.println("�����Դϴ�.");
		
		// �̸����� �ݺ��� & break - continue��
		// ��ø �ݺ��� ���� �̸��� �ٿ��� �ϳ� �̻��� break
		
		int menu = 0, num = 0;
		Scanner scanner2 = new Scanner(System.in);

		outer:
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0)");
		
			String tmp = scanner2.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if(!(1 <= menu && menu <= 3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
				continue;
			}
			
			for(;;) {
				System.out.println("����� ���� �Է��ϼ���.(��� ����:0, ��ü ����:99)>");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num == 0) { // ��� ����. for���� �����.
					break;
				}
				
				if(num == 99) {
					break outer; // ��ü ����. for���� while�� ��� �����.
				}
				
				switch(menu) {
					case 1:
						System.out.println("result="+num*num);
						break;
					case 2:
						System.out.println("result="+Math.sqrt(num));
						break;
					case 3:
						System.out.println("result="+Math.log(num));
						break;
				}
			} // for(;;)
		} // while
	}
}
