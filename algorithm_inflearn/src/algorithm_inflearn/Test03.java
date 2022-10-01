package algorithm_inflearn;

import java.util.Scanner;

// 3. 문장 속 단어 
// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
// 문장속의 각 단어는 공백으로 구분됩니다.
// ex ) it is time to study -> 	study 출력

public class Test03 {
	
	public String solution(String str) {
		String answer = "";
		
		// 제일 작은 값으로 초기화 처리
		int m = Integer.MIN_VALUE, pos; 	
		
		
		//1. split(" ") 공백 제거
		/*String[] s = str.split(" ");
		for(String x : s){
			int len = x.length();
			if ( len > m ) {
				m = len;
				answer = x;
			}
		}*/
		
		// 2. indexOf(' ') 첫번째로 발견되는 인덱스 값 구하기
		// it is -> '2'인덱스는 공백임 그래서 -1을 return
		while ( (pos = str.indexOf(" ")) != -1) {
			String tmp = str.substring(0, pos); // 0번부터 pos 전까지 자르기
			System.out.println("pos " + pos);
			int len = tmp.length();
			if( len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos + 1); 
			// is time to study로 변경 되고 
			// time to study
			// to study
			// study 마지막 단어가 남았음
			
			if ( str.length() > m) {
				answer = str;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
			Test03 T = new Test03();
			Scanner kb = new Scanner(System.in);
			String str = kb.nextLine();
			System.out.print(T.solution(str));
	}

}
