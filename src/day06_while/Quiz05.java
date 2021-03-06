package day06_while;

public class Quiz05 {

	public static void main(String[] args) {
		
		/*
		 1. 이중 반복문을 활용하여 구구단을 다음과 같이 출력하세요
		   2단 : 2x1=2 2x2=4 2x3=6 ... 2x9=18
		   3단 : 3x1=3 3x2=6 3x3=9 ... 3x9=27
		   ...
		   9단 : 9x1=9 9x2=18 9x3=27 ... 9x9=81
		 */
		
		for(int i=2; i<=9; i++) {
			System.out.print(i+"단 : ");
			for (int j=1; j<=9;j++) {
				System.out.print(i+"x"+j+"="+i*j+"  ");
			}
			System.out.println();
		}
		
		/*
		 2. 별로 삼각형 만들기
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
		 3. 별로 역삼각형 만들기
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
		 4. 1~1000까지의 숫자 중 약수의 갯수가 6개인 수의 갯수를 출력하시오
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
		 5. 1~100까지의 소수를 출력하세요
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
