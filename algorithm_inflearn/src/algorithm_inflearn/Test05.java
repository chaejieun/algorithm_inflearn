package algorithm_inflearn;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 5. 특정 문자 뒤집기
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
       특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 	ex) a#b!GE*T@S -> S#T!EG*b@a
 */

public class Test05 {
	
	public String solution(String str) {
		String answer= ""; 
		char [] s = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		
		// lt 와 rt를 바꾸는 거로 생각하면 됌
		while ( lt < rt) {
			// lt가 알파벳이 아닐 때
			if ( !Character.isAlphabetic(s[lt])) {
				lt++;
			}else  if(!Character.isAlphabetic(s[rt])){
				rt--;
			}else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		return answer;
	}
	
	public static void main(String[] args) {
			Test05 T = new Test05();
			Scanner kb = new Scanner(System.in);
			String str =  kb.next();
			System.out.print(T.solution(str));
	}

}
