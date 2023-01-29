package oop2;

public class InheritanceOverriding {
	public static void main(String[] args) {
		// 오버라이딩
		// 예를 들어 조상클래스인 Print를 사용하던 사람들은 자손클래스인 Print3D에서도 getLocation()시 점의 좌표를 얻을 것이라 기대
		// 이런 때에 새로운 메서드를 생성하는 것보단 고객 경험을 우선시하여 덮어쓰는 식이 더 바른 선택
	
		// 오버라이딩 조건
		// 조상클래스보다 접근 제어는 널널하게, 예외 처리도 적게
		// 1. 선언부는 조상클래스의 메서드와 일치
		// 2. 접근 제어자를 조상클래스의 메서드보다 좁은 범위로 변경 불가 -> 조상클래스 메서드 protected라면 자손클래스 메서드는 protected or public
		// 3. 예외는 조상클래스의 메서드보다 많이 선언 불가 -> 조상 throws IOException, SQLException라면 자손클래스 throws SQLException 이렇게
		
		// 오버로딩 vs 오버라이딩
		// 오버로딩: 기존에 없는 새로운 메서드 정의하는 것. 메서드명은 같으나 매개변수가 다른..
		// 오버라이딩: 상속받은 메서드의 내용을 변경하는 것
		
		Point3D p3d = new Point3D();
		String result = p3d.getLocation();
		System.out.println(result);
	}
}

class Point {
	int x;
	int y;
	
	String getLocation() {
		return "x: " + x + "y: " + y;
	}
}

class Point3D extends Point {
	int z;
	
	String getLocation() {
		return "x: " + super.x + " y: " + super.y + " z: " + this.z;
	}
}
