package com.hanbit.algolithm.grade;

import java.util.Scanner;
public class Ranking{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 성적 랭킹 ***");
		System.out.println("*a 학생 점수 ? ***");
		int a =sc.nextInt();
		System.out.println("*a 학생 점수 ? ***");
		int b =sc.nextInt();
		System.out.println("*a 학생 점수 ? ***");
		int c =sc.nextInt();
		
		/*가장 큰 값부터 작은 순으로 나열하는 statement를 완성하시오
		예) a=4, b=7, c=1을 입력시 7,4,3 순 출력 */
		int big =0;
		int num1=0,num2=0,num3=0;
		if(a > b && a > c){
			num1 =a;
			if(b>c){
				num2 = b;
                num3 = c;				
			}else{
				num2 = c;
				num3 = b;
			}		
		}else if(b > a && b > c){
			num1 = b;
			if(a>c){
				num2 = a;
				num3 = c;
			}else{
				num2 = c;
				num3 = a;
			}		
		}else{
			num1 = c;
			//String str = a>b ? num2=a,num3=b : num2=b,num3=c;
			
			if(a>b){
				num2 = a;
				num3 = b;
			}else{
				num2 = b;
				num3 = c;
			}
			
		}
		System.out.println("1등: "+num1+">2등: "+num2+">3등: "+num3);
	}
}