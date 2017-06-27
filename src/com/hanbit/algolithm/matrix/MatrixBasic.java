package com.hanbit.algolithm.matrix;

public class MatrixBasic{
	public static void main(String[] args){
		int[][] mtx = new int[3][5];
		for(int i=0;i<mtx.length;i++){			
			for(int j=0;j<mtx[i].length;j++){
				System.out.print(String.format("[%d,%d]",i,j));
			}
			System.out.print("\n");
		}
	}
}