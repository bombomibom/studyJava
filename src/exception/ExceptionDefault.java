package exception;

public class ExceptionDefault {
	public static void main(String[] args) {
		// 예외
		
		// 프로그램 오류
		// 프로그램이 실행 중 오작동 또는 비정상 종료되는 경우
		
		// 발생시점에 따른 프로그램 오류
		// 컴파일 에러: 컴파일 시 발생하는 에러 
		// 런타임 에러: 프로그램 실행도중 발생하는 에러
		// 논리적 에러: 컴파일도 잘되고 실행도 잘되지만 의도와 다르게 동작하는 경우 예) 비행기 총 맞아도 안 죽는 등
		
		// 자바 런타임 오류
		// 에러: 수습 불가 심각 오류
		// 예외: 프로그램 코드에 의해 수습 가능 다소 미약한 오류
		
		// 예외 클래스의 계층구조
		// 모든 클래스 조상은 Object이기에 Exception, Error 클래스 역시 Object의 자손클래스
		// Object - Throwable - Exception, Error
		// 1. Exception클래스들: 사용자 실수와 같은 외적인 요인에 의해 발생하는 예외(checked예외)
		//    - IOException, ClassNotFoundException, RuntimeException...
		//      예) 존재않는 파일 입력(FileNotFound), 클래스 이름 잘못 적기(ClassNotFound), 입력 데이터 형식 잘못됨(DataFormat) 
		// 2. RuntimeException클래스들: 프로그래머의 실수로 발생하는 예외(unchecked예외)
		//    - ArithmeticException, ClassCastException, NullPointerException, IndexOutOfBoundsException...
		//      예) 배열 범위 벗어남(ArrayIndexOutOfBounds), 값이 null인 참조변수 멤버 호출(NullPointer), 클래스간 형변환 실수(ClassCast), 정수를 0으로 나누려고 했을 때(Arithmetic)
	}
}
