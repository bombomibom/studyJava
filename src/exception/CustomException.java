package exception;

public class CustomException {
	public static void main(String[] args) {
		// ����� ���� ���� �����
		// ���� ExceptionŬ���� �Ǵ� RuntimeExceptionŬ�����κ��� ��ӹ޴� Ŭ���� ����
		// ����ó���� ���������� �� �� �ֵ��� RuntimeException�� ��ӹ޾� �ۼ��ϴ� ������ �ٲ�� ���� ����
		
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("���� �޽���: " + e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ�� �� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.");
		} catch (MemoryException me) {
			System.out.println("���� �޽���: " + me.getMessage());
			me.printStackTrace();
			System.gc(); // Garbage Collection�� �����Ͽ� �޸𸮸� �÷��ش�
			System.out.println("��ġ�� �ٽ� �õ��ϼ���.");
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		if(!enoughMemory())
			throw new MemoryException("�޸𸮰� �����մϴ�.");
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
	// ���� �ڵ� ���� �����ϱ� ���� �ʵ带 �߰���
	private final int ERR_CODE; // �����ڸ� ���� �ʱ�ȭ
	
	MyException(String msg, int errCode){ // ������
		super(msg); // ����Ŭ������ �̹� ������ �ű⿡�� ����
		ERR_CODE = errCode;
	}
	
	MyException(String msg){ // ������
		this(msg, 100); // ���⼭ �Է¹޾Ƽ� �� �����ڷ� ����. �⺻ ERR_CODE�� 100���� �ʱ�ȭ
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