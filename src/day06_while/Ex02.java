package day06_while;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i=0,sum=0;
		while(true) {
			System.out.print("���� �Է�(1-100) : ");
			i=sc.nextInt();
			if (i>=1 && i<=100) {
				break;
			}
			System.out.println("���� ����! �ٽ� �Է��� �ּ���!");
		}
		for (int j=1; j<i; j++) {
			sum+=j;
		}
		System.out.println("�Է� ���� �������� �� : "+sum);
	}
}
