package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*	
 * FileOutputStream 사용하여 텍스트파일에
 * 문자 A~Z까지 1바이트씩 출력하세요
 * */
public class Quiz4 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("output3.txt");

//			fos.write('A'); // 65
//			fos.write('B');	// 66
//			fos.write('C');	// 67	
//			fos.write('D');	// ...

//			시작! 'A'의 아스키 값
			for (int i = 65; i <= 90; i++) {
				fos.write(i); // A - Z 출력
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
