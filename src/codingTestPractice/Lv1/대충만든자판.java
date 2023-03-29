package codingTestPractice.Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public interface 대충만든자판 {
	public static int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];
		Map<String, Integer> map = new HashMap<>();

		Arrays.stream(keymap).forEach(key -> {
			String[] keys = key.split("");
			Arrays.stream(keys).forEach(k -> {
				int n = key.indexOf(k) + 1;
				if (map.get(k) == null || map.get(k) > n) {
					map.put(k, n);
				}
			});
		});

		for (int i = 0; i < targets.length; i++) {
			String[] tg = targets[i].split("");
			for(String k : tg) {
				if(!map.containsKey(k)) {
					answer[i] = -1;
					break;
				}
				answer[i] += map.get(k);
			}
		}
	        return answer;
	}

	public static void main(String[] args) {
		String[] farr1 = { "ABACD", "BCEFD" }; // keymap
		String[] farr2 = { "ABCD", "AABB" }; // targets

		String[] sarr1 = { "AA" };
		String[] sarr2 = { "B" };

		String[] tarr1 = { "AGZ", "BSSS" };
		String[] tarr2 = { "ASA", "BGZ" };
		
		solution(farr1, farr2);
		solution(sarr1, sarr2);
		solution(tarr1, tarr2);
	}
}
