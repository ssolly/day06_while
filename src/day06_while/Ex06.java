package day06_while;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1,s2;
		System.out.print("ù��° ���� �Է� : ");
		s1=sc.next();
		System.out.print("�ι�° ���� �Է� : ");
		s2=sc.next();
		
		System.out.println("s1 ���� : " + s1.length());
		System.out.println("s2 ���� : " + s2.length());
		System.out.println("s1==s2 : " + (s1==s2));
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s2.equals(s1) : " + s2.equals(s1));
		
		//Error : nullpointexception
		String str=null;
		System.out.println(str.equals(s1));
		// System.out.println(s1.equals(str)); �� ����
	}
}
