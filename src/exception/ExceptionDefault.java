package exception;

public class ExceptionDefault {
	public static void main(String[] args) {
		// ����
		
		// ���α׷� ����
		// ���α׷��� ���� �� ���۵� �Ǵ� ������ ����Ǵ� ���
		
		// �߻������� ���� ���α׷� ����
		// ������ ����: ������ �� �߻��ϴ� ���� 
		// ��Ÿ�� ����: ���α׷� ���൵�� �߻��ϴ� ����
		// ���� ����: �����ϵ� �ߵǰ� ���൵ �ߵ����� �ǵ��� �ٸ��� �����ϴ� ��� ��) ����� �� �¾Ƶ� �� �״� ��
		
		// �ڹ� ��Ÿ�� ����
		// ����: ���� �Ұ� �ɰ� ����
		// ����: ���α׷� �ڵ忡 ���� ���� ���� �ټ� �̾��� ����
		
		// ���� Ŭ������ ��������
		// ��� Ŭ���� ������ Object�̱⿡ Exception, Error Ŭ���� ���� Object�� �ڼ�Ŭ����
		// Object - Throwable - Exception, Error
		// 1. ExceptionŬ������: ����� �Ǽ��� ���� ������ ���ο� ���� �߻��ϴ� ����(checked����)
		//    - IOException, ClassNotFoundException, RuntimeException...
		//      ��) ����ʴ� ���� �Է�(FileNotFound), Ŭ���� �̸� �߸� ����(ClassNotFound), �Է� ������ ���� �߸���(DataFormat) 
		// 2. RuntimeExceptionŬ������: ���α׷����� �Ǽ��� �߻��ϴ� ����(unchecked����)
		//    - ArithmeticException, ClassCastException, NullPointerException, IndexOutOfBoundsException...
		//      ��) �迭 ���� ���(ArrayIndexOutOfBounds), ���� null�� �������� ��� ȣ��(NullPointer), Ŭ������ ����ȯ �Ǽ�(ClassCast), ������ 0���� �������� ���� ��(Arithmetic)
	}
}
