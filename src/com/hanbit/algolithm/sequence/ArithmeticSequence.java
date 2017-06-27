package com.hanbit.algolithm.sequence;

import java.util.Scanner;
public class ArithmeticSequence{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요(전체 출력은 0 입력)?\n");
		int k= sc.nextInt();
		if (k == 0){
		    for(int i=1;i<10;i++ ){
				for(int j=2;j<10;j++ ){
				System.out.print(j+"x"+i+"="+j*i+"\t");
				}
				System.out.print("\n");
			}
		}
		else {
			for(int i=1;i<10;i++){
				System.out.print(k+"x"+i+"="+k*i+"\n");
			}
		}			
	}
}
