package day06_while;

public class Quiz02 {

	public static void main(String[] args) {
		
		/* 
		 1. 첫날에 1원을 예금하고, 다음날에는 전날에 2배씩 증가하는 방식이다.
		    30일째 되는 날 예금해야하는 금액을 구하시오
		 */
		int day,money,total;
		day=31;  money=1;  total=0;
		for (int i=1; i<=day; i++) {
			total+=money;
			if (i==30) {
				System.out.println("예금액 : "+money);
				System.out.println("누적 금액 : "+total);
			}
			money*=2;
		}
		System.out.println();
		
		/*
		 2. 1-1000까지의 합을 구하시오
		    단, 3의 배수는 제외하고 3의 배수이면서 5의 배수는 제외하지 않는 조건으로 구하시오
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
		System.out.println("합 : " + sum);
		System.out.println();
		
		/*
		 3. 1부터 시작하여 홀수의 합을 구하면서 그 합이 10000을 넘지 않는 마지막 수를 구하는 프로그램을 작성하시오
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
		System.out.println("마지막 숫자 : "+lastNum);
		System.out.println("누적 합 : "+sum);
		
		
		
		
		
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
		System.out.println("30일 째 예치 금액 : " + won);
		*/
		/* 2.
		int i, sum=0, sum1=0;
		for (i=1; i<=1000; i++) {
			if (i%3==0 && i%5!=0) {		
				sum1+=i;
			}
			sum+=i;
		}
		sum=sum-sum1;		//총합에서 순수한 3의 배수만 빼주기
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
		i--;	//for문 마지막 증감식을 사용했기 떄문에 -를 해줘야 한다.
		System.out.println(i + " : " + sum);
		*/
	}
}
