package codingTestPractice.Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class 문자열내마음대로정렬하기 {
	 public static String[] solution(String[] strings, int n) {
	        String[] answer = new String[strings.length];
	         
	        char[] chararr = new char[strings.length];
	        Map<Character, Integer> cmap = new HashMap<>();
	        
	        for(int i=0; i<strings.length; i++) {
	        	char ch = strings[i].charAt(n);
	        	cmap.put(ch, i);
	        	chararr[i] = ch;
	        }
	        Arrays.sort(chararr);
	        for(int i=0; i<chararr.length; i++) {
	        	answer[i] = strings[cmap.get(chararr[i])];
	        }
	        
	        System.out.println(Arrays.toString(answer));
	        
	        return answer;
	    }

	public static void main(String[] args) {
		String[] strings1 = {"sun", "bed", "car"}; // keymap
		String[] strings2 = {"abce", "abcd", "cdx"}; // targets
		
		solution(strings1, 1);
		solution(strings2, 2);
	}
}
