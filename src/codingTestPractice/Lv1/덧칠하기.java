package codingTestPractice.Lv1;

public class 덧칠하기 {
	//벽 면적, 롤러 길이, 칠해야 하는 구역
	public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int paint = 0;

        for(int num : section) {
        	if(paint < num) {
            	paint = num+m-1;
            	answer++;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[] arr1 = {2, 3, 6};
		int[] arr2 = {1, 3};
		int[] arr3 = {1, 2, 3, 4};
		
		System.out.println(solution(8,4,arr1));	//2
		System.out.println(solution(5,4,arr2));	//1
		System.out.println(solution(4,1,arr3));	//4
	}
}