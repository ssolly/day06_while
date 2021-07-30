package day06_while;

public class Ex04 {

	/*
	 continue : 반복문의 위쪽으로 올려보낸다
	 */
	
	public static void main(String[] args) {
		
		int i=0;
		while(i<5) {
			i++;
			if (i==3) {
				//break;
				continue;
			}
			System.out.println(i);
		}
		System.out.println("다른 문장들 실행");
	}
}
