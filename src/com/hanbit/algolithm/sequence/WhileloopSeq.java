package com.hanbit.algolithm.sequence;

public class WhileloopSeq{
	public static void main(String[] agrs){
		int sum=0, i=0;
		/*
		for(int i=0;i<10;i++){
			sum+=i;			
		}
		*/
		
		while(i<10){
			sum+= i;
			i++;
		}
			
		System.out.print("sum="+sum);
	}
}
