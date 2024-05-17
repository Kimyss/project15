package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 다운로드 폴더에 있는 파일의 목록 읽어서 텍스트 파일에 출력
 * 만약 하위 폴더 있다면 하위 폴더의 파일 목록도 출력
 * 제귀함수 활용요망(예시: 팩토리얼)
 * */
public class Quiz9 {
	
	public static void main(String[] args) throws IOException {

		File dir =new File("C:\\Users\\G201\\Downloads");
		
		File [] files = dir.listFiles();
		
		FileWriter fw = new FileWriter("quiz9.txt");
		
		
		
	
    

    }
}
		
