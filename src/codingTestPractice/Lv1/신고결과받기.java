package codingTestPractice.Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//1:40
public class 신고결과받기 {
	//벽 면적, 롤러 길이, 칠해야 하는 구역
	 static public int[] solution(String[] id_list, String[] report, int k) {
		 	int[] answer = new int[id_list.length];
	        ArrayList<String> list = new ArrayList<>();

	        Map<String, Integer> rpmap = new HashMap<>(); 
	        Arrays.stream(report).distinct().forEach((rp) -> {
	        	String rplist[] = rp.split(" ");
	        	int cnt = 1;
	        	if(rpmap.containsKey(rplist[1]))
	        		cnt = rpmap.get(rplist[1])+1;
	        	rpmap.put(rplist[1],cnt);
	        	list.add(rp);
	        }); 
	          
	        for(String li:list) {
	        	String[] liarr = li.split(" ");
	        	 
	        	if(rpmap.get(liarr[1]) >= k)
	        		answer[Arrays.asList(id_list).indexOf(liarr[0])]++;
	        } 	        
	        return answer;
	 }
		public static void main(String[] args) { 
			String user1[] = {"muzi", "frodo", "apeach", "neo"};
			String user2[] = {"con", "ryan"};
			
			String report1[] = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
			String report2[] = { "ryan con", "ryan con", "ryan con", "ryan con"};
				
			solution(user1, report1, 2);	//[2,1,1,0]
			solution(user2, report2, 3);	//[0,0]
		}
}
