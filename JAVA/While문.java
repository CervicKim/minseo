package 자바0913;

public class While문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// while문 
// for문처럼 반복문이다.
// 사용빈도는 for문보다 덜하지만 아주 가끔?! 사용한다.
//		while(true) {
//			++count;
//			System.out.println("안녕?");
//			if(count == 20) {
//				break;
//			}
//		}
		
		//문제 while문을 이용하여 1~ 10까지 합을 구하시오. 나의 틀린 답^ㅡㅜ
//		int num = 0;
//		while(true) {
//			System.out.println("num");
//			++num;
//			if(num == 10) {
//				break;
//			}()
//		}
		
	//선생님답
	int sum = 0;
	int i =0;
	while(true) {
		++i;
		sum = sum + i;
		System.out.println("sum =>"+sum);
		if(sum == 55) {
			System.out.println("멈춰");
			break;
		}
	}

}
}
