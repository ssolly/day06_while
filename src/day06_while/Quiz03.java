package day06_while;

public class Quiz03 {

	public static void main(String[] args) {
		
		/*
		 1. �� 100���� ����Ǿ� �ִ� â�� �ϼ� 1���� �㰡 �ִ�.
		    �� �Ѹ����� �Ϸ翡 20g�� ���� �԰�, 10��(10,20,30)���� ���� ���� 2�辿 �����Ѵ�.
		    ��ĥ ���� â���� ���� ��� ���� ���̰� �ɱ�? �׸��� ��� �� ����ΰ�?
		    (�� ����=1kg, ������ ���� ���� �Ŀ� �㰡 2�� �����ϴ� ����)
		 */
		int mouse, rice, day;
		
		
		
		/*
		 2. �� ���� �ּ� ������� �ִ� ������� ���ϴ� ���α׷��� �ۼ��Ͽ���
		 */

		/*���۸� 1. https://choseongho93.tistory.com/135
		int num1,num2,max=0,min=0,n=2;
		num1=28; num2=16;
		for (;n<=num1 && n<=num2; ) {
			if (num1%n==0 && num2%n ==0) {
				min=n;
			}
			n++;
		}
		max = num1+num2/min;	//�ּ� ����� ���ϴ� ��
		System.out.println("�ּ� ����� : " + max);
		System.out.println("�ִ� ����� : " + min);
		*/
		
		// ���۸�2 https://kimdevel.tistory.com/39
		//�ּҰ����
		int n1,n2,max,resMin=0;
		n1=28; n2=16;
		if (n1>=n2) {
			max=n1;
		} else {
			max=n2;
		}
		
		for (int i=max; i>=max; i++) {
			if (i%n1==0 && i%n2==0) {
				resMin=i;
				break;
			}
		}
		System.out.println("�ּҰ���� : "+resMin);
		//�ִ� �����
		int min, resMax=0;
		if (n1<=n2) {
			min=n1;
		} else {
			min=n2;
		}
		
		for (int i=1; i<=min; i++) {
			if(n1%i==0 && n1%i==0) {
				resMax=i;
			}
		}
		System.out.println("�ִ����� : " + resMax);
		System.out.println();
		
		
		/*
		 3. � ���� ����� ���ϴ� ���α׷��� �ۼ��Ͽ���
		 */
		int num,divisor;
		num=8;
		System.out.print("��� : ");
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				divisor=i;
				System.out.print(divisor + " ");
			}
		}
		System.out.println("\n");
		
		/*
		 4. 1���� 1000������ �ڿ��� �߿��� 4�� ����� 6���� ����� �������� 1�� ���� ���� ����϶�
		 */
		int sum=0;
		for (int i=1; i<=1000; i++) {
			if (i%4==1 && i%6==1) {
				sum+=i;
			}
		}
		System.out.println("�� : "+sum);
	}
}
