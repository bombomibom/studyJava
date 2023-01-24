package example;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		// 5명의 학생 세 과목 총점 및 평균 계산
		int[][] score = {
				{60, 76, 90},
				{30, 34, 100},
				{20, 55, 84},
				{30, 77, 90},
				{28, 50, 99}
		};
		
		int korTot = 0, engTot = 0, mathTot = 0;
		int korIdx = 0, engIdx = 1, mathIdx = 2;
		
		System.out.println("번호  국어  영어  수학  총점  평균 ");
		System.out.println("============================");
		
		for(int i = 0; i < score.length; i++) {
			int sum = 0; // 초기화를 위해 안에 선언
			double avg = 0.0; 

			korTot += score[i][korIdx];
			engTot += score[i][engIdx];
			mathTot += score[i][mathIdx];
			System.out.printf("%2d", i+1); // 번호
			
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]); // 개인별 각 점수
			}

			avg = sum/(double)score[i].length;
			System.out.printf("%5d %5.1f%n", sum, avg); // 개인별 총점 및 평균
			
		}
		
		System.out.println("============================");
		System.out.printf("총점:%4d %4d %4d", korTot, engTot, mathTot);
	}
}
