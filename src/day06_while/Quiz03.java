package day06_while;

public class Quiz03 {

	public static void main(String[] args) {
		
		/*
		 1. 쌀 100통이 저장되어 있는 창고에 암수 1쌍의 쥐가 있다.
		    쥐 한마리가 하루에 20g씩 쌀을 먹고, 10일(10,20,30)마다 쥐의 수가 2배씩 증가한다.
		    며칠 만에 창고의 쌀이 모두 쥐의 먹이가 될까? 그리고 쥐는 총 몇마리인가?
		    (쌀 한통=1kg, 순서는 쌀을 먹은 후에 쥐가 2배 증가하는 조건)
		 */
		int mouse, rice, day;
		
		
		
		/*
		 2. 두 수의 최소 공배수와 최대 공약수를 구하는 프로그램을 작성하여라
		 */

		/*구글링 1. https://choseongho93.tistory.com/135
		int num1,num2,max=0,min=0,n=2;
		num1=28; num2=16;
		for (;n<=num1 && n<=num2; ) {
			if (num1%n==0 && num2%n ==0) {
				min=n;
			}
			n++;
		}
		max = num1+num2/min;	//최소 공배수 구하는 식
		System.out.println("최소 공배수 : " + max);
		System.out.println("최대 공약수 : " + min);
		*/
		
		// 구글링2 https://kimdevel.tistory.com/39
		//최소공배수
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
		System.out.println("최소공배수 : "+resMin);
		//최대 공약수
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
		System.out.println("최대공약수 : " + resMax);
		System.out.println();
		
		
		/*
		 3. 어떤 수의 약수를 구하는 프로그램을 작성하여라
		 */
		int num,divisor;
		num=8;
		System.out.print("약수 : ");
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				divisor=i;
				System.out.print(divisor + " ");
			}
		}
		System.out.println("\n");
		
		/*
		 4. 1에서 1000까지의 자연수 중에서 4로 나누어도 6으로 나누어도 나머지가 1인 수의 합을 출력하라
		 */
		int sum=0;
		for (int i=1; i<=1000; i++) {
			if (i%4==1 && i%6==1) {
				sum+=i;
			}
		}
		System.out.println("합 : "+sum);
	}
}
