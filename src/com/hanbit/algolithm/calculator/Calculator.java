package com.hanbit.algolithm.calculator;

import java.util.Scanner;

public class Calculator{
     public static void main(String[] arge){
         Scanner op=new Scanner(System.in);
         
         System.out.print("========== Calculator ==========\n");
         System.out.print("1.Pluse 2.Minus 3.Multi 4.Divid \n" );
         System.out.print("=================================\n");
         System.out.print("Select Opcode?\n");
         int opcode = op.nextInt();

         Scanner num=new Scanner(System.in);             
         System.out.print("1st num?\n");
         int num1=num.nextInt();
         System.out.print("2st num?\n");
         int num2=num.nextInt();
         
         int result = 0;
		 if(opcode == 1){
            result = num1 + num2;
         } else if(opcode == 2){
            result = num1 - num2;
         } else if(opcode == 3){
            result = num1 * num2;
         } else if(opcode == 4){
            result = num1 / num2;
         } else{
            System.out.print("reselect opcode");
         }
         
         System.out.print("result = " + result);
   
}
}