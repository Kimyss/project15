package main;
/*
 *	Scanner 사용하여 두자리 정수 입력 받으세요
 *	십의자리와 일의자리 합 구하세요
 * */

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두자리 정수 입력 : ");
		int i = sc.nextInt();
		
		int sum = 0;
		sum = (i % 10) + (i / 10);
		System.out.println("십의자리와 일의자리의 합 = " +sum);
		
		

	}

}
