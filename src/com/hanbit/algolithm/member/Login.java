package com.hanbit.algolithm.member;

import java.util.Scanner;
public class Login{
	public static final String USER_ID="kim";
	public static final String USER_PASS="1";
	
	public static void main(String[] agrs){
		Scanner s=new Scanner(System.in);
		System.out.print("로그인\n");
				
		System.out.print("id를 입력하세요?\n");
		String id = s.next();
		System.out.print("pass를 입력하세요?\n");
		String pass = s.next();
        
		String message1 = "";
		String message2 = "";
		
        if(!id.equals(USER_ID)){
			message1 = "id 오류!!";
		}else if(!pass.equals(USER_PASS)){
			message2 = "pwss 오류!!";
		}else{
			message1 = "환영합니다...";
		}
        System.out.print(message1+message2);		
	}
}
