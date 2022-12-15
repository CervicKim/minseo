package 자바0913;

public class 메소드공부7 {

	/*public static : 접근지정자
	 * int : 리턴 타입
	   getNum : 메소드 이름
	   int x, String y : 파라미터 타입
	*/
	//문제 1. 아래 메소드 main메소드에 호출해서 결과 확인하기
	public static int getNum(int x, String y) {
		return 0;
	}
	public static int getNum(int x, String y, String z) {//파라미터 안에는 모든 데이터타입 가능!!! 
		//리턴타입이 int라고해서 파라미터 타입에 int외의 것이 못 들어가는거아님!!!
		return 10;
	}
	/* 문제 2. 메소드 만들기 -> main 함수에 호출하시오!
	 * 접근지정자 : public static
	 * 리턴 타입 : boolean
	 * 메소드 이름 : isTrue
	 * 파라미터 : boolean, String
	 * */
	public static boolean isTrue (boolean x , String y) {
		return false;
	}	
		//main 메소드 호출하고 결과 확인하기.
	public static String getStr() {
		return "피자빵";
	}
	//main  메소드 호출하고 결과 확인하기!
	public static int 피자빵주세요(int 빵) {
		return 빵;
	}
	//main 메소드 호출하고 결과 확인하기!
	public static int 돈을인출하다(int 돈) {
		return 돈 + 3000;
	}
	//main 메소드 호출하고 결과 확인하기!
	///메소드 이름은 같으나 파라미터 타입, 개수가 다르면 메소드 이름 중복 사용 가능(== 오버로딩)/평소엔 중복 절대안됨!!
	public static int 돈을인출하다(int 돈, String 계좌) {
		if(계좌.equals("카카오뱅크")) {
			return 돈;
		}	
		if(계좌.equals("농협")) {
			return 돈;
		}
		return 0;
	}
	public static void main(String[] args) {
		int 돈 = 돈을인출하다(3000, "국민은행")
	}
	//public static int 돈을해외로송금하다(int 금액, String 해외) {
		
	}
	
	public static void main(String[] args) {
		int x = getNum(10, "붕어빵");//<- 메소드 호출
		
		
		//메소드에 return이 있으면 대입이 가능하다!!
		int y = getNum(10, "붕어빵", "피자붕어빵");
		System.out.println("결과 =>"+y);
		boolean isX = isTrue(true, "금요일");
		System.out.println("결과 =>"+isX);
		String word = getStr();
		System.out.println("결과 =>"+word);
		
		int 빵 = 피자빵주세요(100);
		System.out.println(빵);
		
		int 돈 = 돈을인출하다(1000);
		System.out.println(money);
	}
	
	
	
	}
	
	
