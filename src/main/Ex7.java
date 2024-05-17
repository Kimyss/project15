package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex7 {

	public static void main(String[] args) {
		
		try {
//			출력스트림 생성
			FileOutputStream fos = new FileOutputStream("input.txt");
			
//			배열 생성
			byte[] arr = {65, 66, 67};		// 1바이트씩 쓰면 ? 3번 배열을 쓰면? 1번
			
//			배열을 사용하여 내용 쓰기 , 배열의 모든 내용을 한번에 출력
			fos.write(arr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
