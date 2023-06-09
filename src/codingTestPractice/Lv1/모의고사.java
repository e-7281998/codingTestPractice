package codingTestPractice.Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class 모의고사 {

	public static int[] solution(int[] answers) {
        int[] cnt = new int[3];
        int[] supoja1 = {1,2,3,4,5};
        int[] supoja2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        
        for(int i=0; i<answers.length; i++) {
        	if(answers[i] == supoja1[i%5]) cnt[0]++;
        	if(answers[i] == supoja2[i%8]) cnt[1]++;
        	if(answers[i] == supoja3[i%10]) cnt[2]++;
        }
         
        int max = Math.max(cnt[0],  Math.max(cnt[1], cnt[2]));
       
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<cnt.length; i++) {
        	if(max == cnt[i])
        		list.add(i+1);
        }
        int answer[] = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,3,2,4,2};
		
		System.out.println(Arrays.toString(solution(arr1)));	//1
		System.out.println(Arrays.toString(solution(arr2)));	//123
	}
}
