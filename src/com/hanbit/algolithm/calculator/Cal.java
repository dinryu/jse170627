package com.hanbit.algolithm.calculator;

import java.util.Scanner;

public class Cal{
	public static void main(String[] args){
		System.out.print("계산기\n");
		Scanner s=new Scanner(System.in);
		//String name = s.next();
		//double dollar=s.nextDouble();
		System.out.print("첫번째 숫자 입력\n");
		int a = s.nextInt();
		System.out.print("두번째 숫자 입력\n");
		int b = s.nextInt();
		int c=a+b;
		System.out.print("더하기 결과:"+c+"\n");
		
		System.out.print("세번째 곱하기 입력\n");
		int d = s.nextInt();
		int e = c*d;
		System.out.print("곱하기 결과:"+e+"\n");
		
		System.out.print("네번째 나누기 입력\n");
		int f = s.nextInt();
		int g = e/f;
		System.out.print("나누기 결과:"+g+"\n");
		
		System.out.print("다섯번째 빼기 입력\n");
		int h = s.nextInt();
		int i = g-h;
		System.out.print("빼기 결과:"+i+"\n");
		
		System.out.print("여섯번째 나머지 입력\n");
		int j = s.nextInt();
		int k = i-j;
		System.out.print("나머지 결과:"+k);
	}
}