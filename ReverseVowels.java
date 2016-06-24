package _160623;

import java.util.ArrayList;
import java.util.Iterator;

public class ReverseVowels {

	public static String reverseVowels(String s) {
		
		ArrayList<Character> sbVowels = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> position = new ArrayList<>();
		int stringLength = s.length();
		for(int i = stringLength; i > 0; i--){
			char ch = s.charAt(stringLength - i);
			if (containVowel(ch)){
				sbVowels.add(ch);
				position.add(stringLength-i);
			}
			sb.append(ch);
		}
//		System.out.println(position);
		Iterator<Integer> it = position.iterator();
		int count = 0;
		while(it.hasNext()){
			int tmp = it.next();
			sb.setCharAt(tmp, sbVowels.get(sbVowels.size()-1-count));
			count++;
		}
		
		return sb.toString();
	}
	
	public static Boolean containVowel(char ch) {
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		for (int i = 0; i < 10; i++){
			if (ch == vowels[i]){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {

		System.out.println(reverseVowels("leetcode"));
	}

}
