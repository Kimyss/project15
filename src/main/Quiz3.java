package main;

import java.util.Scanner;

/*
 * Scanner 사용하여 문자열을 계속 입력 받으세요
 * while 루프를 사용하여 입력 계속 받고
 * 입력된 문자열 "STOP"이면 루프종료
 * 단, stop 대소문자 구분없어
 * */

public class Quiz3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = " ";
		while(true) {
			System.out.println("문자입력하세요");
			str = sc.nextLine();
			
			if(str.equalsIgnoreCase("STOP")) {
				break;
			}
		}
			
			
			System.out.println(str);
		
		
//		참고) 반복문만들기
//		for문: 횟수 명확시
//		while문: 횟수 X
	}
	

}
