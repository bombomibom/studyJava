package oop1;

import java.util.Arrays;

public class ObjectVariable {
	public static void main(String[] args) {
		// 객체 변수(=속성)
		// 변수 선언 위치에 따른 종류: 멤버변수(클래스 변수, 인스턴스 변수), 지역변수
		
		// 클래스 변수
		// 인스턴스 변수 앞 static 붙은 변수
		// 클래스 영역에 선언되고, 클래스가 메모리에 올라갈 때 생성됨. 따라서 인스턴스 생성 않고 바로 사용 가능 예) 클래스이름.클래스변수
		// 모든 인스턴스가 공통된 저장공간을 공유
		// 멤버변수 중 모든 인스턴스에 공통된 값을 유지해야하는 것에 static 붙임
		
		// 인스턴스 변수
		// 클래스 영역에 선언되고, 인스턴스 생성될 때 생성
		// 별로의 저장공간을 가지므로 서로 다른 값 가질 수 있음
		
		// 지역변수
		// 메서드 내에 선언. 변수 선언문 수행되었을 때 생성
		// 메서드 종료되면 소멸
		
		// 클래스 변수 vs 인스턴스 변수
		System.out.println("Card.width = " + Card.width); // 클래스 변수는 인스턴스 생성없이 바로 사용 가능

		Card c1 = new Card();
		Card c2 = new Card();
		c1.kind = "Spade"; // 인스턴스 변수 값 변경
		c2.kind = "Heart";
		
		System.out.println("c1.kind = " + c1.kind); // 인스턴스 변수는 서로 다른 값 가질 수 있음
		System.out.println("c2.kind = " + c2.kind);
		
		c1.width = 200; 
		System.out.println("c1.width = " + c1.width); // 클래스 변수는 하나만 바꿔도 공유. 다만, 인스턴스 변수로 오해하기 쉬우니 '클래스이름.클래스변수'로 사용
		System.out.println("c2.width = " + c2.width);
		
		// 변수 초기화
		// 멤버변수는 선택. 지역변수는 필수. 다만 가능하면 선언과 동시에 적절한 값으로 초기화 하는 것이 바람직
		// 클래스 변수(cv) -> 인스턴스 변수(iv) 순서로 초기화
		// 자동 초기화 -> 명시적 초기화(간단) -> 초기화 블럭, 생성자(복잡) 순서로 초기화
		
		// 명시적 초기화
		int a = 4; // 기본형 변수 초기화
		Card card = new Card(); // 참조형 변수 초기화
		
		// 초기화 블럭
		// 종류: 클래스 초기화 블럭(클래스 변수 초기화에 사용), 인스턴스 초기화 블럭(인스턴스 변수 초기화에 사용)
		// 보다 복잡한 초기화 작업이 필요할 때
		// Card 클래스 메모리에 로딩될 때 클래스 초기화 블럭 가장 먼저 수행. 그 다음 인스턴스 초기화 블럭. 그 다음 생성자 수행
		// 클래스 초기화 블럭은 메모리에 로딩될 때 한번만 수행. 인스턴스 초기화 블럭 및 생성자는 인스턴스 생성될 때마다 수행
		// 아래 Card, ResetExample 참고
		ResetExample re = new ResetExample();
		System.out.println(Arrays.toString(re.arr));
		
	}
}

class Card {
	String kind;
	int num;
	static int width = 100;
	static int height = 250;
	
	static {
		System.out.println("static { }"); // 클래스 초기화 블럭
	}
	{
		System.out.println("{ }"); // 인스턴스 초기화 블럭
	}
	
	Card(){
		System.out.println("생성자");
	}
}

class ResetExample {
	static int[] arr = new int[10];
	
	static {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
	
}
