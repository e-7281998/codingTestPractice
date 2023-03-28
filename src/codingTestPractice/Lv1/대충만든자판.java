package codingTestPractice.Lv1;

public interface 대충만든자판 {
	public static int[] solution(String[] keymap, String[] targets) {
		int[] answer = {};
		
		for(int i=0; i<targets.length; i++) {
			String[] target = targets[i].split("");
			
			for(String s: target) {
				int min=1;
				for(String key: keymap) {
					
					int find = key.indexOf(s) +1;
					
					min = Math.min(find, min);
				}
				answer[i] += min;
			}
			System.out.println(answer);
		}
		
        return answer;
    }
	public static void main(String[] args) {
		String[] farr1 = {"ABACD", "BCEFD"};	//keymap
		String[] farr2 = {"ABCD","AABB"};	//targets
		
		String[] sarr1 = {"AA"};
		String[] sarr2 = {"B"};
		
		String[] tarr1 = {"AGZ", "BSSS"};
		String[] tarr2 = {"ASA","BGZ"};
		
		System.out.println(solution(farr1, farr2));
	}
}
