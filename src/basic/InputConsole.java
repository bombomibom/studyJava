package basic;

import java.util.Scanner;

public class InputConsole {
	public static void main(String[] args) {
		
		// print
		System.out.println("print(): 줄바꿈 안 됨");
		System.out.println("println(): 줄바꿈 됨");
		System.out.println("printf(specifier, 지시자): 여러 형식으로 변환해 출력시 사용"); 
		
		int age = 14;
		int year = 2014; 
		String url = "www.naver.com";
		System.out.printf("%nage:%d%nyear:%d%n", age, year); // %d(10진수), %n(줄바꿈), %x(16진수), %f(소수점), %c(문자), %s(문자열)
		System.out.printf("[%20s]%n", url); // 최소 20글자 출력공간 확보(우측정렬)
		System.out.printf("[%-20s]%n", url); // 최소 20글자 출력공간 확보(좌측정렬)
		System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만 출력
		
		// Scanner
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine(); // 입력 후 엔터 누르면 문자열로 반환
		int input2 = scanner.nextInt(); // 또는 float 등 있으나 string으로 받고 변환하는 식이 좋다
		System.out.println(input1);
		
	}
}
