package com.hanbit.algolithm.calculator;

import java.util.Scanner;
public class Calculator2{
	public static void main(String[] args){
		System.out.print("====== Calculator ======\n");
        Scanner sw=new Scanner(System.in);
				
		System.out.print("Enter 1st number?\n");
		int num1 = sw.nextInt();
		System.out.print("Select Opcode(+,-,*,/)?\n");
        String opcode=sw.next();
		System.out.print("Enter 2st number?\n");
		int num2 = sw.nextInt();
	
	    int result =0;
		if(opcode.equals("+")){
            result = num1 + num2;
         } else if(opcode.equals("-")){
            result = num1 - num2;
         } else if(opcode.equals("*")){
            result = num1 * num2;
         } else if(opcode.equals("/")){
            result = num1 / num2;
         } else{
            System.out.print("opcode error!!!");
         }        
         //SysDtem.out.print("result: "+num1+opcode+num2+"="+result);   
         System.out.print(String.format("%d %s %d = %d",num1,opcode,num2,result));   
	}	
}
