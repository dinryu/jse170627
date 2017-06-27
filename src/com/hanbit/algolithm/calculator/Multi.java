package com.hanbit.algolithm.calculator;

import java.util.Scanner;
public class Multi{
	public static void main(String[] args){
		System.out.print("Multi\n");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st Int?\n");
		int a=s.nextInt();
		System.out.print("Enter 2st Int?\n");
		int b=s.nextInt();
		int c=a*b;
		System.out.print("Result : "+c);
}
}