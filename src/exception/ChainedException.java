package exception;

public class ChainedException {
	public static void main(String[] args) {
		// ����� ����
		// ���� A�� ���� B�� �߻����״ٸ�, A�� B�� '���� ����(cause exception)'�� ��
		// ����1: ���� ���ܷ� ��� �� �ٽ� ���� �߻���Ű�� ����: �������� ���ܸ� �ϳ��� ū �з��� ���� �ٷ�� ����
		// ����2: checked���ܸ� unchecked���ܷ� �ٲ� �� �ֵ��� �ϱ� ���ؼ� -> unchecked�� �ٲٸ� ����ó���� �������� �ǹǷ� ������ ����ó�� �� �ص� ��
		
		// ����� initCause()�� ExceptionŬ���� ������ ThrowableŬ������ ���ǵǾ�����
		// - Throwable initCause(Throwable cause) -> ������ ���ܸ� ���� ���ܷ� ���
		// - Throwable getCause() -> ���� ���� ��ȯ
		
		try {
			install();
		} catch(InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // main ��
	
	static void install() throws InstallException {
		try {
			startInstall(); // SpaceException2 �߻�
			copyFiles();
		} catch (SpaceException2 e) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�"); // ���� ����
			ie.initCause(e); // InstallException�� ���� ���ܸ� SpaceException2�� ���
			throw ie; // InstallException�� �߻����� ���� ����
		} catch (MemoryException2 me) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();
		} // try ��
	}
	
	static void startInstall() throws SpaceException2, MemoryException2 {
		if(!enoughSpace()) {
			throw new SpaceException2("��ġ�� ������ �����մϴ�.");
		}
		
		if(!enoughMemory()) {
			throw new MemoryException2("�޸𸮰� �����մϴ�.");
		}
	} // startInstall ��
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return true;
	}
} // ChainedException ��

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