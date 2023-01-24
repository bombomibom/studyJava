package example;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int score[] = {42,15,33,27,50};	

		// �ִ밪�� �ּҰ�
		// ������ �ƴ� �ϳ��� ���� �������� �Ǵϱ� ù ��° �ε����� �����ϰ� �ϳ��� ���ϴ� ������ ����
		int max = score[0];
		int min = score[0];
		
		int i = 0;
		while(i < score.length) {
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
			i++;
		}
		
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּҰ�: " + min);
		
		// ����(Shuffle)	
		for(int u = 0; u < score.length; u++) {
			int ranNum = (int)(Math.random() * score.length); // ���⼱ �ε��� ���ڸ� �������°Ŵ� + 1 �ϸ� �� ��!
			System.out.println(ranNum);
			int tmp = score[u];
			score[ranNum] = tmp;
			score[u] = score[ranNum];
			System.out.println(Arrays.toString(score));
		}
		
		// �ζǹ�ȣ �����
		int[] ball = new int[45];
		
		int m = 0;
		while(m < ball.length) {
			ball[m] = m+1;
			m++;
		}
		System.out.println(Arrays.toString(ball)); // 1 ~ 45 ���� �ֱ�
		
		int z = 0, changeNum = 0, tmp = 0;
		while(z < ball.length) {
			changeNum = (int)(Math.random() * 45);
			tmp = ball[z];
			ball[z] = ball[changeNum];
			ball[changeNum] = tmp;
			z++;
		}
		System.out.println(Arrays.toString(ball)); // ����
		
		int z2 = 0;
		while(z2 < 6) {
			System.out.printf("ball[%d]=%d%n", z2, ball[z2]); // 6�� ���� ��������
			z2++;
		}
	}
}
