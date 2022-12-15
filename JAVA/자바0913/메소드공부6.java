package 자바0913;

public class 메소드공부6 {

	//메소드 == 기능(단위)
	public static int getSum (int x, int y) {
		return x + y;
	}
	// public static : 접근 제어자
	// int: 리턴 타입 (리턴 타입의 종류! : 데이터타입 8개와 클래스타입 1개 +void)
	//*** void는 리턴이 없는 메소드를 의미한다. (어떨 때 무엇을 쓰는지는 한참 나중에 배우는 거니까 신경쓰지마셈!)
	// getSum : 메소드 이름
	// int x, int y :파라미터 타입 (매개변수..)
	
	public static void print (String word) {
		System.out.println(word);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = getSum(30,70);
		/*String x = */print("도시락"); //(XXX에러남!! return이 있어야하는데 void라서 없어서 안됨!)
	}/* 리턴 타입이 void인 메소드는 변수에다가 결과를 대입할 수? 없다~~ (return이 없기 때문에!!)
	//해ㅔ결하려면 String x 를 지우면 된다.
	//void <-(실무에서 자주 안 쓰임.
}
