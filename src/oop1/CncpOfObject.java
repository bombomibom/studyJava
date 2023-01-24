package oop1;

public class CncpOfObject {
	public static void main(String[] args) {
		// ��ü���� ���
		// ���뼺 ����, �������� ����, �ŷڼ� ����(�����ڿ� �޼��� �̿� ������ ��ȣ)
		
		// Ŭ������ ��ü
		// Ŭ������ ���� ��ü�� �����ϴµ� ���� ��, ��ü �� ��ü�� �ƴ�
		
		// ��ü �������
		// �Ӽ�(�������), ���(�޼���)
		// ��ü�� ���� �Ӽ��� ����� ��ü�� ���(������, member)�� ��
	
		// ��ü�� �ν��Ͻ�
		// �ν��Ͻ�ȭ: Ŭ�����κ��� ��ü�� ����� ����
		// �ν��Ͻ�: � Ŭ�����κ��� ������� ��ü. �� Ŭ������ �ν��Ͻ��� ��. �� Ŭ������ ���� �ν��Ͻ� ���� ����
		// �л��� ��ü��. �л��� �л� Ŭ������ �ν��Ͻ���.
		
		// ��ü ������ ���
		Tv tv = new Tv();
		tv.channel = 7;
		tv.channelUp();
		System.out.println("���� ä���� " + tv.channel + "�Դϴ�.");
		
		// ��ü�迭
		Tv[] tvArr = new Tv[2]; // �������� �迭(��ü �迭)�� ����. ������ ���� ��!
		tvArr[0] = new Tv(); // ���� ��ü ����!
		tvArr[1] = new Tv();
		
		Tv[] tvArr2 = { new Tv(), new Tv()}; // �� �ٷ� �迭 ���� �� ��ü ���� ����
		
		Tv[] tvArr3 = new Tv[100];
		for(int i = 0; i < tvArr3.length; i++) {
			tvArr3[i] = new Tv(); // ���� ���� �� for������ ó��
		}
	}
}

class Tv {
	// Tv�� �Ӽ�(�������)
	boolean power;
	int channel;
	
	// Tv�� ���(�޼���)
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}