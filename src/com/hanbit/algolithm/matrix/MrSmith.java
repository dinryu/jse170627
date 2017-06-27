package com.hanbit.algolithm.matrix;

public class MrSmith{
	public static void main(String[] args){
		//int[][] mtx = new int[4][5];
		//mtx[2][3] = 5;
		String[][] mtx={{"Good morning","Good afternoon","Good bye"},
		{"Mr.","Mrs.","Miss","My"},
		{"smith","alex","john","james"}
		};
		// good afternoon Mr. james
		System.out.print(mtx[0][1]+"\t"+mtx[1][0]+"\t"+mtx[2][3]);
	}
}