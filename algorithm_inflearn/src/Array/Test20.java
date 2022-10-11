package Array;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 8. 등수구하기
 * 
N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.

ex) 
5
87 89 92 100 76

=> 4 3 2 1 5

 */

public class Test20 {
	
	
	public int[] solution(int n, int[] arr) {
		int [] answer = new int[n];
		
		// i의 등수를 구하기 때문에, 기준점이 되는 것은 i가 된다.
		// i를 가지고 이중for문을 돌려줄 것!
		for (int i = 0; i < n ; i++ ) {
			int grade = 1;						// 1등으로 초기화
				for (int j = 0; j < n; j++) {
					if ( arr[j] > arr[i]) {		// 이 상황에서 같은 등수도 함께 걸러질 수 있음
						grade++;				// i의 등수를 올려주는 부분임
					}
					answer[i] = grade;
				}
			
		}
			
		
		return answer;
	}
	

	public static void main(String[] args) {
			Test20 T = new Test20();
			Scanner kb = new Scanner(System.in);
			int n = kb.nextInt();
			int [] arr = new int [n];
			for (int i = 0; i < n; i++) {
				arr[i] = kb.nextInt();
			}
			
			for(int x :T.solution(n, arr)) System.out.print(x+" ");
	}

}
