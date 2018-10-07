package Back_step1;

import java.util.Scanner;

public class no4344 {
	//평균값 넘는 애들의 학생들의 비율(소수점셋째자리)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();	// test case 갯수?
		int n, sum, cnt;			
		// 'n'(각 case별 학생수), 'sum' 각 케이스별 합계, 'cnt' 평균넘는 학생들 수
		double avg;				// 케이스별 평균 값
		int[] score = new int[1000]; // 각 줄별 스코어받기(테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수_
		double[] rate = new double[c];	
		
		
		// case갯수만큼 각 값들 입력받기
		for(int i=0; i < c; i++) {
			n = sc.nextInt();			// n만큼 점수 입력하기(배열에 입력)
			sum = 0;
			cnt = 0;
			
			if(n < 1 || n > 1000) {
				System.out.println("테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)");
				break;
			}
			
			for(int j=0; j<n; ++j) {
				score[j] = sc.nextInt();
				if(score[j] < 0 || score[j] >100) {
					System.out.println("점수는 0-100점사이");
					break;
				}
				sum += score[j];	// 각 점수 더하기
			}
			avg = (double)sum / n ;
			
			//평균 넘는 애들 확인하기
			for(int k = 0; k < score.length; k++) {
				if(score[k] > avg ) {
					cnt++;
				}
			}
			System.out.println(avg+" : "+ cnt);
			
			rate[i] =(double)  cnt/ n * 100;
			System.out.println(rate[i]);
		}
		
		for(int i=0; i<rate.length; i++) {
			System.out.printf("%.3f", rate[i]);
			System.out.println("%");
		}
		
		sc.close();
	}
}
