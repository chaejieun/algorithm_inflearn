package Array;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 10. 봉우리
 * 
지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 
봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
격자의 가장자리는 0으로 초기화 되었다고 가정한다.
만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.

ex) 
5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2

=> 10

 */

public class Test22 {
	
	
	public int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;		// 제일 작은 값으로 초기화
		return answer;
	}
	

	public static void main(String[] args) {
			Test22 T = new Test22();
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