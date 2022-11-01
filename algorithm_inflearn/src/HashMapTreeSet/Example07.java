package HashMapTreeSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
 * HashMap, TreeSet(해쉬,정렬지원 Set)
 * 1. 학급 회장(해쉬)
 * 

학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.


ex) 

15
BACBACCACCBDEDE

=>

C
 
*/


public class Example07 {
	
	
	public char solution(int n, String s) {
		char answer = 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char x : s.toCharArray()) {
			// map.getOrDefault -> x라는 key의 value가 없으면 0을 default로 설정해준다는 의미!!!
			map.put(x, map.getOrDefault(x, 0)+1 );
		}
		
		// map 객체의 특정 Key가 있는지 확인하는 방법
		System.out.println(map.containsKey('A'));
		System.out.println(map.containsKey('F'));
		
		// map 자체의 key 사이즈 조회 5개 (A,B,C,D,E)
		System.out.println(map.size());
		
		// 특정 Key 삭제
		System.out.println(map.remove('A'));
		System.out.println(map.size());
		
		int max = Integer.MIN_VALUE;
		for ( char key : map.keySet()){
			System.out.println(key + " " + map.get(key));
			if ( map.get(key) > max ) {
				max = map.get(key);
				answer = key;
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Example07 T = new Example07();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		
		System.out.print(T.solution(n, str));
	}

}
