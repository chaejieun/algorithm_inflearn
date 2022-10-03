package algorithm_inflearn;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 10. 가장 짧은 문자거리
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
   ex)  teachermode e -> 1 0 1 2 1 0 1 2 2 1 0
 */

// 왼쪽에서부터 for문 
// 오른쪽에서부터 for문
// 총 2번을 돈 것 중에서 차이가 제일 작은 걸로 결과값
public class Test10 {
	
	public int[] solution(String str, char t) {
		int [] answer = new int[str.length()];
		int p = 1000; // 최대값 큰 숫자로 초기값 세팅
		
		// 왼쪽에서부터 거리길이 구하기
		for ( int i=0; i<str.length();i++) {
			if(str.charAt(i)==t){
				p=0;
				answer[i]=p;
			}else{
				p++;
				answer[i]=p;
			}
		}
		
		p = 1000;
		// 오른쪽에서부터 거리 길이 구하기
		for (int i=str.length()-1 ; i >=0; i--) {
			if(str.charAt(i)==t) {
				p=0;
			}else {
				p++;
				answer[i] = Math.min(answer[i], p); 	// answer[i] 기존 값과 p 중에서 제일 작은 값으로 넣어주기
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
			Test10 T = new Test10();
			Scanner kb = new Scanner(System.in);
			String str=kb.next();
			char c=kb.next().charAt(0);
			for(int x : T.solution(str, c)){
				System.out.print(x+" ");
			}
	}

}
