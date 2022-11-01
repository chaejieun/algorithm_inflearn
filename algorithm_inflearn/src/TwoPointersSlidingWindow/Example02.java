package TwoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * TwoPointers & Sliding Window. 
 * 2. 공통원소 구하기
 * 
A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
(교집합 문제)

ex) 
5
1 3 9 5 2
5
3 2 5 7 8

=> 
2 3 5
 */


public class Example02 {
	
	public ArrayList<Integer> solution(int n, int m, int [] a, int [] b) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		// 1. 각 배열을 오름차순 정렬 시켜주기
		Arrays.sort(a);
		Arrays.sort(b);
		
		int p1 =0, p2 =0;
		while ( p1 <n && p2 < m) {
			if( a[p1] == b[p2]) { // 2. 정렬 후 동일한 원소 찾기
				answer.add(a[p1++]);
				p2++;
			}else if ( a[p1] < b[p2]) {
				p1++;
			}else {
				p2++;
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Example02 T = new Example02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		int [] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = kb.nextInt();
		}
		
		int n2 = kb.nextInt();
		
		int [] arr2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			arr2[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, n2, arr1, arr2)) {
			System.out.print(x + " ");
		};
	}

}
