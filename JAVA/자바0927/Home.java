package 자바0927;
/*중괄호 시작과 끝 꼭 쓰기!*/

class A{ //A클래스시작
	int value = 100; //value 탄생(필드 변수) // value가 죽기 전까진 메소드가 여러개에도 각자 또 사용 가능.
	//필드 변수 특징. 
	//1. 전역(전체)활동 가능.
	//2. 초기값을 지정하지 않아도 된다. 기본 값(default 값)이 존재해서!!
	
	public void 확인하기() {
		int x = 50; //x라는 이름의 변수 탄생!
		//int y; //y에 값이 없어서 y출력 or 사용시 오류발생!!!
		System.out.println("A클래스에 있는 메소드입니다.");
		System.out.println(value);
	}//x 죽음..
}//A클래스 끝 => value 생을 마감..
public class Home {
	//static 메소드는 static 메소드, 혹은 인스턴스화 된 메소드만 올 수 있다.
	public static void main(String[] args) {
		A a클래스 = new A(); // new A() => A클래스를 호출하다.
		a클래스.확인하기(); //a클래스에 있는 확인하기 메소드 (==함수) 사용.
		
		B b클래스 = new B();
		b클래스.확인하기();
		
	}
}
//문제1. B 이름을 가진 클래스 생성.
			//리턴 값이 void이고, 파라미터 타입이 없는! 확인하기 메소드 생성.
			//메인 메소드에서 B클래스에 있는 확인하기 메소드 호출하기.
			//결과: B클래스에 있는 메소드입니다.
	
	class B{//B클래스시작 
		/*public*/ void 확인하기() {//확인하기 메소드 시작
		//접근제어자 public static은 사실 선택이다. 생략가능!
			System.out.println("B클래스에 있는 메소드입니다.");
		}//확인하기 메소드 끝
	}//B클래스끝

//문제 2. 필드 변수: String str, int value
	class C{//C클래스 시작
		String str; //따로 값을 줄 필요가 없어서 필드변수 그대로 적으면 된다!
		int value;
		
		public boolean 메소드만들기() {//메소드만들기 시작
			return true; //리턴 값(boolean)이 있어서 ture or false를 써야함! //리턴 타입이 있으면 return을 꼭 써주자!!!값은 유형맞춰서!
		}//메소드만들기 끝
	
		public int 메소드만들기(double x, double y) {//메소드만들기(2) 시작
			return 0; //리턴 값(int)가 있으니까 숫자 암거나!
		}//메소드만들기(2) 끝
		
		B 메소드만들기(B b) {
			return b;
		} //B가 클래스 이름! 클래스 B를 return 하겠다.
	}//C클래스 끝