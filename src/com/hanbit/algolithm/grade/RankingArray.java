package com.hanbit.algolithm.grade;

import java.util.Scanner;
public class RankingArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		System.out.println("*** 성적 랭킹 ***");
		int[] arr = new int[3];
		String[] names=new String[3];
		
		for(int i=0;i<3;i++){
			System.out.println(i+"번째 이름 입력? ***");
			names[i] =sc.next();
			System.out.println(i+"번째 점수 입력? ***");
			arr[i] =sc.nextInt();
		}
		
		/*가장 큰 값부터 작은 순으로 나열하는 statement를 완성하시오
		예) a=4, b=7, c=1을 입력시 7,4,3 순 출력 */
		int[] num = new int[3];
		String[] name= new String[3];
		if(arr[0] > arr[1] && arr[0] > arr[2]){
			num[0] =arr[0];
			name[0]=names[0];
			if(arr[1]>arr[2]){
				num[1] = arr[1];
				name[1] = names[1];
                num[2] = arr[2];
                name[2] = names[2];				
			}else{
				num[1] = arr[2];
				name[1] = names[2];
				num[2] = arr[1];
				name[2] = names[1];
			}		
		}else if(arr[1]> arr[0] && arr[1] > arr[2]){
			num[0] = arr[1];
			name[0] = names[1];
			if(arr[0]>arr[2]){
				num[1] = arr[0];
				name[1] = names[0];
				num[2] = arr[2];
				name[2] = names[2];
			}else{
				num[1] = arr[2];
				name[1] = names[2];
				num[2] = arr[0];
				name[2] = names[0];
			}		
		}else{
			num[0] = arr[2];
            name[0] = names[2];			
			if(arr[0]>arr[1]){
				num[1] = arr[0];
				name[1] = names[0];
				num[2] = arr[1];
				name[2] = names[1];
			}else{
				num[1] = arr[1];
				name[1] = names[1];
				num[2] = arr[2];
				name[2] = names[2];
			}
		}
		System.out.println(String.format("1등:%s %d 2등:%s %d 3등:%s %d",
		                   name[0],num[0],name[1],num[1],name[2],num[2]));
	}
}
