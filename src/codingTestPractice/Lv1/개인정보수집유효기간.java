package codingTestPractice.Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 개인정보수집유효기간 {
    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = new int[privacies.length];
        String[] td = today.split("[.]");
        
        Map<String, Integer> termMap = new HashMap<>();
        
        for(String term:terms) {
        	String[] termArr = term.split(" ");
        	termMap.put(termArr[0], Integer.parseInt(termArr[1]));
        }
    	int n=0; 

        for(int i=0; i<privacies.length; i++) {
        	String[] priArr = privacies[i].split("[ .]");
        	//기준 달 + 유효기간 달
        	
        	int term = termMap.get(priArr[3]);
        	int mon = Integer.parseInt(priArr[1]);
        	//처음 + 텀
        	int year = Integer.parseInt(priArr[0])+(term+mon)/12;	//년
        	int month = (term+mon)%12;	//달
        	  
        	System.out.println("term : " + term);
        	System.out.println("기준 달 : " + mon);
        	System.out.println("년도 : " + year);
        	System.out.println("월 : " + month);
        	
        	System.out.println("==================");
        	
        	if(year < Integer.parseInt(td[0])) {//년이 이미 넘음
        		answer[n] = i;
        		n++;
        	}else if(year == Integer.parseInt(td[0])) {//같은 해
        		if(month < Integer.parseInt(td[1])) {//달이 이미 넘음
        			answer[n] =i;
        			n++;
        		}else if(month == Integer.parseInt(td[1])) {	//달이 같음
        			if(Integer.parseInt(priArr[2]) < Integer.parseInt(td[1])-1) {
            			answer[n] =i;
            			n++;
        			}
        		}
        	}
        	
        }
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
    public static void main(String[] args) {
    	String todayString ="2022.05.19";
    	String[] terms = {"A 6", "B 12", "C 3"};
    	String[] privacieStrings = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		solution(todayString, terms, privacieStrings);
	}
}
