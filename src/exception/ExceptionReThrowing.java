package exception;

public class ExceptionReThrowing {
	public static void main(String[] args) {
		// ���� �Ǵ�����
		// ���ܰ� �߻��� �޼��忡 try-catch ����, ȣ���� ���� throws �� �ٽ� ���� �߻���Ű��
		// �ϳ��� ���ܿ� ���ؼ� ���ܰ� �߻��� �޼���� �̸� ȣ���� �޼��� ���� ��ο��� ó������� �� �۾��� ���� �� ���
		
		// ��ȯ���� �ִ� return���� ���, catch������ return���� �־�� ��
		// ���ܰ� �߻����� ��쿡�� ���� ��ȯ�ؾ� �ϱ� ����
		
		try {
			// method1();
			int result = method2();
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("main�޼��忡�� ���� ó���Ǿ����ϴ�.");
		}
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
			throw e;
		}
	}
	
	static int method2() {
		try {
			System.out.println("method2�� ȣ��Ǿ����ϴ�.");
			throw new Exception();
			//return 0; // ���� ���� ���� �޼��� ����
		} catch (Exception e) {
			e.printStackTrace();
			return 1; // catch�� ������ return�� �ʿ�
		} finally {
			System.out.println("method2�� finally ���� ����Ǿ����ϴ�.");
		}
	}
}
