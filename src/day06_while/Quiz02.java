package day06_while;

public class Quiz02 {

	public static void main(String[] args) {
		
		/* 
		 1. ù���� 1���� �����ϰ�, ���������� ������ 2�辿 �����ϴ� ����̴�.
		    30��° �Ǵ� �� �����ؾ��ϴ� �ݾ��� ���Ͻÿ�
		 */
		int day,money,total;
		day=31;  money=1;  total=0;
		for (int i=1; i<=day; i++) {
			total+=money;
			if (i==30) {
				System.out.println("���ݾ� : "+money);
				System.out.println("���� �ݾ� : "+total);
			}
			money*=2;
		}
		System.out.println();
		
		/*
		 2. 1-1000������ ���� ���Ͻÿ�
		    ��, 3�� ����� �����ϰ� 3�� ����̸鼭 5�� ����� �������� �ʴ� �������� ���Ͻÿ�
		 */
		int sum=0;
		for (int i=1; i<=1000; i++) {
			if (i%3==0) {
				if (i%5==0) {
					sum+=i;
				}
				continue;
			}
			sum+=i;
		}
		System.out.println("�� : " + sum);
		System.out.println();
		
		/*
		 3. 1���� �����Ͽ� Ȧ���� ���� ���ϸ鼭 �� ���� 10000�� ���� �ʴ� ������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		 */
		int lastNum=1; sum=0;
		for (lastNum=1; ;lastNum++) {
			if (lastNum%2!=0) {
				sum+=lastNum;
			}
			if (sum>=10000) {
				break;
			}
		}
		System.out.println("������ ���� : "+lastNum);
		System.out.println("���� �� : "+sum);
		
		
		
		
		
		//teacher
		/* 1.
		int won=0;
		for (int day=1; day<=30; day++) {
			if(day==1) {
				won=1;
			} else {
				won*=2;
			}
			System.out.println(day+" : " + won);
		}
		System.out.println("30�� ° ��ġ �ݾ� : " + won);
		*/
		/* 2.
		int i, sum=0, sum1=0;
		for (i=1; i<=1000; i++) {
			if (i%3==0 && i%5!=0) {		
				sum1+=i;
			}
			sum+=i;
		}
		sum=sum-sum1;		//���տ��� ������ 3�� ����� ���ֱ�
		System.out.println(sum);
		*/
		/* 3.
		int i=1,sum=0;
		for (;sum<=10000;i++) {
			if(i%2==1) {
				sum+=i;
			}
			//System.out.println(i + " : " + sum);
		}
		i--;	//for�� ������ �������� ����߱� ������ -�� ����� �Ѵ�.
		System.out.println(i + " : " + sum);
		*/
	}
}
