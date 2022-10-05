package String;

import java.util.ArrayList;
import java.util.Scanner;

//4. 단어 뒤집기
//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
/*
*  3
	good
	Time
	Big
	
	 -> 
	doog
	emiT
	giB
*/

public class Test04 {
	
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer=new ArrayList<>(); 
		for(String x : str){
			String tmp=new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}
	
	public static void main(String[] args) {
			Test04 T = new Test04();
			Scanner kb = new Scanner(System.in);
			
			int n = kb.nextInt();
			String [] str = new String[n];
			for (int i = 0; i < n; i++) {
				str[i] = kb.next();
			}
			
			for ( String x: T.solution(n, str)) {
				System.out.print(x);
			}
	}

}
