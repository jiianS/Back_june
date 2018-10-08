package Back_step1;

import java.util.Scanner;

/**
 * 한수구하기
 * 자리수의 값이 등차수열 : 한수
 * 1~99 : 는 한수지롱
 * 1~n까지 숫자를 증가시키면서 각 자리수가 등차수열인지 확인하기
 * 그 갯수를 count 해서 1~n 사이의 한수가 몇개인지 구하기
 * */

public class no1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 내가 구하고자하는 N (1 < 1000
		int cnt = 99;			// 1-n사이의 한수의 갯수(어차피 99까지는 한수니까 고정시킴)
        
		int[] num;				// 각자리의 숫자들을 배열로 넣으려고 한다
		
		if(n > 100) {
			for(int i=100; i <= n;  i++) {
				num  = new int[] {i/100, (i%100)/10, i%10};
				// 100자리 숫자 -> i /100
				//  10자리 숫자 -> (i % 100)/10 (나머지 값에서 10 나누면 됨!)
				//	 1자리 숫자 -> i % 10
				
				if(num[1] - num[0] == num[2]- num[1]) {
					cnt++;
				}
			}
			
		}else if(n < 99) {
			cnt = n;	// 1~99는 등차수열이니까 입력한 n값 그대로 출력
		}
		
		System.out.println(cnt);
    }
}
