package day06_while;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1. 1-10 ������ ���ڸ� �Է� �޾� 1���� �Է� ���� �������� ���� ���Ͻÿ�
		int num,sum=0;
		while(true) {
			System.out.print("1-10 ������ ���� �Է� : ");
			num=sc.nextInt();
			if (num>0 && num<=10) {
				break;
			}
			System.out.println("���� ����! �ٽ� �ۼ��� �ּ���");
		}
		for (int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println(num+"������ �� : "+sum);
		System.out.println();
		
		// 2. 10-20 ������ ���ڸ� �Է� �޾� 1���� �Է� ���� �������� ���� ���Ͻÿ�
		int num1; sum=0;
		while(true) {
			System.out.print("10-20 ������ ���� �Է� : ");
			num1=sc.nextInt();
			if (num1>=10 && num1<=20) {
				break;
			}
			System.out.println("���� ����! �ٽ� �ۼ��� �ּ���");
		}
		for (int i=1; i<=num1; i++) {
			sum+=i;
		}
		System.out.println(num1+"������ �� : "+sum);
		
	}
}
