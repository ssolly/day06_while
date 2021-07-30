package day06_while;

public class Quiz05 {

	public static void main(String[] args) {
		
		/*
		 1. ���� �ݺ����� Ȱ���Ͽ� �������� ������ ���� ����ϼ���
		   2�� : 2x1=2 2x2=4 2x3=6 ... 2x9=18
		   3�� : 3x1=3 3x2=6 3x3=9 ... 3x9=27
		   ...
		   9�� : 9x1=9 9x2=18 9x3=27 ... 9x9=81
		 */
		
		for(int i=2; i<=9; i++) {
			System.out.print(i+"�� : ");
			for (int j=1; j<=9;j++) {
				System.out.print(i+"x"+j+"="+i*j+"  ");
			}
			System.out.println();
		}
		
		/*
		 2. ���� �ﰢ�� �����
		  *
		  **
		  ***
		  *****
		 */
		for(int i=1; i<5; i++) {
			for (int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 3. ���� ���ﰢ�� �����
		  *****
		  ****
		  ***
		  **
		  *
		 */
		for (int i=0;i<5;i++) {
			for (int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		/*
		 4. 1~1000������ ���� �� ����� ������ 6���� ���� ������ ����Ͻÿ�
		 */
		int cnt=0, total=0;
		for(int i=1; i<=1000; i++) {
			
			for (int j=1; j<=i;j++) {
				if (i%j==0) {
					cnt++;
				}
			}
			if (cnt==6) {
				total++;
				}
			cnt=0;
			}
		System.out.println(total);
		
		
		/*
		 5. 1~100������ �Ҽ��� ����ϼ���
		 */
		int count=0;
		for(int i=1; i<=100; i++) {
			for (int j=1; j<=i; j++) {
				if (i%j==0) {
					count++;
				}
			}
			if (count==2) {
				System.out.print(i+" ");
			}
			count=0;
		}
	}
}
