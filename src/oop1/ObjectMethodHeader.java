package oop1;

public class ObjectMethodHeader {
	public static void main(String[] args) {
		// ����� �Ű�����
		Data d = new Data();
		d.x = 100;
		System.out.println("main() : x = " + d.x);
		
		change(d.x); // �⺻�� �Ű�����. ������ ���� �б⸸ �� �� ����
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		
		change(d); // ������ �Ű�����. ������ ���� �а� ������ �� ����. ���� ����� �ּҸ� �Ѱ��־��⿡ ���浵 ������ ��!
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);

		// ����� ��ȯŸ��
		Data d2 = new Data();
		d2.x = 10; 
		Data d3 = copy(d2); // ������ ��ȯŸ��
		System.out.println("d3.x = " + d3.x);
	}

	static void change(int x) { // �⺻�� �Ű�����. ���� d.x�� �ƹ��� ���� x
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
	static void change(Data d) { // ������ �Ű�����. ���� d.x�� ���� ��
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
	 
	static Data copy(Data d) { // ������ ��ȯŸ��
		Data tmp = new Data();
		tmp.x = d.x;
		return tmp;
	}
}

class Data { int x; }
