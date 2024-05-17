package main;
/*
 * FileWriter로 구구단
 * */

import java.io.FileWriter;
import java.io.IOException;

public class Quiz6 {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("GuGuDan.txt");
			
			for(int i = 2; i <= 9; i++) {
				fw.write("---" + i + "단 ---" + "\n");
				for(int j = 1; j <= 9; j++) {
					fw.write(i + "*" + j + " = "+ i * j + "\n");
				}
				fw.write("\n");
			}
			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
