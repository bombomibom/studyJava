package oop2;
import static java.lang.System.out;

public class Package {
	public static void main(String[] args) {
		// 패키지
		// 서로 관련된 클래스 또는 인터페이스끼리 그룹 단위로 묶어 놓음으로써 클래스 효율적으로 관리
		// 클래스 풀네임은 패키지명 포함 예) java.lang.String
		// 클래스가 물리적으로 하나의 클래스파일(.class)인 것과 같이 패키지는 물리적으로 하나의 디렉토리
		// 예) java.lang.String 클래스 -> 물리적으로 디렉토리 java의 서브디렉토리 lang에 속한 String.class 파일
		// rt.jar 압축된 String 클래스 압축 풀면 실제 위같은 폴더 구조 확인 가능
		// 패키지도 다른 패키지 포함 가능하고, '.'점으로 구분 예) java.lang -> lang 패키지는 java 패키지의 하위패키지
		
		// 패키지 선언
		// 첫 번째 줄, 소문자 원칙
		// 모든 클래스는 반드시 하나의 패키지에 포함. 그냥 클래스 파일만 만든다면 자바에서 기본적으로 제공하는 '이름없는 패키지(unnamed package)'에 속함
		
		// 클래스 패스(classpath)
		// 패키지의 폴더를 찾아간 후, 해당 디렉토리를 클래스 패스로 잡아줘야 JVM이 해당 클래스를 찾을 수 있음
		// 윈도우즈는 환경변수 - 새로만들기에서 가능
		// ;를 구분자로 하여 여러 개의 경로를 클래스패스에 지정할 수 있으며, 맨 앞에 .;를 추가하면 현재 디렉토리(.)를 클래스패스에 포함할 수 있음
		
		// import문
		// 사용할 클래스의 패키지를 미리 명시해주면 소스코드에 사용되는 클래스이름에서 패키지명은 생략 가능
		// import 패키지명.*; -> 패키지에 속하는 모든 클래스를 패키지명 없이 사용 가능. 성능 차이는 없음 
		// 예) java.util.Date today = new java.util.Date();
		//    -> import java.util.Date; & Date today = new Date();
	
		// static import문
		// import문 사용시 클래스 패키지명 생략 가능하듯이 static import문은 static 멤버 호출시 클래스 이름을 생략할 수 있음
		// 특정 클래스의 static 멤버 사용시 편리

		// 맨 위 참고. 아래처럼 가능
		out.println(); 
	}
}
