package TwoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * TwoPointers & Sliding Window. 
 * 1. 두 배열 합치기
 * 
오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

ex) 
3
1 3 5
5
2 3 6 7 9

=> 
1 2 3 3 5 6 7 9
 */

public class Example01 {
	
	public ArrayList<Integer> solution(int n, int m, int [] a, int [] b) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int p1= 0, p2 =0;
		while ( p1 < n && p2 < m) {
			if( a[p1] < b[p2]) {
				// a[p1]을 넣고 p1++가 진행됨
				// 후위 증감 연산자
				answer.add(a[p1++]);
			}else {
				answer.add(b[p2++]);
			}
		}
		
		while (p1 < n) {
			answer.add(a[p1++]);
		}
		
		while (p2 < m) {
			answer.add(b[p2++]);
		}
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Example01 T = new Example01();
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
