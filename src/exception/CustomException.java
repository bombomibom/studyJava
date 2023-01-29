package exception;

public class CustomException {
	public static void main(String[] args) {
		// 사용자 정의 예외 만들기
		// 보통 Exception클래스 또는 RuntimeException클래스로부터 상속받는 클래스 생성
		// 예외처리를 선택적으로 할 수 있도록 RuntimeException을 상속받아 작성하는 쪽으로 바뀌어 가고 있음
		
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("에러 메시지: " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보 후 다시 설치하시기 바랍니다.");
		} catch (MemoryException me) {
			System.out.println("에러 메시지: " + me.getMessage());
			me.printStackTrace();
			System.gc(); // Garbage Collection을 수행하여 메모리를 늘려준다
			System.out.println("설치를 다시 시도하세요.");
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("설치할 공간이 부족합니다.");
		if(!enoughMemory())
			throw new MemoryException("메모리가 부족합니다.");
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return true;
	}
}

class MyException extends Exception {
	// 에러 코드 값을 저장하기 위한 필드를 추가함
	private final int ERR_CODE; // 생성자를 통해 초기화
	
	MyException(String msg, int errCode){ // 생성자
		super(msg); // 조상클래스에 이미 있으니 거기에서 저장
		ERR_CODE = errCode;
	}
	
	MyException(String msg){ // 생성자
		this(msg, 100); // 여기서 입력받아서 위 생성자로 보냄. 기본 ERR_CODE는 100으로 초기화
	}

	public int getErrCode() {
		return ERR_CODE;
	}
}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}