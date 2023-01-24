package example;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int score[] = {42,15,33,27,50};	

		// 최대값과 최소값
		// 정렬이 아닌 하나의 값만 가져오면 되니까 첫 번째 인덱스로 고정하고 하나씩 비교하는 식으로 진행
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
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		// 섞기(Shuffle)	
		for(int u = 0; u < score.length; u++) {
			int ranNum = (int)(Math.random() * score.length); // 여기선 인덱스 숫자를 가져오는거니 + 1 하면 안 됨!
			System.out.println(ranNum);
			int tmp = score[u];
			score[ranNum] = tmp;
			score[u] = score[ranNum];
			System.out.println(Arrays.toString(score));
		}
		
		// 로또번호 만들기
		int[] ball = new int[45];
		
		int m = 0;
		while(m < ball.length) {
			ball[m] = m+1;
			m++;
		}
		System.out.println(Arrays.toString(ball)); // 1 ~ 45 숫자 넣기
		
		int z = 0, changeNum = 0, tmp = 0;
		while(z < ball.length) {
			changeNum = (int)(Math.random() * 45);
			tmp = ball[z];
			ball[z] = ball[changeNum];
			ball[changeNum] = tmp;
			z++;
		}
		System.out.println(Arrays.toString(ball)); // 셔플
		
		int z2 = 0;
		while(z2 < 6) {
			System.out.printf("ball[%d]=%d%n", z2, ball[z2]); // 6개 숫자 가져오기
			z2++;
		}
	}
}
