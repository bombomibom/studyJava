package exception;

import java.io.File;

public class ExceptionHandling {
	public static void main(String[] args) throws Exception {
		// ���� ó��
		// try, catch
		// ���α׷� ������ ���� ���� ����
		// ó������ ���� ����(uncaught exception)�� JVM�� '����ó����(UncaughtExceptionHandler)'�� �޾� ���� ������ ȭ�鿡 ���
		// try ������ ���� �߻� -> ��ġ�ϴ� catch �� ã��(�� ã���� ���� ó�� �� ��)

		// ���� ó�� ����
		// printStackTrace(), getMessage()
		// - printStackTrace: ���ܹ߻� ����� ȣ�⽺��(call stack)�� �־��� �޼��� ������ ���� �޽����� ȭ�鿡 ���
		// - getMessage: �߻��� ����Ŭ������ �ν��Ͻ��� ����� �޽����� ���� �� ����
		
		try {
			// System.out.println(0/0);
			System.out.println("������ �ַ����� ���� �� ��");
		} catch (ArithmeticException ae) {
			System.out.println("error!");
			ae.printStackTrace(); // �������� ae�� ����, ������ ArithmeticException�ν��Ͻ� ���� ����
			System.out.println("���ܸ޽���: " + ae.getMessage());
		} catch (Exception e) { // ��� Ŭ���� Exception�� �ڼ��̹Ƿ� � ���� ���� �߻��ص� ���⼭ �ɷ��� �� ����
			System.out.println("");
		}
		System.out.println("end");

		// ��Ƽ catch
		// ����-�ڼ� ���谡 �ƴ� ���(����-�ڼ��� ����Ŭ������ ���ִ� �Ͱ� ���⿡) '|' ��ȣ�� catch �� ���� ��� ����
		// �ٸ� ���� ���ܸ� ���� ���⿡ catch �� �� � ���� �߻��ߴ��� �˱� �����
		// try {
		//	
		// } catch(ExceptionA | ExceptionB) {
		//	
		// }
		
		// ���� �߻���Ű��
		// throw 
		try {
			Exception e = new Exception("���� �߻�"); // ���⿡ ���� String getMessage�� ��������
			// throw e; // ���� �߻���Ŵ
			// throw new Exception("");
		} catch (Exception e) {
			System.out.println("�����޽���: " + e.getMessage());
			e.printStackTrace();
		}
		
		// �޼��忡 ���� ����
		// throws: �޼ҵ� ���� throws ����
		// �޼��忡 ���� �����ϸ�, �� ���� �Ӹ��ƴ϶� �ڼ�Ÿ���� ���ܱ��� �߻��� �� ����
		// method1() ����� ���� �߻� 
		// �ؼ����ڸ� ���ܰ� �߻����� ��, ��� 3���� �޼���(main, method1, method2)�� ȣ�⽺�ÿ� �־�����,
		// ���ܰ� �߻��� ���� ���� ���ٿ� �ִ� method2��� ��. main�޼��尡 method1��, �׸��� method1�� method2�� ȣ���ߴٴ� ���� �� �� ����
		// �� throws�� �ѱ�⸸ �ϰ� try catch�� ����ó���� �� ���༭ ������ ����
		method1(); // ���� Ŭ���� ���� static����̹Ƿ� ��ü�������� ���� ȣ�Ⱑ��
		
		// finally
		// ���� �߻����ο� ������� ����Ǿ���� �ڵ� ���Խ�ų �������� ���
		// try �ȿ� return �־ finally���� �����
		// �Ʒ�ó�� try���� catch���� �����ϴ� ���� finally���� ó��
		try {
			// startInstall();
			// copyFiles();
			// deleteTempFiles(); -> �����
		} catch (Exception e) {
			// e.printStackTrace();
			// deleteTempFiles(); -> �����
		} finally {
			// deleteTempFiles(); --> ���⿡ �������� ���
		}
	}
	
	static void method1() throws Exception { // ,(�޸�) �� ���� �� ����
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
			System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " �ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
		}
	}
	
	static File createFile(String fileName) throws Exception {
		if(fileName == null || fileName.equals(""))
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}
}