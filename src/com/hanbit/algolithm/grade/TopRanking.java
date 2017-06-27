package com.hanbit.algolithm.grade;

import java.util.Scanner;
public class TopRanking{
	public static void main(String[] args){
		/*입력받은 length 가 동적인 array을 선언하세요.
		그리고 그 수만큼 for loop 이 돌고 점수를 입력 받아
		현재는 1등 점수와 꼴찌 점수를 구하세요. */
		Scanner sc = new Scanner(System.in);
		int sum=0, avg=0, max=0, min=0, stAvg=0;
        System.out.print("1반의 총 학생수는 몇명?\n");
		int count = sc.nextInt();
        		
		int[] avgarr = new int[count];
		for(int i=0;i<avgarr.length;i++){
			System.out.print(i+1+"학생의 평균점수 입력?\n");
		    stAvg = sc.nextInt();
			avgarr[i] = stAvg;
		}
		
		for(int i=0;i<avgarr.length;i++){
			sum+=avgarr[i];
			avg=sum/count;
			if(i == 0){
			   max = avgarr[0];
		       min = avgarr[0];
			}else  if(max < avgarr[i]){
				max = avgarr[i];		
			}else if(min > avgarr[i]) { 
			    min = avgarr[i];
			}			
		}				
        System.out.println("1반의 평균점수는? "+avg);
        System.out.println("최대 점수는? "+max);
        System.out.println("최소 점수는? "+min);
	}
}
