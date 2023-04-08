package codingTestPractice.Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 추억점수 {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
    		int[] answer = new int[photo.length];	
    		 
	        Map<String, Integer> score = new HashMap<>();
	        for(int i=0; i<name.length; i++){
	            score.put(name[i], yearning[i]);
	        }
	        for(int i=0; i<photo.length; i++){
	            for(int j=0; j<photo[i].length; j++){
	                if(score.containsKey(photo[i][j])){
	                    answer[i] += score.get(photo[i][j]);
	                }
	            }
	        }
	        
	        return answer;
	    }
		public static void main(String[] args) {
			String name1[] = {"may", "kein", "kain", "radi"};
			String name2[] = {"kali", "mari", "don"};
			String name3[] = {"may", "kein", "kain", "radi"};
			
			int yearning1[] = {5, 10, 1, 3};
			int yearning2[] = {11, 1, 55};
			int yearning3[] = {5, 10, 1, 3};
			
			String[][] photo1 = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
			String[][] photo2 = {{"kali", "mari", "don"},{"pony", "tom", "teddy"}, {"con", "mona", "don"}};
			String[][] photo3 = {{"may"},{"kein", "deny", "may"}, {"kon", "coni"}};
			
			solution(name1, yearning1, photo1);	//[19, 15, 6]
			solution(name2, yearning2, photo2);	//[67, 0, 55]
			solution(name3, yearning3, photo3);	//[5, 15, 0]
			 
		}
}
