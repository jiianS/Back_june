package Back_step1;

import java.util.Scanner;

public class no1924 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int mon = sc.nextInt();
		int day = sc.nextInt();
		int cnt = 0;
		
		int[] month ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//  mon - 1 까지 해야 내가 입력한 달 이전까지의 일수를 알 수 있다. -> 나중에 요일값 계산위함
		
		for(int i = 0; i < mon-1; i++) {
			cnt += month[i];
		}
		cnt += day;
		
		// "day" if [3 24]인경우 1,2월의 일수 합한 값,(cnt에, day(그 달의 일수)더하면
		// "total day" 값이 구해짐 ( 31 + 28 = 59(cnt) + 24(day) = 83
		//  이 때, 1월1일이 월요일이기때문에 , 83 % 7 -> 6 : 토요일( 스위치문으로 작성)
		
		System.out.println(cnt % 7);
		switch (cnt % 7) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WEN");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 0:
			System.out.println("SUN");
			break;
		}
		
		sc.close();
	}

}
