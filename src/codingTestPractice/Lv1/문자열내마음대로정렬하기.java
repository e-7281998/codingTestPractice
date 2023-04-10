package codingTestPractice.Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class 문자열내마음대로정렬하기 {
	 public static String[] solution(String[] strings, int n) {
		 	String[] answer = new String[strings.length];
		 	HashMap<String, Integer> map = new HashMap<>();
		 	String arr[] = new String[strings.length];
		 	
		 	for(int i=0; i<strings.length; i++) {
		 		String str = strings[i].charAt(n)+""+strings[i];
		 		arr[i]= str; 
		 		map.put(str, i);
		 	}
		 	Arrays.asList(arr).sort(null);
		 	
		 	for(int i=0; i<strings.length; i++) {
		 		answer[i] = strings[map.get(arr[i])];
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
