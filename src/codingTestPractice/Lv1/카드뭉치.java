package codingTestPractice.Lv1;

public class 카드뭉치 {
	public static String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";
		int n1 = 0, n2 = 0;

		for (String str : goal) {
			if (n1 < cards1.length && cards1[n1].equals(str))
				n1++;
			else if (n2 < cards2.length && cards2[n2].equals(str))
				n2++;
			else {
				answer = "No";
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String cards1[] = {"i", "drink", "water"};
		String cards2[] = {"want", "to"};
		String goal[] = {"i", "want", "to", "drink", "water"};
		System.out.println(solution(cards1, cards2, goal));// "Yes"
		
		String cards11[] = {"i", "water", "drink"};
		String cards22[] = {"want", "to"};
		String goal2[] = {"i", "want", "to", "drink", "water"};
		System.out.println(solution(cards11, cards22, goal2));// "No"
		
	}
}
