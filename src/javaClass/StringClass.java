package javaClass;

public class StringClass {
	public static void main(String[] args) {
		String str = "abcde";
		
		// char charAt(int index): 문자열에서 지정된 index에 있는 한 문자를 가져옴
		char ch = str.charAt(3);
		System.out.println(ch);
		
		// int length(): 문자열 길이 반환
		int strLen = str.length();
		System.out.println(strLen);
		
		// String substring(int from, int to): 문자열에서 해당 범위의 문자열 반환(to는 포함 x)
		String subStr = str.substring(0, 3);
		System.out.println(subStr);
		
		// boolean equals(Object obj): 문자열 내용 같은지 확인(문자열은 무조건 equals로 비교)
		if(str.equals("abcde")) {
			System.out.println("같다");
		}
		if(str.equalsIgnoreCase("ABCDE")) { // 대소문자 구분 안 할 때
			System.out.println("대소문자 구분 안 하고 같음");
		}
		
		// char[] toCharArray(): 문자열을 문자배열(char[])로 변환해서 반환
		char[] chaArr = str.toCharArray();
		System.out.println(chaArr);
	}
}
