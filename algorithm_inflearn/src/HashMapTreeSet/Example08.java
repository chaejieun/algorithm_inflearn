package HashMapTreeSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
 * HashMap, TreeSet(해쉬,정렬지원 Set)
 * 2. 아나그램(해쉬)
 * 

Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 
A(2), a(1), b(1), C(1), e(2)로 알파벳과 그 개수가 모두 일치합니다. 
즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.

ex) 

AbaAeCe
baeeACA

=>

YES

abaCC
Caaab

=>

NO
 
*/


public class Example08 {
	
	
	public String solution(String a, String b) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for( char x : a.toCharArray()) {
			map.put(x,map.getOrDefault(x, 0)+1);
		}
		
		for ( char x: b.toCharArray()) {
			if( !map.containsKey(x) || map.get(x) == 0) {
				return "NO";
			}
			map.put(x,map.get(x)-1);
		}
		

		return answer;
	}
	
	
	public static void main(String[] args) {
		Example08 T = new Example08();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		
		System.out.print(T.solution(a, b));
	}

}
