package com.hanbit.algolithm.calculator;

import java.util.Scanner;

public class Divide{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("첫 값?");
int a=s.nextInt();
System.out.println("둘 값?");
int b=s.nextInt();
int c=a/b;
System.out.print("나누기 결과값:"+c);

}
}