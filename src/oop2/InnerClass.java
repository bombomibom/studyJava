package oop2;

public class InnerClass {
	public static void main(String[] args) {
		// ����Ŭ����
		// Ŭ���� ���� ����� Ŭ����
		// Ŭ������ �ٸ� Ŭ������ �����ϴ� ������ �� Ŭ���� ����� �����̱� ����
		// �ٸ� ����Ŭ������ �ܺο��� �� ������ �ʴ� ���̾�� ��
		
		// ����Ŭ���� ����
		// 1. ���� Ŭ�������� �ܺ� Ŭ������ ������� ���� ������ �� ����
		// 2. �ڵ��� ���⼺ ���� �� ����(�ܺο��� ���ʿ��� Ŭ������ �������ν� ĸ��ȭ)
		
		// ����Ŭ���� ������ Ư¡
		// ����Ŭ���� ������ ������ ������ġ�� ���� ������ ����. ���� ��ȿ����(scope)�� ���ټ�(accessibility)�� ����
		// instance class: �ܺ�Ŭ������ ������� ������ġ�� ����. �ַ� �ܺ�Ŭ������ �ν��Ͻ� ������ ���õ� �۾��� ���� �������� ����
		// static class: �ܺ�Ŭ������ ������� ������ġ�� ����. �ܺ�Ŭ������ static ���, Ư�� static�޼��忡�� ���� �������� ����
		// local class: �ܺ�Ŭ������ �޼��峪 �ʱ�ȭ �� �ȿ� �����ϸ�, ����� ���� ���ο����� ��� ����
		// anonymous class: Ŭ������ ����� ��ü�� ������ ���ÿ� �ϴ� �̸����� Ŭ����(��ȸ��)
	
		// ����Ŭ���� �����ڿ� ���ټ�
		// ��������� ���� ���� ����. �ν��Ͻ� ����� static ��� �� ��Ģ ���� �Ȱ��� ����
		// static ������ static inner class������ ���� ����
	}
}

class Outer { // �ܺ�Ŭ����
	private class InstanceInner { // �ν��Ͻ� ����Ŭ����
		int iv = 100;
		// static int cv = 100; static �Ұ�
		final static int CONST = 100; // final�� ����̹Ƿ� ����
	} 
	protected static class StaticInner { // ����ƽ ����Ŭ����
		int iv = 100;
		static int cv = 100; // static�� static ��� ���� ����
		final static int CONST = 100; // ����� ����
	}
	
	void myMethod() {
		class LocalInner { // ���� ����Ŭ����
			int iv = 100;
			// static int cv = 100; �Ұ�
			final static int CONST = 100; 
		}
		LocalInner lv = new LocalInner();
	}
	
	// �ν��Ͻ���� ������ ���� ���� ���� ����
	InstanceInner iv = new InstanceInner();
	// static ��� ������ ���� ���� ���� ����
	StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		// static����� �ν��Ͻ������ ���� ���� �Ұ�
		// InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
	
		// ���� �����Ϸ��� �Ʒ��� ���� ��ü �����ؾ� ��
		// �ν��Ͻ�Ŭ������ �ܺ� Ŭ������ ���� �����ؾ߸� ������ �� ����
		Outer outer = new Outer();
		// InstanceInner obj1 = outer.new.InstanceInner();
	}
	
	void instanceMethod() {
		// �ν��Ͻ��޼��忡���� �ν��Ͻ������ static��� ��� ���� ����
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		// �޼��� ���� ���������� ����� ���� Ŭ������ �ܺο��� ���� �Ұ�
		// LocalInner lv = new LocalInner();
	}

	public static void main(String args[]) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
