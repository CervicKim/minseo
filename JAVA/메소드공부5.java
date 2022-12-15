package 자바0913;

public class 메소드공부5 {

	//메소드 == 기능 
	//메소드를 왜 쓰나? : 팀작하라고 있는 거임! 업무부담! 유지보수 편리성! 하나씩 나눠서 만들고 합치면 된다~!
					
		//아래 이름 맞추기로 시험내신대!!!!
		public static int getsum(int x) {}
			return x;
				
		// public static : 접근 제어자
		// int : 리턴 타입
		// getSum : 메소드 (혹은 함수의) 이름 
		// int x : 파라미터 타입(혹은 매개변수)
					
		public static String getWord (String x) {
			return x;
			}
		
		// public static : 접근 제어자
		// boolean : 리턴 타입
		// isTrue : 메소드 (혹은 함수의) 이름 
		// 파라미터 타입값 없음.
		
		public static boolean isTrue() {
			
		}
		// public static : 접근 제어자
		// int : 리턴 타입
		// getSum : 메소드 (혹은 함수의) 이름 
		// int x, int y : 파라미터 타입(혹은 매개변수)
		
		public static int getSum(int x, int y) {
			return 10;
		}

		public static int getCount(int startNum, int endNum) {
			
			if(startNum > endNum) {
				return startNum }
			if(endNum > startNum) {
				return endNum }//이 중괄호는 가로로 한 줄로 쓰면 생략이 가능하다!!!!!!!!!!!!
			return 0;
		}
		//getCount(1,10); : 메소드를 불러오다.
		
		//문 1. startNum이 endNum보다 크면 startNum을 리턴
		// endNum이 startNum보다 크면, endNum을 리턴하는 로직을 구현하시오. <- 이 로직을 punlic~과 return 사이 공간에 쓰면 된다!
		
		public static int 일부터십까지합구하기() {
			//1~10까지 합을 구하는 로직을 구현 후, 합을 리턴하시오!
			int sum = 0;
			for(int i=1; i<=10; i++) {
				sum += i;
			}
			
			return sum;
		}
		
		//
		public static int 짝수개수구하기() {
			//1부터 20까지 짝수 개수를 구하고, 개수를 리턴하시오.
			int sum = 0;
			for(int i=1; i <=20; i++) {
				sum = (i % 2 = 0)
				
			}
			return 0;
		}
		
		//엄청긴문제
		int n = 0;
		int i = 0;
		while(true) {
			++i;
			n = n + i;
			if(n % 2 = 0) {n / 2};
			if(n % 1 = 0) {(n * 3)+1};
			if(n == 1) {
				System.out.println("stop");
				break;
			}
		}
		
		//선생님 답
		public static int solution(int n) {
			int answer = 0; //int는 4byte (1 byte == 8 bit)
			long x = n; //long 8byte
			if(x == 1) return answer;
			while(x != 1) {
				if(n%2 ==0) {//입력된 수가 짝수라면?
					x = x /2;
					++answer;
				}else {//입력된 수가 홀수라면
					x = (x * 3)+1;
					++answer
				}
			}
		}
			//문제 2. 1~ 20까지 짝수 개수를 구하고 개수를 리턴하시오.
			int count = 0;
			for(int i=1; i<=20; i++) {
				if(i%2 == 0) ++count;
			}
			return count;
}

