package com.hanbit.algolithm.sequence;

public class EvenSum{
	public static void main(String[] args){
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=i+1;
		}
		int sum =0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] % 2 == 0){
				sum+=arr[i];			
				System.out.print(arr[i]+"\n");
			}
		}
		System.out.print("짝수의 합:"+sum);
	}
}