package main;

import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) {

//		표준 출력으로 화면에 내용 출력하기
		System.out.println("안녕하세요");

//		표준 입력으로 문자 입력받기
		System.out.println("알파벳 하나를 쓰고 [Enter] 누르세요");

//		문자를 입력받아 변수에 값을 저장
		try {
			int i = System.in.read(); 		// a 입력 
//			Unhandled exception type IOException 예외처리 반드시 예외처리 하세요 미리하세요

//			read() 메소드(함수)는 입력받은 값을 *바이트*로 저장하기 때문에 아스키드로 출력
			System.out.println("형변환x " + i); 			// a -> 97
			
//			문자로 사용시 형변환 필요
			System.out.println("형변환: " + (char)i);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
//		형변환 필요 등 불편해요 scanner가 좀 더 수월한편

//		Out 출력
//		in 입력

	}

}
