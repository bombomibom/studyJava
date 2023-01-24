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
		
		// toString(): ������ �迭 ���
		System.out.println(Arrays.toString(arr1));
		
		// deepToString(): ������ �迭 ���
		System.out.println(Arrays.deepToString(arr3));
		
		// equals(): ������ �迭 ��
		System.out.println(Arrays.equals(arr1, arr2));
		
		// deepEquals(): ������ �迭 ��
		System.out.println(Arrays.deepEquals(arr3, arr4));
		
		// copyOf(): ù��° �ε������� �迭 ����
		int[] copyArr = Arrays.copyOf(arr1, 3);
		System.out.println(Arrays.toString(copyArr));
		
		// copyOfRange(): �迭 �Ϻ� ����
		copyArr = Arrays.copyOfRange(arr2, 2, 4);
		System.out.println(Arrays.toString(copyArr));
		
		// sort(): �迭 ����
		Arrays.sort(arr2); // ���� ��� ��
		System.out.println(Arrays.toString(arr2));
	}
}
