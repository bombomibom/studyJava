package exception;

public class ExceptionReThrowing {
	public static void main(String[] args) {
		// 예외 되던지기
		// 예외가 발생한 메서드에 try-catch 이후, 호출한 곳에 throws 후 다시 예외 발생시키기
		// 하나의 예외에 대해서 예외가 발생한 메서드와 이를 호출한 메서드 양쪽 모두에서 처리해줘야 할 작업이 있을 때 사용
		
		// 반환값이 있는 return문의 경우, catch블럭에도 return문이 있어야 함
		// 예외가 발생했을 경우에도 값을 반환해야 하기 때문
		
		try {
			// method1();
			int result = method2();
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("main메서드에서 예외 처리되었습니다.");
		}
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			throw e;
		}
	}
	
	static int method2() {
		try {
			System.out.println("method2가 호출되었습니다.");
			throw new Exception();
			//return 0; // 현재 실행 중인 메서드 종료
		} catch (Exception e) {
			e.printStackTrace();
			return 1; // catch블럭 내에도 return문 필요
		} finally {
			System.out.println("method2의 finally 블럭이 실행되었습니다.");
		}
	}
}
