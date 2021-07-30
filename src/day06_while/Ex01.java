package day06_while;

public class Ex01 {

	/*
	 # while 반복문
	  - while(조건식) {
	    	종속문장
	    }
	 */
	
	public static void main(String[] args) {
		
		int i=1;
		int sum=0;
		while(i<=10) {	//for(;i<=10;) {
			sum+=i;
			i++;
		}
		System.out.println("1-10까지의 합 : "+sum);
		
	}
}
