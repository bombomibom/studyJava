package exception;

import java.io.File;

public class ExceptionHandling {
	public static void main(String[] args) throws Exception {
		// 예외 처리
		// try, catch
		// 프로그램 비정상 종료 막기 위함
		// 처리되지 못한 예외(uncaught exception)는 JVM의 '예외처리기(UncaughtExceptionHandler)'가 받아 예외 원인을 화면에 출력
		// try 블럭에서 예외 발생 -> 일치하는 catch 블럭 찾기(못 찾으면 예외 처리 안 됨)

		// 예외 처리 정보
		// printStackTrace(), getMessage()
		// - printStackTrace: 예외발생 당시의 호출스택(call stack)에 있었던 메서드 정보와 예외 메시지를 화면에 출력
		// - getMessage: 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있음
		
		try {
			// System.out.println(0/0);
			System.out.println("위에서 애러떠서 실행 안 됨");
		} catch (ArithmeticException ae) {
			System.out.println("error!");
			ae.printStackTrace(); // 참조변수 ae를 통해, 생성된 ArithmeticException인스턴스 접근 가능
			System.out.println("예외메시지: " + ae.getMessage());
		} catch (Exception e) { // 모든 클래스 Exception의 자손이므로 어떤 종류 예외 발생해도 여기서 걸러질 수 있음
			System.out.println("");
		}
		System.out.println("end");

		// 멀티 catch
		// 조상-자손 관계가 아닌 경우(조상-자손은 조상클래스만 써주는 것과 같기에) '|' 기호로 catch 블럭 같이 사용 가능
		// 다만 여러 예외를 같이 쓰기에 catch 블럭 내 어떤 예외 발생했는지 알기 어려움
		// try {
		//	
		// } catch(ExceptionA | ExceptionB) {
		//	
		// }
		
		// 예외 발생시키기
		// throw 
		try {
			Exception e = new Exception("고의 발생"); // 여기에 넣은 String getMessage로 가져오기
			// throw e; // 예외 발생시킴
			// throw new Exception("");
		} catch (Exception e) {
			System.out.println("에러메시지: " + e.getMessage());
			e.printStackTrace();
		}
		
		// 메서드에 예외 선언
		// throws: 메소드 옆에 throws 선언
		// 메서드에 예외 선언하면, 이 예외 뿐만아니라 자손타입의 예외까지 발생할 수 있음
		// method1() 실행시 예외 발생 
		// 해석하자면 예외가 발생했을 때, 모두 3개의 메서드(main, method1, method2)가 호출스택에 있었으며,
		// 예외가 발생한 곳은 제일 윗줄에 있는 method2라는 것. main메서드가 method1을, 그리고 method1이 method2를 호출했다는 것을 알 수 있음
		// 다 throws로 넘기기만 하고 try catch로 예외처리를 안 해줘서 비정상 종료
		method1(); // 같은 클래스 내의 static멤버이므로 객체생성없이 직접 호출가능
		
		// finally
		// 예외 발생여부와 상관없이 실행되어야할 코드 포함시킬 목적으로 사용
		// try 안에 return 있어도 finally블럭은 실행됨
		// 아래처럼 try에도 catch에도 들어가야하는 내용 finally에서 처리
		try {
			// startInstall();
			// copyFiles();
			// deleteTempFiles(); -> 지우기
		} catch (Exception e) {
			// e.printStackTrace();
			// deleteTempFiles(); -> 지우기
		} finally {
			// deleteTempFiles(); --> 여기에 공통으로 사용
		}
	}
	
	static void method1() throws Exception { // ,(콤마) 후 여러 개 가능
		method2();
	}
	
	static void method2() throws Exception {
		// throw new Exception();
	}
}

class ExceptionExample {
	public static void main(String[] args) {
		try {
			File f = createFile("");
			System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
		}
	}
	
	static File createFile(String fileName) throws Exception {
		if(fileName == null || fileName.equals(""))
			throw new Exception("파일이름이 유효하지 않습니다.");
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}
}