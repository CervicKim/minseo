package 자바0929;

public class 상속공부하기 {//그 상속 맞다! 부모의 기능을~ 자식이 쓸 수 있다!
	class 부모님{//부모님시작
		public void 아들아공부해야지() {//공부시작
			System.out.println("아들아 공부해라!");
		}//공부끝
		public void 아들아밥먹자() {//밥시작
			System.out.println("고등어 반찬 해놨다.");
		}//밥끝
	}//부모님끝
//자식클래스가 부모님클래스를 상속 받아보겠다!
//프로그래밍에서의 상속: 부모의 기능을 자식이 물려받는다
	class 자식 extends 부모님{//컨트롤+스페이스
		//@Override : 오버라이딩: 부모의 기능을 자식이 재정의하다.
	@Override 
	public void 아들아공부해야지() {
		System.out.println("게임 좀만 더요~");
	}
	@Override
		public void 아들아밥먹자("김치수제비 먹을래요") {
		}
	}
	

	public static void main(String[] args) {
		
		자식 x = new 자식();
		x.아들아공부해야지();
		x.아들아밥먹자();

	}

}
