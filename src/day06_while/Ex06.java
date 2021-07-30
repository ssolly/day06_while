package day06_while;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1,s2;
		System.out.print("첫번째 문자 입력 : ");
		s1=sc.next();
		System.out.print("두번째 문자 입력 : ");
		s2=sc.next();
		
		System.out.println("s1 길이 : " + s1.length());
		System.out.println("s2 길이 : " + s2.length());
		System.out.println("s1==s2 : " + (s1==s2));
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s2.equals(s1) : " + s2.equals(s1));
		
		//Error : nullpointexception
		String str=null;
		System.out.println(str.equals(s1));
		// System.out.println(s1.equals(str)); 은 가능
	}
}
