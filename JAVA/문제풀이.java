package 자바0913;

public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/* 문제 1. 배열 name에 있는 원소(element)중 "Kim"의 위치를 찾아서
 * "Kim은 x에 있습니다." 출력하게 로직 구현하기.
 * 정답) Kim은 배열 1번째에 있으므로 "Kim은 1번에 있습니다."가 정답
 * 힌트!) 오늘 배운 equals와 for문을 이용해서 풀 것!
 */
		//무슨 말이지?
//xmf틀린내답 ㅠ		
		String name[] ={"Brain", "Kim"};
//	String name = "Kim";
//	boolean isCheck = name.aquals(name);
//	System.out.println("Kim은 1번에 있습니다.");
		
		
//선생님풀이	방법 1	
	for(int i=0; i<name.length; i++) {
		boolean isCheck = name[i].equals("Kim");
		System.out.println(isCheck);
		if(isCheck == true) {
			System.out.println("Kim은 "+i+"번에 있습닌다.");
			break;
		}
	}
//	
//		//방법 2. 더 간소화! 쌤이 선호하는 방법
	for(int i=0; i<name.length; i++) {
		if(name[i].equals("Kim")) {
			System.out.println("Kim은 "+i+"번에 있습닌다.");
			break;}
	}
 /*
 * 문제 2. 홍길동 번호는 010-3333-9999 입니다. 길동이는 개인정보 유출을 생각해서 번호를 010-****-****로 보이고 싶습니다.
 * 010-3333-9999 => 010-****-****로 변경하고 출력하시오
 * 힌트!) 오늘 배운 split와 for문을 이용해서 풀 것!
 */
//	String 홍길동번호 = "010-3333-9999";
//	String 배열 [] = 홍길동번호.split("-");
//	System.out.println(배열[0]);
//	System.out.println(배열[1]);
//	System.out.println(배열[2]);
//	
//	String(배열[1]) = *;
//		
		
			String phone = "010-3333-9999";
			String array[] = phone.split("-");
			for(int e=1; e<=2; e++) {
				array[e] = "****";
				System.out.println("확인 =>"+array[e]);
			}
			String 결과 = array[0]+"-"+array[1]+"-"+array[2];
			System.out.println(결과);
			
			
			
		
	}//////////////////
} /////////////////////////////////////////<이러면 확인하기 쉽겟지!

