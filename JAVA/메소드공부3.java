package 자바0913;

import java.util.Scanner;

public class 메소드공부3 {

	public static void 캐릭터를생성하다(ㅖ) {
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("###스타듀밸리 게임 프로그램 시작 ###");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("[1] 캐릭터생성 [2] 직업 선택 [3] 캐릭터 삭제 [4] 프로그램 종료");
			System.out.print("이용할 농장 서비스를 선택하시오. ===>");
			Scanner scan = new Scanner(System.in);
			int 직업 = scan.next();
			String scan =new nextlnt();
			switch(menu) {
				case "1" : 
					System.out.println("[1] 전사 [2] 마법사 [3] 궁수"); break;
				case "2" : 
					System.out.println(""); break;
				case "3" : 
					System.out.println("3번 선택"); break;
				case "4" : 
					System.out.println("프로그램 종료"); 
					System.exit(0);
					break;
					
			}
		}

	}

}
