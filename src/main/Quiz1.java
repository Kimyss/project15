package main;


import java.util.Arrays;
import java.util.Scanner;

/*
 * 5개크기의 정수형 배열 생성
 * Scanner를 사용하여 배열에 숫자 5개 입력 받으세요
 * 그리고 배열의 모든 요소의 합 구하세요
 * 
 * */

public class Quiz1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arrFive = new int[5];
		
		
		
		

//		arrFive[0] = sc.nextInt();
//		arrFive[1] = sc.nextInt();
//		arrFive[2] = sc.nextInt();
//		arrFive[3] = sc.nextInt();
//		arrFive[4] = sc.nextInt();
//
		for (int i = 0; i < arrFive.length; i++) {
			arrFive[i] = sc.nextInt();
		};
		
//		참고: 배열출력 메소드 있어야 출력개능
		System.out.println(Arrays.toString(arrFive));
		
		int sum = 0;
		for(int i = 0; i<arrFive.length; i++) {
		sum = arrFive[i] + sum;
		};
			System.out.println(sum);

	}

}
