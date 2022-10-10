package Array;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 6. 뒤집은 소수
 * 
N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 
단 910를 뒤집으면 19로 숫자화 해야 한다.
첫 자리부터의 연속된 0은 무시한다.

ex) 
9
32 55 62 20 250 370 200 30 100 

=> 23 2 73 2 3 

 */

// 10으로 나눈 숫자는 1의 자리  ( % 나머지 , / 몫)
// 1) T = 10으로 나눈 나머지
// 2) res * 10 + T 
// 3) tmp = tmp / 10 
public class Test18 {
	
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<n; i++){
			int tmp=arr[i];
			int res=0;
			// 뒤집기
			// tmp가 0보다 클 때 까지만 돌리기
			while(tmp>0){
				int t = tmp % 10;
				res = res * 10 + t;
				tmp = tmp/10;
			}
			
			// 뒤집고 난 결과
			if(isPrime(res)) {
				answer.add(res);
			}
		}
		return answer;
	}
	
	private boolean isPrime(int num) {
		// num이 소수인지 확인
		if ( num == 1 ) {
			return false;
		}
		
		for (int i = 2; i < num; i ++) {
			// 약수가 발견되면 소수가 아님 
			if(num % i==0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
			Test18 T = new Test18();
			Scanner kb = new Scanner(System.in);
			int n = kb.nextInt();
			int [] arr = new int [n];
			for (int i = 0; i < n; i++) {
				arr[i] = kb.nextInt();
			}
			for (int x : T.solution(n, arr)) {
				System.out.print(x + " "); 
			}
	}

}
