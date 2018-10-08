package Back_step1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// test case 갯수?
		int rsltCnt = 0;
        
        for(int j = 1; j <= n; j++)  {
             
            // 각각의 자릿수의 차를 dff에 저장한 후, 그 차가 일정한지 확인한다.
            String stringj = Integer.toString(j);
            int length = stringj.length();
            int num1 = Integer.parseInt(stringj.substring(0, 1));
            int dff = 10;
             
            boolean isOK = true;
            for(int i = 1; i < length; i++)  {
                int num2 = Integer.parseInt(stringj.substring(i, i+1));
                 
                if(dff == 10)   {
                    dff = num2 - num1;
                }else   {
                    if(dff != (num2 - num1))    {
                        isOK = false;
                        break;
                    }
                }  
                num1 = num2;
            }
             
            if(isOK){
                rsltCnt++;
            }
        }
        System.out.println(rsltCnt);
    }
}