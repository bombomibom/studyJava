package javaClass;

import java.util.Arrays;

public class ArraysClass {
	public static void main(String[] args) {
		int arr1[] = {0,1,2,3,4};
		int arr2[] = {2,3,0,5,1};
		int arr3[][] = {
				{0,1,2},
				{3,4,5}
		};
		int arr4[][] = {
				{0,1,2},
				{3,4,5}
		};
		
		// toString(): 일차원 배열 출력
		System.out.println(Arrays.toString(arr1));
		
		// deepToString(): 다차원 배열 출력
		System.out.println(Arrays.deepToString(arr3));
		
		// equals(): 일차원 배열 비교
		System.out.println(Arrays.equals(arr1, arr2));
		
		// deepEquals(): 다차원 배열 비교
		System.out.println(Arrays.deepEquals(arr3, arr4));
		
		// copyOf(): 첫번째 인덱스부터 배열 복사
		int[] copyArr = Arrays.copyOf(arr1, 3);
		System.out.println(Arrays.toString(copyArr));
		
		// copyOfRange(): 배열 일부 복사
		copyArr = Arrays.copyOfRange(arr2, 2, 4);
		System.out.println(Arrays.toString(copyArr));
		
		// sort(): 배열 정렬
		Arrays.sort(arr2); // 따로 써야 함
		System.out.println(Arrays.toString(arr2));
	}
}
