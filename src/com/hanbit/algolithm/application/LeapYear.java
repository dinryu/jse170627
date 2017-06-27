package com.hanbit.algolithm.application;

/*연도를 4로 나눈 값이 0이라면 윤년일 수 있다.
그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
2000년은 4로 나눈값이 0이라서 윤년일 수 있는데...
다시 이 값이 100으로 나눠 떨어지면 평년이다.
평년이라 해도 다시 400으로 나눠 털어지는 연도는 윤년이다.
예시)2000년과 2016년을 입력하면 윤년으로 나오도록 하세요.
*/
import java.util.Scanner;
public class LeapYear{
	public static void main(String[] agrs){
		Scanner scanner = new Scanner(System.in);
		System.out.print("년도를 입력하세요?\n");
		int year = scanner.nextInt();
		
		int remainder1 = year % 4;
		int remainder2 = year % 100;
		int remainder3 = year % 400;
		
		System.out.println(remainder1);
		System.out.println(remainder2);
		System.out.println(remainder3);
		
		String msg = "";
		
		if(remainder1 == 0 && remainder2 != 0){
			msg = "윤년입니다";
		}else if(remainder2 == 0 && remainder3 == 0){
			msg = "윤년입니다";
		}else {
			msg = "평년입니다";
		}
		System.out.print(msg);
		
	}
}