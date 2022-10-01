package algorithm_inflearn;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 6. 중복문자제거
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
      중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
   ex)  ksekkset -> kset
 */

public class Test06 {
	
	public String solution(String str) {
		String answer= ""; 
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
			
			// str의 문자가 발견되는 첫번째 위치를 찾아라
			// i와 indexOf 숫자가 같은 경우에만 추가 문자열에 추가시켜주기
			if( str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
			Test06 T = new Test06();
			Scanner kb = new Scanner(System.in);
			String str =  kb.next();
			System.out.print(T.solution(str));
	}

}
