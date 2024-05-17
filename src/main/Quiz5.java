package main;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter 사용하여 텍스트 파일에 숫자 1~10중 짝수만 출력하세요
 * */

public class Quiz5 {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("num.txt");

//			fw.write(2);
//			fw.write(4);
//			fw.write(6);
//			fw.write(8);
//			fw.write(10);
			
//			
			for (int i = 2; i <= 10; i++) {
				if (i % 2 == 0) {
//					fw.write(i); // 숫자로 인식 -> 코드체계에 따른 문자변환, 숫자 2에 해당하는 문자 없어
					fw.write(i + ""); // 문자로 인식
				}
			}
			fw.flush(); // 버퍼 비우기 안하면 출력 X

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
