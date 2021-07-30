package day06_while;

import java.util.Scanner;

public class Ex05 {

	/*
	 # 프로그램 강제 종료
	  - System.exit(1);
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.걷기 \n2. 대중교통\n3. 종료");
			System.out.println(">>> ");
			int select = sc.nextInt();
			switch(select) {
			case 1 : System.out.println("걸어가자!"); break;
			case 2 : System.out.println("버스타자!"); break;
			case 3 : System.out.println("종료하자"); 
					 System.exit(1);	//프로그램 강제 종료		
			}
		}
	}
}
