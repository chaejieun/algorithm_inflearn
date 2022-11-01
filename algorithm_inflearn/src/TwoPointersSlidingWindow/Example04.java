package TwoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * TwoPointers & Sliding Window. 
 * 4. 연속 부분수열
 * 
N개의 수로 이루어진 수열이 주어집니다.
이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
만약 N=8, M=6이고 수열이 다음과 같다면
1 2 1 3 1 1 1 2
합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.


ex) 
8 6
1 2 1 3 1 1 1 2

=> 
3
 */


public class Example04 {
	
	
	// two pointers 알고리즘을 사용
	// O(n2)이 아닌 O(n)으로 끝낼 수 있게 처리해야한다는 것을 알아차려야함
	// 특정 구간의 길이를 lt와 rt로 구별
	public int solution(int n, int m, int [] arr) {
		int answer = 0, sum = 0;
		int lt= 0;
		for (int rt = 0; rt < n; rt++) {
			sum += arr[rt];
			if( sum == m) {
				answer++;
			}
			while (sum > m) {
				sum -= arr[lt++];
				// arr[lt]값을 빼고나서 증가 
				if ( sum == m ) {
					answer++;
				}
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Example04 T = new Example04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.print( T.solution(n, m,  arr));
	}

}
