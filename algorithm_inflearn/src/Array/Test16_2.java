package Array;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 4. 피보나치 수열
 * 
1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
ex) 
10 -> 1 1 2 3 5 8 13 21 34 55

 */

public class Test16_2 {
	
	
	public void solution(int n) {
		int a = 1, b =1 , c;
		System.out.print(a + " " + b + " ");
		for ( int i = 2; i < n ; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
	
	public static void main(String[] args) {
			Test16_2 T = new Test16_2();
			Scanner kb = new Scanner(System.in);
			int n = kb.nextInt();
			T.solution(n);
	}

}
