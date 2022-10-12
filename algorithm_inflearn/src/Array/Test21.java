package Array;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 9. 격자판 최대합
 * 
5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.


ex) 
5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19

=> 155

 */

public class Test21 {
	
	
	public int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;		// 제일 작은 값으로 초기화
		int sum1, sum2;	// sum1은 행의 합, sum2는 열의 합
		for (int i = 0 ; i < n ; i++) {
			sum1 = sum2 = 0; // 초기화
			for (int j = 0 ; j < n; j++) {
				// sum1은 행의 합
				// sum2는 열의 합
				sum1 += arr[i][j]; // i는 고정, j가 도는 것 . 행 번호가 고정
				sum2 += arr[j][i]; // 열 번호가 고정
			}
			answer = Math.max(answer, sum1);	
			answer = Math.max(answer, sum2);
			// 행과 열의 최대값 이 들 중에서 큰 값으로 알아서 교체가 될 것임 
		}
		
		// 두 대각선의 합
		sum1 = sum2 = 0;
		for (int i=0; i<n; i++) {
			sum1 += arr[i][i]; //행과 열번호가 같다 		  (0,0) (1,1) (2,2) (3,3) (4,4)
			sum2 += arr[i][n-i-1]; // i = 0일 때, 5-0-1 (0,4) (1,3) (2,2) (3,1) (4,0)
		}
		answer = Math.max(answer, sum1);	
		answer = Math.max(answer, sum2);
		
		return answer;
	}
	

	public static void main(String[] args) {
			Test21 T = new Test21();
			Scanner kb = new Scanner(System.in);
			int n = kb.nextInt();
			int [][] arr = new int [n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = kb.nextInt();
				}
			}
			
			System.out.print(T.solution(n, arr));
	}

}
