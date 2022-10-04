import java.util.ArrayList;
import java.util.Scanner;

/*
 * 9. 숫자만 추출
 *문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
     만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
   ex)  g0en2T0s8eSoft -> 208
 */

public class Test09_2 {
	
	public int solution(String str) {
		String answer = ""; // 0으로 초기화 
		
		for (char x : str.toCharArray()) {
			// x 가 숫자인걸 확인하는 메서드
			if ( Character.isDigit(x)) {  
				answer += x;
			}
		}
		
		// 0208 -> 208 로 parseInt 처리 해줌
		return Integer.parseInt(answer);
	}
	
	public static void main(String[] args) {
			Test09_2 T = new Test09_2();
			Scanner kb = new Scanner(System.in);
			String str =  kb.next();
			System.out.print(T.solution(str));
	}

}
