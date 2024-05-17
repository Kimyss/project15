package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) {
		
		try {
//			입력 스트림 생성
			FileInputStream fis = new FileInputStream("input2.txt");
			
//			**한글 1byte 넘어가요 출력하면 깨져요 
			
			while(true) {
				int i = fis.read();		// 1바이트씩 읽기
				
				if(i == -1) {			//파일의 끝에 도달하면 read() -1 반환한다. 조건을 만족시켜 while문 탈출
					break;
				}
//				문자로 변환하여 출력
				System.out.println((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
