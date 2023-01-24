package example;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		// 5���� �л� �� ���� ���� �� ��� ���
		int[][] score = {
				{60, 76, 90},
				{30, 34, 100},
				{20, 55, 84},
				{30, 77, 90},
				{28, 50, 99}
		};
		
		int korTot = 0, engTot = 0, mathTot = 0;
		int korIdx = 0, engIdx = 1, mathIdx = 2;
		
		System.out.println("��ȣ  ����  ����  ����  ����  ��� ");
		System.out.println("============================");
		
		for(int i = 0; i < score.length; i++) {
			int sum = 0; // �ʱ�ȭ�� ���� �ȿ� ����
			double avg = 0.0; 

			korTot += score[i][korIdx];
			engTot += score[i][engIdx];
			mathTot += score[i][mathIdx];
			System.out.printf("%2d", i+1); // ��ȣ
			
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]); // ���κ� �� ����
			}

			avg = sum/(double)score[i].length;
			System.out.printf("%5d %5.1f%n", sum, avg); // ���κ� ���� �� ���
			
		}
		
		System.out.println("============================");
		System.out.printf("����:%4d %4d %4d", korTot, engTot, mathTot);
	}
}
