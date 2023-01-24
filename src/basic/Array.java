package basic;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		// 배열
		// 배열 인덱스: 0부터 배열길이-1까지
		// 배열 길이: 변수명.length
		
		// 배열 선언과 생성
		int[] score; // 선언(배열을 다루기 위한 참조변수 선언)
		score = new int[5]; // 생성(실제 저장공간을 생성)

		int[] score2 = new int[5]; // 한 줄로 선언과 생성
	
		// 배열 초기화
		int[] score3 = {1,2,3,4,5}; // new int[] 생략 가능 {} 안에서 길이 자동 결정되기에
		int[] score4;
		score4 = new int[] {1,2,3,4,5}; // 선언과 생성 따로 할 때는 new int[] 생략 불가
		
		// 배열 출력
		System.out.println(score4); // 문자열 변형없이 참조변수 출력할 때 -> '타입@주소' 형식으로 출력 
		System.out.println(Arrays.toString(score4)); 
		for(int i = 0; i < score4.length; i++) {
			System.out.println(score4[i]); // 한 개씩 출력
		}
		
		// 예외 - char타입의 경우, 문자열 변형없이 바로 출력 가능. println 메서드가 char 배열일 때만 이렇게 동작되도록 작성되었기에!
		char[] chArr = {'a', 'b', 'c'};
		System.out.println(chArr);
		
		// 2차원 배열
		int[][] arr = {
				{1,2,3},
				{4,5,6}
		};
	}
	
}
