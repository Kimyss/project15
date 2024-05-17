package main;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
//		표준입력을 인자로 사용하여 Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
//		Scanner 껍데기(부가적기능의 클래스)
//		인자 -> (System.in): 표준입력을 통해 받아옴
		
//		문자열 입력받기
		System.out.println("이름: ");
		String name = scanner.nextLine();

//		숫자 입력받기
		System.out.println("나이: ");
		int age = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(age);
		
		scanner.close();
	}

}
