package codingTestPractice.Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public interface 대충만든자판 {
	public static int[] solution(String[] keymap, String[] targets) {
		 int[] answer = new int[targets.length];
			Map<String, Integer> map = new HashMap<>();
			
			Arrays.stream(keymap).forEach(
						key -> {
							String[] keys = key.split("");
							Arrays.stream(keys).forEach(
										k -> {
											int n = key.indexOf(k)+1;
											if(map.get(k) == null || map.get(k) > n) {
												map.put(k, n);										
											}
										}
									);
							}
					);
			Arrays.stream(targets).forEach(
						target -> {
							int i = 0;
							String[] tg = target.split("");
							Stack<Integer> st = new Stack<>();
							Arrays.stream(tg).forEach(
										t -> 
											st.push(map.get(t))
									);
							for(String a : tg) {
								int n = st.pop();
								System.out.println(n);
//								if(n == -1) {
//									answer[i] = -1;
//									break;
//								}
								
								answer[i] += n;
							}
							i++;
							System.out.println("--------------");
						}
					);
			System.out.println(answer[0]);
			System.out.println(answer[1]);
	        return answer;
    }
	public static void main(String[] args) {
		String[] farr1 = {"ABACD", "BCEFD"};	//keymap
		String[] farr2 = {"ABCD","AABB"};	//targets
		
		String[] sarr1 = {"AA"};
		String[] sarr2 = {"B"};
		
		String[] tarr1 = {"AGZ", "BSSS"};
		String[] tarr2 = {"ASA","BGZ"};
		solution(farr1, farr2);
	}
}
