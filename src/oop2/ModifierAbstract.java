package oop2;

public class ModifierAbstract {
	public static void main(String[] args) {
		// �߻�
		// ����� ������ �̾� �̸� �Ϲ����� �������� �ľ��ϴ� ���� �ۿ�
		// �߻�ȭ: ���� Ŭ������ ����κ��� �̾Ƽ� ���� Ŭ������ ����� ��(�Ʒ� ���� ����)
		// ��Ӱ������� ���������� ��üȭ(����ȭ), �ö󰥼��� �߻�ȭ(������)
		
		// �߻�Ŭ����
		// �̿ϼ� ���赵. �̿ϼ� �޼���(�߻� �޼���)�� �����ϰ� �ִ� Ŭ����
		// �߻�Ŭ������ �ν��Ͻ� ���� �Ұ�. ����� ���� �ڼ�Ŭ������ ���ؼ��� �ϼ�
		// Ű���� abstract �ٿ��� ���
		// ����: ������� Ʋ�� ������� �����ϱ� ����
		
		// �߻�޼���
		// ����θ� �ۼ��ϰ� �����δ� �ۼ� �� �� + �ּ����� � ����� ������ �������� �ۼ��Ǿ����� �˸�
		// ����: �޼��� ����ϴ� �ʿ��� �����(����Ÿ��, �޼����̸�, �Ű�����)�� �˾Ƶ� �ڵ� �ۼ� �����ϰ�, Ŭ������ ���� ������ �޸� �� �� �־ �߻�޼���� ���
		
		Unit[] group = { new Marine(), new Tank() };
		for(int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}
	}
}

abstract class Player {
	abstract void play(int pos); // �߻�޼���
	abstract void stop();
}

class AudioPlayer extends Player {
	void play(int pos) { /* */ }; // �߻�޼��� ����
	void stop() { /* */ }
}

abstract class AbstractPlayer extends Player { // ������ �߻�޼��� �� �ϳ��� �������� �ʴ´ٸ�, �ڼ�Ŭ���� ���� �߻�Ŭ������ ����
	void play(int pos) {}
}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y); // move �������� ���⿡. �ٸ� ������, ������ ���� ������ �ֱ⿡ �߻�Ŭ������
	void stop() { /* ���� ��ġ�� ���� */ }
}

class Marine extends Unit { // ����
	void move(int x, int y) { /* ������ ��ġ�� �̵� */}
	void stimPack() { /* ������ ��� */ }
}

class Tank extends Unit { // ��ũ
	void move(int x, int y) { /* ������ ��ġ�� �̵� */ }
	void changeMode() { /* ���ݸ��� ��ȯ */ }
}

