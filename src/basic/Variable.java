package basic;

public class Variable {
	public static void main(String[] args) {

		// 자료형 종류: 기본형(primitive type), 참조형(reference type)
		// 기본형: boolean, char, byte, short, int, long, float, double 
		// 참조형: 기본형 외 객체의 주소를 값으로 갖는 변수. 연산 불가
		
		// 변수 선언과 대입
		int x;
		x = 5;

		// 변수 타입
		int a = 100;
		double pi = 3.14;
		char ch = 'a';
		String str = "abc"; // String str = new String("abc"); 와 같음. char배열에 기능(메서드)를 추가한 것

		// 상수(constant)
		final int MAX_SPEED = 10; // 값 변경 불가, final, 대문자, 단어 사이 '_'

		// 리터럴(literal)
		int year = 2014; // 리터럴: 2014. 상수의 다른 이름. 그 자체로 값을 의미
		final int MAX_VALUE = 100; // 리터럴: 100

		// 리터럴 종류
		// 논리형, 정수형, 실수형, 문자형, 문자열
		// 정수형, 실수형: 여러 타입이 있어 접미사 붙여 구분. long 타입 리터럴에 'l', 'L'. 없으면 int 타입 리터럴
		// 2, 8, 10, 16진수 표현된 리터럴 변수 저장시 16진수는 0x, 0X. 8진수는 0
		// 문자형: ''
		// 문자열: ""
		boolean result = false;
		int octNum = 010;
		int hexNum = 0x10;
		long big = 100_000_000_000L;
		float pi2 = 3.14f; // or F
		double rate = 1.65d; // or D
		
		// 정수형 오버플로우
		// 예: 4bit(4자리) 2진수 최대값 1111에 1을 더하면 원래 10000이 되어야 하지만 4bit로 표현 불가해 1을 자르고 0000이 표현됨. 반대로 0000에서 1을 빼면 9999
		// 최대값 + 1 = 최소값. 최소값 - 1 = 최대값 원리
		// 에러는 아니나 원하는 값이 아니니 이러한 오버플로우가 생기지 않게 충분한 크기의 타입을 선택해 사용 
		
		// 변수 값 바꾸기
		// String은 update가 아닌 create 개념으로 변경됨
		int var1 = 10;
		int var2 = 20;
		int tmp;
		
		tmp = var1;
		var1 = var2;
		var2 = tmp;
		
		System.out.println("var1: " + var1);
		
		// 형변환(casting)
		int intVal = 1;
		String strVal1 = "1";
		String strVal2 = "3.14";
		System.out.println((char)intVal); // 문자 변환
		System.out.println(Integer.toString(intVal)); // 문자열 변환
 		System.out.println(Integer.parseInt(strVal1)); // 정수 변환
		System.out.println(Double.parseDouble(strVal2)); // 실수 변환
		
	}
}
