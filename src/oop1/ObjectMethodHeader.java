package oop1;

public class ObjectMethodHeader {
	public static void main(String[] args) {
		// 선언부 매개변수
		Data d = new Data();
		d.x = 100;
		System.out.println("main() : x = " + d.x);
		
		change(d.x); // 기본형 매개변수. 변수의 값을 읽기만 할 수 있음
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		
		change(d); // 참조형 매개변수. 변수의 값을 읽고 변경할 수 있음. 값이 저장된 주소를 넘겨주었기에 변경도 가능한 것!
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);

		// 선언부 반환타입
		Data d2 = new Data();
		d2.x = 10; 
		Data d3 = copy(d2); // 참조형 반환타입
		System.out.println("d3.x = " + d3.x);
	}

	static void change(int x) { // 기본형 매개변수. 원본 d.x에 아무런 영향 x
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
	static void change(Data d) { // 참조형 매개변수. 원본 d.x에 영향 ㅇ
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
	 
	static Data copy(Data d) { // 참조형 반환타입
		Data tmp = new Data();
		tmp.x = d.x;
		return tmp;
	}
}

class Data { int x; }
