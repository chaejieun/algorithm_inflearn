import java.util.ArrayList;
import java.util.Scanner;

// 4. 단어 뒤집기
// N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
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

public class Test04_2 {
	
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer=new ArrayList<>(); 
		for(String x : str){
			char[] s=x.toCharArray();
			// lt 맨 첫번째 문자
			// rt 맨 마지막 문자 
			// lt <-> rt 자리 교체 
			// 마지막에 rt가 lt보다 작아지면 바꿀게 없음. 홀수인 경우에도 마찬가지
			int lt=0, rt=x.length()-1;
			while(lt<rt){
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp=String.valueOf(s);// s문자 배열을 string화
			answer.add(tmp);
		}
		return answer;
	}
	
	public static void main(String[] args) {
			Test04 T = new Test04();
			Scanner kb = new Scanner(System.in);
			int n=kb.nextInt();
			String[] str=new String[n];
			for(int i=0; i<n; i++){
				str[i]=kb.next();
			}
			for(String x : T.solution(n, str)){
				System.out.println(x);
			}
	}

}
