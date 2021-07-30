package day06_while;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i=0,sum=0;
		while(true) {
			System.out.print("숫자 입력(1-100) : ");
			i=sc.nextInt();
			if (i>=1 && i<=100) {
				break;
			}
			System.out.println("범위 오류! 다시 입력해 주세요!");
		}
		for (int j=1; j<i; j++) {
			sum+=j;
		}
		System.out.println("입력 받은 수까지의 합 : "+sum);
	}
}
