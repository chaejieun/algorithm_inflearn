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

public class Test07_2 {
	
	public String solution(String str) {
		String answer= "NO"; 
		String tmp = new StringBuilder(str).reverse().toString();
		
		// equalsIgnoreCarse
		// 대소문자 구분없이 비교할 수 있는 메서드
		if( str.equalsIgnoreCase(tmp)) {
			answer = "YES";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
			Test07_2 T = new Test07_2();
			Scanner kb = new Scanner(System.in);
			String str =  kb.next();
			System.out.print(T.solution(str));
	}

}
