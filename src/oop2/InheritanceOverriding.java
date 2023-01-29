package oop2;

public class InheritanceOverriding {
	public static void main(String[] args) {
		// �������̵�
		// ���� ��� ����Ŭ������ Print�� ����ϴ� ������� �ڼ�Ŭ������ Print3D������ getLocation()�� ���� ��ǥ�� ���� ���̶� ���
		// �̷� ���� ���ο� �޼��带 �����ϴ� �ͺ��� �� ������ �켱���Ͽ� ����� ���� �� �ٸ� ����
	
		// �������̵� ����
		// ����Ŭ�������� ���� ����� �γ��ϰ�, ���� ó���� ����
		// 1. ����δ� ����Ŭ������ �޼���� ��ġ
		// 2. ���� �����ڸ� ����Ŭ������ �޼��庸�� ���� ������ ���� �Ұ� -> ����Ŭ���� �޼��� protected��� �ڼ�Ŭ���� �޼���� protected or public
		// 3. ���ܴ� ����Ŭ������ �޼��庸�� ���� ���� �Ұ� -> ���� throws IOException, SQLException��� �ڼ�Ŭ���� throws SQLException �̷���
		
		// �����ε� vs �������̵�
		// �����ε�: ������ ���� ���ο� �޼��� �����ϴ� ��. �޼������ ������ �Ű������� �ٸ�..
		// �������̵�: ��ӹ��� �޼����� ������ �����ϴ� ��
		
		Point3D p3d = new Point3D();
		String result = p3d.getLocation();
		System.out.println(result);
	}
}

class Point {
	int x;
	int y;
	
	String getLocation() {
		return "x: " + x + "y: " + y;
	}
}

class Point3D extends Point {
	int z;
	
	String getLocation() {
		return "x: " + super.x + " y: " + super.y + " z: " + this.z;
	}
}
