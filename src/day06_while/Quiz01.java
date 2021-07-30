package day06_while;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1. 1-10 사이의 숫자만 입력 받아 1부터 입력 받은 수까지의 합을 구하시오
		int num,sum=0;
		while(true) {
			System.out.print("1-10 사이의 숫자 입력 : ");
			num=sc.nextInt();
			if (num>0 && num<=10) {
				break;
			}
			System.out.println("범위 오류! 다시 작성해 주세요");
		}
		for (int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println(num+"까지의 합 : "+sum);
		System.out.println();
		
		// 2. 10-20 사이의 숫자만 입력 받아 1부터 입력 받은 수까지의 합을 구하시오
		int num1; sum=0;
		while(true) {
			System.out.print("10-20 사이의 숫자 입력 : ");
			num1=sc.nextInt();
			if (num1>=10 && num1<=20) {
				break;
			}
			System.out.println("범위 오류! 다시 작성해 주세요");
		}
		for (int i=1; i<=num1; i++) {
			sum+=i;
		}
		System.out.println(num1+"까지의 합 : "+sum);
		
	}
}
