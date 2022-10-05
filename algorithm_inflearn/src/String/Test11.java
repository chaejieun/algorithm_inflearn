package String;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 11. 문자열 압축
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
       문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
       단 반복횟수가 1인 경우 생략합니다.
   ex) KKHSSSSSSSE -> K2HS7E
   ex) KSTTTSEEKFKKKDJJGG -> KST3SE2KFK3DJ2G2
 */

public class Test11 {
	
	
	// KKHSSSSSSSE + 마지막에 " " 빈문자열을 넣어줘야지 알고리즘이 진행됨.
	
	public String solution(String str) {
		String answer = "";
		str = str + " ";
		
		int cnt = 1;
		
		for (int i = 0; i < str.length()-1 ; i++) {
			if( str.charAt(i) == str.charAt(i+1)) {
				cnt++;
			}else {
				answer += str.charAt(i);
				if ( cnt > 1) {
					answer += Integer.toString(cnt);
					cnt = 1;		// cnt는 다시 1로 초기화
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
			Test11 T = new Test11();
			Scanner kb = new Scanner(System.in);
			String str=kb.next();
			System.out.print(T.solution(str));
	}

}
