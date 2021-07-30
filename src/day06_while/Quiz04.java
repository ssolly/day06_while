package day06_while;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		/*
		 1. 로그인 프로그램을 만드시오
		   - 처음에 로그인을 하면 저장되어 있는 값이 없기 때문에 비교할 수 없을 것이다.
		     그래서 회원가입을 먼저 진행하고 로그인 시도 후 회원가입 할 때의 
		     아이디와 로그인 할 때의 아이디가 같은지를 비교하자
		   - 화면 예시
		    1. 로그인
		    2. 회원가입
		    3. 나가기
		    >>> 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		String id, pass, saveId=null, savePass=null;
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 나가기");
			System.out.print(">>> ");
			input=sc.nextInt();
			
			switch(input) {
			case 1 :
				if(saveId==null) {
					System.out.println("로그인 등록 정보가 없습니다.");
					break;
				}
				System.out.print("아이디 입력 : ");
				id=sc.next();
				System.out.print("비밀번호 입력 : ");
				pass=sc.next();
				if (id.equals(saveId)&&pass.equals(savePass)) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
				break;
			case 2 :
				System.out.print("가입할 아이디 입력 : ");
				saveId=sc.next();
				System.out.print("가입할 비밀번호 입력 : ");
				savePass=sc.next();
				break;
			case 3 : 
				System.out.println("프로그램 종료");
				System.exit(1);  //밑의 코드 에러 생성 
			}
		}
		
		
		/*
		 2. 커피 자판기 만들기
		  - 화면①
		   요금을 투입하세요 >>>
		  - 화면②
		   ===== 커피자판기 ======
		   1. 커피(200) 2. 코코아(250) 3. 반환 4. 종료
		   메뉴를 선택하세요 >>>
		   맛있게 드세요 / 잔액이 부족합니다 / 거스름돈 / 종료
		 */
		
		int money, choice;
		int coffee=200, cocoa=250;
		
		System.out.print("요금을 투입하세요 >>> ");
		money=sc.nextInt();
		while(true) {
			System.out.println("======== 커피 자판기 ========");
			System.out.println("잔액 : "+money);
			System.out.println("1.커피(200원) 2.코코아(250원) 3.반환 4.종료");
			System.out.print("메뉴를 선택하세요 >>> ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 : 
				if (money>=coffee) { 
					System.out.println("맛잇게 드세요 :D");
					money=money-coffee;
				} else if (money<coffee) {
					System.out.println("잔액이 부족합니다");
				}
				break;
			case 2 : 
				if (money>=cocoa) {
					System.out.println("맛있게 드세요 :D");
					money=money-cocoa;
				} else if (money<cocoa){
					System.out.println("잔액이 부족합니다");
				}
				break;
			case 3 :
				System.out.println("거스름 돈 : " + money);
				break;
			case 4 :
				System.out.println("종료");
				System.exit(1);
			}
		}
	}
}
