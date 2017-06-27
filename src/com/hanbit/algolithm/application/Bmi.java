package com.hanbit.algolithm.application;

import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){
		Scanner value = new Scanner(System.in);
		System.out.print("Enter Height\n");
		double h = value.nextDouble()/100;
		System.out.print("Enter Weight\n");
		double w = value.nextDouble();
		
		double result = 0;
		String bmi ="BMI";
		
		result = w/(h*h);
		
		/*if(result < 18.5){
			bmi = "(lowWeight)";
		}else if(result >=18.5 && result <= 24.9){
			bmi = "(stanWeight)";			
		}else if(result >= 25.0 && result <= 29.9){
			bmi = "(overWeight)";
		}else if(result >= 30){
			bmi = "(heavy)";
		}else {
			System.out.print("error");
		}*/

		if(result < 18.5){
			bmi = "(lowWeight)";
		}else if(result <= 24.9){
			bmi = "(stanWeight)";			
		}else if(result <= 29.9){
			bmi = "(overWeight)";
		}else if(result >= 30){
			bmi = "(heavy)";
		}else {
			System.out.print("error");
		}
		System.out.print("BMI ="+result+bmi+"입니다");
	}
}