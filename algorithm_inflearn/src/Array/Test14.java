package Array;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Array. 2. 보이는 학생
 * 
선생님이 N명의 학생을 일렬로 세웠습니다. 
일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 
맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)

ex) 
8
130 135 148 140 145 150 150 153 ->  5
 */

public class Test14 {
	
	
	
	public int solution(int n, int [] arr) {
		int answer=1;
		
		// 맨 첫번째 숫자를 max로 초기화
		int max = arr[0]; 
		for ( int i = 1 ; i < n ; i++) {
			if ( max < arr[i] ) {
				max = arr[i];
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
			Test14 T = new Test14();
			Scanner kb = new Scanner(System.in);
			int n = kb.nextInt();
			int [] arr = new int [n];
			for (int i=0; i<n; i++ ) {
				arr[i] = kb.nextInt();
			}
			System.out.print(T.solution(n, arr));
	}

}
