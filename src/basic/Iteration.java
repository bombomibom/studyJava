package basic;

import java.util.Scanner;

public class Iteration {
	public static void main(String[] args) {
		// 반복문
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// for문 while문 비교
		for(int i = 0; i < 5; i++) { // 초기화, 조건식, 증감식
			System.out.println(i);
		}
		
		int i = 0; // 초기화
		while(i < 5) { // 조건식
			System.out.println(i);
			i++; // 증감식
		}
		
		// do - while문
		// while문은 조건식의 결과에 따라 블럭이 한 번도 수행되지 않을 수 있으나, do-while은 최소 한 번은 수행
		// 많이 쓰이진 않으나, 반복적으로 사용자의 입력을 받아 처리할 때 유용
		int input = 0, answer = 0;
		
		answer = 22;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1과 100 사이의 정수를 입력하세요.");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while(input != answer);
		
		System.out.println("정답입니다.");
		
		// 이름붙은 반복문 & break - continue문
		// 중첩 반복문 사용시 이름을 붙여서 하나 이상을 break
		
		int menu = 0, num = 0;
		Scanner scanner2 = new Scanner(System.in);

		outer:
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)");
		
			String tmp = scanner2.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;
			}
			
			for(;;) {
				System.out.println("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99)>");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num == 0) { // 계산 종료. for문을 벗어난다.
					break;
				}
				
				if(num == 99) {
					break outer; // 전체 종료. for문과 while문 모두 벗어난다.
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
