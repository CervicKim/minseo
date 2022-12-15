package 자바0913;

import java.util.Scanner;

public class 자바기초2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//if, if else
					//탄생과 죽음 위치와 if /else 등 읽기 주의 ㅠ 
//		int x = 10;
//		if( x == 10) {
//			int y = 0; //y 탄생!
//		}//y 죽음...ㅠㅠ
		
//		int a = 3; //a 탄생 : 전역 변수
//		if(x > 3) {
//			a = 10;
//			int y = 20;//y 탄생 : 지역 변수
//		}//y 죽음
//		
		
		
//컨트롤+시프트+o : 자동임포트. 실행할 수 있게 해준다
		Scanner scan = new Scanner (System.in);
		System.out.print("값을 입력해주세요 =>");
		int num = scan.nextInt();
		System.out.println("값은"+num);
		
//받아온 값이 짝수면 짝수입니다. 아니면 홀수입니다 라고 출력!!
		Scanner scan = new Scanner(System.in);
		System.out.println("출력할 값을 적으시오 =>");
		int num = scan.nextInt();
		if((num%2) == 0) {
			System.out.println("짝수입니다");
		}else {System.out.println("홀수입니다.");}
		
//--------------------------------------------------------------------
	
	
		
		
		
		
		
		
		
	}		
}	
		
		
	
		
	
	
	
	
	

	
