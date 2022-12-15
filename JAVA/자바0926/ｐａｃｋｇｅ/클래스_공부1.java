package ｐａｃｋｇｅ;

class 붕어빵 {//시작

	public static String 붕어빵을만들다 (String 재료) {// 만들다 시작
		return 재료 + "붕어빵을 만들었습니다!";
	}//만들다 끝
	public static int 붕어빵수량을파악하다 (int 수량) {//수량파악 시작
		return 수량; //수량을 부를거니까 수량쓰고
	}// 수량파악 끝
	
}//붕어빵 끝
//*클래스 이름을 만들때 꼭!!! 앞자리를 대문자로!!!!!Pizza!
//*클래스 안에 메소드가 위치한다.
//*프로젝트 ->(안에~) 패키지 -> 클래스(메소드를 감싼다.) -> 메소드 (가장 작은 단위.) 
//*자바 파일에 public class는 1개만 작성할 수 있다!. 클래스 이름을 바꾸면 그쪽으로 pul~tatic이 붙는다.
class Pizza{	//클래스시작
	public static void 피자를먹다() {
		System.out.println("백종원피자 냠냠");
		}
	
	/*접근제어자 : public static
	리턴 타입 : void
	메소드 이름 : 피자를먹다
	파라미터 타입 : 아직 없음*/
	
	public static String 피자를주문하다(String 피자이름, int 수량) {
		return "불고기피자";
	}
	/*접근제어자 : public static
	리턴 타입 : String
	메소드 이름 : 피자를주문하다
	파라미터 타입 :String, int*/
}// 클래스 끝
public class 클래스_공부1 {

	public static void main(String[] args) {//메인함수시작
// 메소드를 쓰는 큰 이유: 업무 분담!
// 클래스도 마찬가지로 업무분담이 주목적!
		
		int x = 100;
		Pizza p = new Pizza(); //new Pizza(); pizza 클래스를 불러온 것!!(== 파일을 호출하다.)
		p.피자를먹다(); //Pizza 클래스 안에 있는 피자를먹다를 호출했음!! 
		ｓｙｓｏ
		
		
		붕어빵 팥붕어빵 =  new 붕어빵();
		String 결과 = 팥붕어빵.붕어빵을만들다("팥");
		System.out.println(결과);
		
		int 수량 = 팥붕어빵.붕어빵수량을파악하다(10); //수량을 입력
		System.out.println("붕어빵은"+ 수량 +"개 있습니다."); //수량을 출력한다.
	
	}}//메인함수끝
	/*Pizza : 데이터 타입(자바는 클래스도 데이터 타입이다. 기본데이터타입 8 + 클래스 1 = 총 9개)
	p : 변수 이름
	new Pizza : 클래스 데이터*/
