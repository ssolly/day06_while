package day06_while;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		/*
		 1. �α��� ���α׷��� ����ÿ�
		   - ó���� �α����� �ϸ� ����Ǿ� �ִ� ���� ���� ������ ���� �� ���� ���̴�.
		     �׷��� ȸ�������� ���� �����ϰ� �α��� �õ� �� ȸ������ �� ���� 
		     ���̵�� �α��� �� ���� ���̵� �������� ������
		   - ȭ�� ����
		    1. �α���
		    2. ȸ������
		    3. ������
		    >>> 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		String id, pass, saveId=null, savePass=null;
		while(true) {
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. ������");
			System.out.print(">>> ");
			input=sc.nextInt();
			
			switch(input) {
			case 1 :
				if(saveId==null) {
					System.out.println("�α��� ��� ������ �����ϴ�.");
					break;
				}
				System.out.print("���̵� �Է� : ");
				id=sc.next();
				System.out.print("��й�ȣ �Է� : ");
				pass=sc.next();
				if (id.equals(saveId)&&pass.equals(savePass)) {
					System.out.println("�α��� ����");
				} else {
					System.out.println("�α��� ����");
				}
				break;
			case 2 :
				System.out.print("������ ���̵� �Է� : ");
				saveId=sc.next();
				System.out.print("������ ��й�ȣ �Է� : ");
				savePass=sc.next();
				break;
			case 3 : 
				System.out.println("���α׷� ����");
				System.exit(1);  //���� �ڵ� ���� ���� 
			}
		}
		
		
		/*
		 2. Ŀ�� ���Ǳ� �����
		  - ȭ���
		   ����� �����ϼ��� >>>
		  - ȭ���
		   ===== Ŀ�����Ǳ� ======
		   1. Ŀ��(200) 2. ���ھ�(250) 3. ��ȯ 4. ����
		   �޴��� �����ϼ��� >>>
		   ���ְ� �弼�� / �ܾ��� �����մϴ� / �Ž����� / ����
		 */
		
		int money, choice;
		int coffee=200, cocoa=250;
		
		System.out.print("����� �����ϼ��� >>> ");
		money=sc.nextInt();
		while(true) {
			System.out.println("======== Ŀ�� ���Ǳ� ========");
			System.out.println("�ܾ� : "+money);
			System.out.println("1.Ŀ��(200��) 2.���ھ�(250��) 3.��ȯ 4.����");
			System.out.print("�޴��� �����ϼ��� >>> ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 : 
				if (money>=coffee) { 
					System.out.println("���հ� �弼�� :D");
					money=money-coffee;
				} else if (money<coffee) {
					System.out.println("�ܾ��� �����մϴ�");
				}
				break;
			case 2 : 
				if (money>=cocoa) {
					System.out.println("���ְ� �弼�� :D");
					money=money-cocoa;
				} else if (money<cocoa){
					System.out.println("�ܾ��� �����մϴ�");
				}
				break;
			case 3 :
				System.out.println("�Ž��� �� : " + money);
				break;
			case 4 :
				System.out.println("����");
				System.exit(1);
			}
		}
	}
}
