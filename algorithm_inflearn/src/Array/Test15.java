package Array;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 3. 가위 바위 보
 * 
A, B 두 사람이 가위바위보 게임을 합니다. 
총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
예를 들어 N=5이면
두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.

ex) 
5
2 3 3 1 3
1 1 2 2 3						

->

A
B
A
B
D

 */

public class Test15 {
	
	// 1) A == B 가 같은 경우
	// 2) A가 이기는 경우 3가지 (1(B는 3),2(B가 1),3 (B가 2)으로 이기는 경우)
	// 3) 그것이 아닌 경우는 B가 이기는 경우
	
	public String solution(int n, int [] A, int [] B) {
		String answer = "";
		for (int i = 0 ; i < n; i++) {
			// 비기는 경우
			if (A[i] == B[i]) {
				answer += "D";
			}else if ( A[i] == 1 && B[i] == 3) {
				answer += "A";
			}else if ( A[i] == 2 && B[i] == 1) {
				answer += "A";
			}else if ( A[i] == 3 && B[i] == 2) {
				answer += "A";
			}else {
				answer += "B";
			}
				
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
			Test15 T = new Test15();
			Scanner kb = new Scanner(System.in);
			int n = kb.nextInt();
			int [] A = new int [n];
			int [] B = new int [n];
			for (int i=0; i<n; i++ ) {
				A[i] = kb.nextInt();
			}
			
			for (int i=0; i<n; i++ ) {
				B[i] = kb.nextInt();
			}
			
			for (char x: T.solution(n, A, B).toCharArray()) {
				System.out.println(x);
			}
	}

}
