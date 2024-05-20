package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 다운로드 폴더 파일 목록 읽어서
 * 텍스트 파일에 출력
 * */

public class Quiz8 {

	public static void main(String[] args) throws IOException {
//		파일클래스 + 출력스트림요망

//		다운로드 폴더와 연결된 파일 클래스 생성
		File dir = new File("C:\\Users\\G201\\Downloads");

//		폴더 밑에 있는 파일 목록 읽어오기
		File[] files = dir.listFiles();

//		출력 스트림 생성
		FileWriter fw = new FileWriter("quiz8.txt");

		for (int i = 0; i < files.length; i++) {
//			
			File file = files[i];
			String filename = file.getName();
			fw.write(filename);
			fw.write("\n");
		}
		fw.flush();

	}
}
