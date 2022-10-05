package String;

import java.util.Scanner;

public class Test01 {
	
	public int solution(String str, char t) {
		int answer = 0;
		
		// 대문자로 바꿔주기
		str = str.toUpperCase();
		// t는 char타입이기 때문에 character
		t = Character.toUpperCase(t);
		
		//System.out.println("str : "+ str + " \n t : " + t);
		/*
		for (int i = 0; i < str.length(); i++) {
			if( str.charAt(i) == t) {
				answer++;
			}
		}*/
		
		// 향상된 for문 사용 방법
		// string은 들어갈 수 없음. 배열 가능
		// string을 문자 배열로 만들어주기 ( toCharArray() )
		for ( char x : str.toCharArray()) {
			if ( x == t ) {
				answer++;
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
			Test01 T = new Test01();
			Scanner kb = new Scanner(System.in);
			
			String str = kb.next();
			char c = kb.next().charAt(0);
			System.out.print(T.solution(str,c));
	}

}
