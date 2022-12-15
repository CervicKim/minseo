package 자바0913;

public class 문자열공부 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//실무에서 많이 쓰이는 3대장들!!! 	equals/ length/
		
		String name = "황정민"; //문자
		String name2 = "하정우";
// 1. equals
//*자바에서 문자를 비교할 때는!! == 를 사용하지 않는다!!!!!!!!!!!!
				//황정민이 대입된 name과 괄호 안의 문자를 대조하는 거임!
		boolean isCheck = name.equals(name2); //<- name과 name2를 대조한다.
		//왜 자바에서는 문자를 == 연산자로 비교하지 않고, equals를 사용하는 이유는?
		//자바에서 문자열은 '클래스'이기 때문에, 연산자로 비교하면 문자 비교가 아닌 클래스 비교가 돼서.<-아직 안배운영역임
		System.out.println("name하고 name2를 비교한 결과 => "+ isCheck);
		//boolean은 true or false만 표현할 수 있다.
		
//2. 문자 길이 알아내기
// length
		String 비밀번호 = "12341234";
		int 문자길이 = 비밀번호.length();
		System.out.println("문자길이는 =>"+문자길이);
	
//3. 문자 자르기
		String 핸드폰번호 = "010-8888-1222"; //이걸 나누면 세 조각이 나오죠
		String 배열 [] = 핸드폰번호.split("-"); //<- 짝대기 기준으로 나누겠다.는 선언. 만약에 010*2888*1...<- 이러면 *로 쓰면 됨!
		System.out.println(배열[0]); //010
		System.out.println(배열[1]); //8888
		System.out.println(배열[2]); //1222
		
//4. 특정 문자만 추출하기
		String 영화제목 = "어벤져스 인피니티 워";
		String 결과는 = 영화제목.substring(2); //1,2번째를 뺀 이후만 출력해준다. array와 다르게 맨 앞이 1번째임!]
		String 결과는2 = 영화제목.substring(2,7); //*먼저 쓴 글씨 이후부터~ 두번째 글씨 순서 전까지 보여줌. 거의 (ㅁ+1) ~ (ㅁ-1)이런건가봄*
		System.out.println(결과는); //져스 인피니티 워
		System.out.println(결과는2); //어벤져스
	
	
	}

}
