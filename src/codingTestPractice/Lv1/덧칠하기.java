package codingTestPractice.Lv1;

//칠해야하는 구역의 처음과 끝의 차이 구하고
// 롤러의 길이로 나누기
//롤러의 길이와 차기가 

//배열을 하나씩 돌면서 차이구하고, 그 차이를 롤러의 길이에서 하나씩 줄이기

public class 덧칠하기 {
	//벽 면적, 롤러 길이, 칠해야 하는 구역
	public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int cnt = m;
        int sub = 0;
        
        for(int i=1; i<section.length; i++) {
        	sub = section[i] - section[i-1];	//1,2 값의 차이
        	cnt += sub;
        }
        answer = cnt/m;
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