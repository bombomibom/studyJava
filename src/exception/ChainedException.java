package exception;

public class ChainedException {
	public static void main(String[] args) {
		// 연결된 예외
		// 예외 A가 예외 B를 발생시켰다면, A를 B의 '원인 예외(cause exception)'라 함
		// 목적1: 원인 예외로 등록 후 다시 예외 발생시키는 이유: 여러가지 예외를 하나의 큰 분류로 묶어 다루기 위함
		// 목적2: checked예외를 unchecked예외로 바꿀 수 있도록 하기 위해서 -> unchecked로 바꾸면 예외처리가 선택적이 되므로 억지로 예외처리 안 해도 됨
		
		// 참고로 initCause()는 Exception클래스 조상인 Throwable클래스에 정의되어있음
		// - Throwable initCause(Throwable cause) -> 지정한 예외를 원인 예외로 등록
		// - Throwable getCause() -> 원인 예외 반환
		
		try {
			install();
		} catch(InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // main 끝
	
	static void install() throws InstallException {
		try {
			startInstall(); // SpaceException2 발생
			copyFiles();
		} catch (SpaceException2 e) {
			InstallException ie = new InstallException("설치 중 예외발생"); // 예외 생성
			ie.initCause(e); // InstallException의 원인 예외를 SpaceException2로 등록
			throw ie; // InstallException을 발생시켜 예외 던짐
		} catch (MemoryException2 me) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();
		} // try 끝
	}
	
	static void startInstall() throws SpaceException2, MemoryException2 {
		if(!enoughSpace()) {
			throw new SpaceException2("설치할 공간이 부족합니다.");
		}
		
		if(!enoughMemory()) {
			throw new MemoryException2("메모리가 부족합니다.");
		}
	} // startInstall 끝
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return true;
	}
} // ChainedException 끝

class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}

class SpaceException2 extends Exception {
	SpaceException2(String msg) {
		super(msg);
	}
}

class MemoryException2 extends Exception {
	MemoryException2(String msg) {
		super(msg);
	}
}