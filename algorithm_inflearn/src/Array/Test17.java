package Array;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 5. 소수(에라토스테네스 체)
 * 
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

ex) 
200 -> 8

 */


// 소수란 1과 나 자신만 갖고 있는 걸 의미
// 1, 3, 5, 7 , 9 ....
// 2의 배수, 3의 배수, 5의 배수 7의 배수 등은 소수가 아님
public class Test17 {
	
	
	public int solution(int n) {
		int answer = 0;
		int [] ch = new int[n+1];
		for (int i =2; i <=n ; i++) {
			if(ch[i] == 0) {
				answer++;
				// j는 j+i i의 배수로 돌아야한다!
				// i = 2면 2씩 증가 / i = 3이면 3씩 증가..
				for(int j = i; j <=n ; j = j+i) {
					ch[j] = 1;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
			Test17 T = new Test17();
			Scanner kb = new Scanner(System.in);
			int n = kb.nextInt();
			System.out.println(T.solution(n)); 
	}

}
