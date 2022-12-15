package 자바0929;

class 관장{//관장시
	
	public void 운동을하다() {
		System.out.println("시작하기 전에 운동장 100바퀴!");
	}
	public void 주먹을날리다() {
		System.out.println("돌려차기!!");
		System.out.println("찍기!!!!");
		System.out.println("3단 날라차기!!!!!!");
	}	
}//관장끝
//extends : 상속
//@Override : 오버라이딩 (받는 쪽 클래스에서 재정의를 하다.)
//*오버로딩 vs 오버라이딩
// *오버로딩: 메소드 이름은 같으나, 파라미터 타입이 다르다.(그래서 생성할 수 잇엇다.)
// *오버라이딩: 부모의 기능을 자식이 재정의 함. //관장과 제자의 이야기를 기억하라.(ㅋㅋ><
class 제자 extends 관장{//제자시
	@Override
	public void 운동을하다() {
		System.out.println("간단하게 스트레칭만 하죠?");
	}
	@Override
	public void 주먹을날리다() {
		System.out.println("상대와 간격을 조절한다.");
		System.out.println("레프트 쨉을 날린다!");
		System.out.println("라이트 훅을 날린다!!");		
	}
}//제자끝

public class 상속공부하기2 extends Object{ //자바(객체지향언어)의 모든 클래스는, 디폴트로 Object클래스를 상속을 받고 있다!
	//그래서 extends Object를 굳이 안 써도 있다. 단군이 있기에 대한민국이 있다. 

	
	
	public static void main(String[] args) {
		
		관장 경호관장님 = new 관장();
		경호관장님.운동을하다(); //이름쓰고 쩜(.) 붙이면 뜬다!호출하기.
		경호관장님.주먹을날리다();
		System.out.println("=======================================");
		제자 현상원 = new 제자();
		현상원.운동을하다();
		현상원.주먹을날리다();

	}

}
