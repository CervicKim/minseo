package 자바0913;

import java.util.Scanner;

public class For문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//*For문 실행순서
//		
//		int i =0; //위에다가 int로 값을 주면? 중괄호 밖에도 살아나죠~!
//		for(int i=0; i<10; i++) {
//		
//		}System.out.println(i);	
//		
//		
		/*문제 : num에 값을 입력받았을 때 num을 x로 나눈 나머지가 1이 되도록 하는
		 * 가장 작은 자연수 n(i)을 출력하시오.
		 * ex> num이 10이라고 가정하면 가장 작은 자연수는 3.
		 * 제한 사항: num은 3 <= num <= 1000입니다.
		 * 힌트! while or for문을 이용해서 풀어보시오
//		 */
//		int num <= 3 <= 1000;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("값을 입력하시오=>");
//		int num = scan.nextInt();
//		if ((num /x = 1%)=n {
//			System.out.println(n);}
//		while(true) {
//			--i;
		
//선생님 답
		Scanner scan = new Scanner (System.in); //값을 입력받을 수 있는 코드(자바스크립트의 prompt같은거임)
		System.out.print("값을 입력해주세요 =>"); //나눌 값 암거나 입력
		int num = scan.nextInt(); //입력받은 값이 num이 된다
		for(int i=3; i<=1000; i++) { //제한사항=조건문
			if(num %i == 1){//입력받은 값(num)을 i로 나눴을 때 나머지값이 1이 되는 가장작은 자연수(i)를
				System.out.println("가장 작은 자연수는"+i);//출력할 것이다
				break;//출력 한번 하면 스탑
		}}
//			
		//문제 2: 3부터 6까지 숫자 총합을 for문으로~
		// 3 + 4 + 5 + 6 =18
//		int sum = 0;
//		for(int i=3; i<=6; i++) {
//			(i + sum)=n
//			}System.out.println(n);	
//
//	}}
////선생님 답
	int sum = 0;  // 지금 단계에선 변수를 무조건 만들어서 하는 게 낫다!! 변수를 왜 써야하나? 고민하지마셈!
	for(int i =3; i<= 6; i++) {
		sum = sum +i;		
	}
		System.out.println(sum);
		
	
	}}
