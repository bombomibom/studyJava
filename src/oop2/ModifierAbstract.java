package oop2;

public class ModifierAbstract {
	public static void main(String[] args) {
		// 추상
		// 공통된 성질을 뽑아 이를 일반적인 개념으로 파악하는 정신 작용
		// 추상화: 기존 클래스의 공통부분을 뽑아서 조상 클래스를 만드는 것(아래 예제 참고)
		// 상속계층도를 내려갈수록 구체화(세분화), 올라갈수록 추상화(공통요소)
		
		// 추상클래스
		// 미완성 설계도. 미완성 메서드(추상 메서드)를 포함하고 있는 클래스
		// 추상클래스로 인스턴스 생성 불가. 상속을 통해 자손클래스에 의해서만 완성
		// 키워드 abstract 붙여서 사용
		// 목적: 어느정도 틀을 갖춰놓고 제작하기 위함
		
		// 추상메서드
		// 선언부만 작성하고 구현부는 작성 안 함 + 주석으로 어떤 기능을 수행할 목적으로 작성되었는지 알림
		// 목적: 메서드 사용하는 쪽에서 선언부(리턴타입, 메서드이름, 매개변수)만 알아도 코드 작성 가능하고, 클래스에 따라 내용을 달리 둘 수 있어서 추상메서드로 사용
		
		Unit[] group = { new Marine(), new Tank() };
		for(int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}
	}
}

abstract class Player {
	abstract void play(int pos); // 추상메서드
	abstract void stop();
}

class AudioPlayer extends Player {
	void play(int pos) { /* */ }; // 추상메서드 구현
	void stop() { /* */ }
}

abstract class AbstractPlayer extends Player { // 조상의 추상메서드 중 하나라도 구현하지 않는다면, 자손클래스 역시 추상클래스로 지정
	void play(int pos) {}
}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y); // move 공통으로 들어가기에. 다만 공중전, 지상전 여러 종류가 있기에 추상클래스로
	void stop() { /* 현재 위치에 정지 */ }
}

class Marine extends Unit { // 보병
	void move(int x, int y) { /* 지정된 위치로 이동 */}
	void stimPack() { /* 스팀팩 사용 */ }
}

class Tank extends Unit { // 탱크
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void changeMode() { /* 공격모드로 변환 */ }
}

