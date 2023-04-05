package codingTestPractice.silver;

import java.io.Console;
import java.util.Scanner;

public class 팩토리얼0의개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		
		while(num >= 5) {
			num /= 5;
			cnt+=num;
			System.out.println("num:"+num);
		}
		
		System.out.println(cnt);
	}
}
