package basic;

public class Operator {
	public static void main(String[] args) {
		
		// 연산자(operator): 연산을 수행하는 기호 ex) +,- 
		// 피연산자(operand): 연산의 대상
	
		// 산술연산자: +,-,*,/,%
		// 비교연산자: >,<,>=,<=,==,!=
		// 논리연산자: &&,||,!
		// 대입연산자: =
		// 증감연산자: ++,--
		// 기타(형변환, 삼항, instanceof): (type),?:,instanceof
		
		// 나머지 연산 예제
		for(int i = 0; i < 10; i++) {
			if(i%2==0)
				System.out.println(i); // 2의 배수
			else if(i%3==0)
				System.out.println(i); // 3의 배수
		}
		
		// 문자열 비교: equals()
		String str = "abc";
		boolean result = str.equals("abc");
		boolean resultStr = str.equalsIgnoreCase("abC"); // 대소문자 무시
		System.out.println(resultStr);
		
		// 대소문자 비교
		
		// 삼항연산자
		int x = 10;
		int y = 20;
		String result2;
		
		result2 = (x < y) ? "true" : "false" ; // 조건식 ? 식1 : 식2
		
	}
}
