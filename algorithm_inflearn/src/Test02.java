

import java.util.Scanner;

public class Test02 {
	
	public String solution(String str) {
		String answer = "";
		for ( char x : str.toCharArray()) {
			// x가 소문자인지 확인하는 방법
//			if( Character.isLowerCase(x)) {
//				answer += Character.toUpperCase(x);
//			}else {
//				answer += Character.toLowerCase(x);
//			}
			// ASCII 넘버 대문자는 65~90까지
			// 소문자는 97~122번까지
			if ( x >= 97 && x <= 122) {
				answer += (char)(x-32);
			}else {
				answer += (char)(x+32);
			}
			
		}
		return answer;
	}
	
	public static void main(String[] args) {
			Test02 T = new Test02();
			Scanner kb = new Scanner(System.in);
			
			String str = kb.next();
			System.out.print(T.solution(str));
	}

}
