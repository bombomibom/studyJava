package basic;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		// �迭
		// �迭 �ε���: 0���� �迭����-1����
		// �迭 ����: ������.length
		
		// �迭 ����� ����
		int[] score; // ����(�迭�� �ٷ�� ���� �������� ����)
		score = new int[5]; // ����(���� ��������� ����)

		int[] score2 = new int[5]; // �� �ٷ� ����� ����
	
		// �迭 �ʱ�ȭ
		int[] score3 = {1,2,3,4,5}; // new int[] ���� ���� {} �ȿ��� ���� �ڵ� �����Ǳ⿡
		int[] score4;
		score4 = new int[] {1,2,3,4,5}; // ����� ���� ���� �� ���� new int[] ���� �Ұ�
		
		// �迭 ���
		System.out.println(score4); // ���ڿ� �������� �������� ����� �� -> 'Ÿ��@�ּ�' �������� ��� 
		System.out.println(Arrays.toString(score4)); 
		for(int i = 0; i < score4.length; i++) {
			System.out.println(score4[i]); // �� ���� ���
		}
		
		// ���� - charŸ���� ���, ���ڿ� �������� �ٷ� ��� ����. println �޼��尡 char �迭�� ���� �̷��� ���۵ǵ��� �ۼ��Ǿ��⿡!
		char[] chArr = {'a', 'b', 'c'};
		System.out.println(chArr);
		
		// 2���� �迭
		int[][] arr = {
				{1,2,3},
				{4,5,6}
		};
	}
	
}
