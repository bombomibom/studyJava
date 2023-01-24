package basic;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		// 조건문: switch
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("현재의 계절은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
			default:
				System.out.println("조건에 없으면 default로 옵니다.");
		}
	}
}
