package com.hanbit.algolithm.member;

import java.util.Scanner;
public class SSN{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력\n");
		String name = sc.next();
		System.out.print("주민번호 입력\n");
		String ssn = sc.next();
		
		//String sYear=ssn.substring(0,2); //아래로 옮김
		int year = Integer.parseInt(ssn.substring(0,2));
		//int age =0;
		//int gap =17-year;//나이구하는 공식으로 옮김
		
		/*
		if(gap>=0){
			age=2017-(year+2000);
		}else{
			age=2017-(year+1900);
		}
		*/
		//age=((17-year)>=0) ? 2017-(year+2000) : 2017-(year+1900); //아래 출력으로 옮김
		
		char ch = ssn.charAt(7);		
		String gender = "";
		
		switch(ch){
			case '1': case '3':
			    gender = "남";
			break;
			case '2': case '4':
			    gender = "여";
			break;
			case '5': case '6':
			    gender = "외국인";
			break;
			default:
			    gender = "외계인";
				break;
		}
		
		System.out.print("*************************\n");
		System.out.print("* 이름     나이   성별  *\n");
		System.out.print("-------------------------\n");		
		System.out.print(
		       String.format("* %s |   %d |   %s   |\n",name,2017-(year+1900),gender));
		System.out.print("**************************\n");
	}
	
}