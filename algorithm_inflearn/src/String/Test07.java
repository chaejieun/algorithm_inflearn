package String;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 7. 회문 문자열
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
  	문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 
  	회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
	단 회문을 검사할 때 대소문자를 구분하지 않습니다.
   ex)  gooG -> yes
 */

public class Test07 {
	
	public String solution(String str) {
		String answer= "YES"; 
		// 짝수 개수의 문자인 경우, 4/2 -> 2니니깐 0,1만 비교 
		// 2를 나눠서 0번과 마지막 문자 비교, 1번과 문자-1 문자 비교해서 같으면 YES
		// 홀수 개수의 문자인 경우, 5/2를 해도 2니깐 0,1까지만 비교 
		
		// 대소문자 비교 안할 수 있도록 바꿔주기
		str = str.toUpperCase();
		int len = str.length();
		for(int i = 0; i < len/2; i++) {
			if ( str.charAt(i) != str.charAt(len-i-1) ) {
				// 여기서 끝내버리도록 한다
				return "NO";
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
			Test07 T = new Test07();
			Scanner kb = new Scanner(System.in);
			String str =  kb.next();
			System.out.print(T.solution(str));
	}

}
