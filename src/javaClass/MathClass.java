package javaClass;

public class MathClass {
	public static void main(String[] args) {
		// Math.random()
		// 0.0 ~ 1.0 사이의 범위에 속하는 하나의 double 값을 반환 
		// step1: Math.random() * 정수: 0.0 ~ 정수 근접 소수점 첫째자리 수 출력
		// step2: +1을 통해 원하는 정수까지 나오게 한 뒤, int형으로 바꿔서 소수점 자르기
		int num = 0;
		for(int i = 0; i < 5; i++) {
			num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
		}
	}
}
