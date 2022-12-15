package 자바0927;

public class 영화관 {//메인함수 체크 꺼서 없슴!
	//필드변수는 public과 private를 지정할 수 있다. 
	//private을 쓰면 다른 클래스로 호출하는 게 안된다!
	//==은닉성
	private int 직원수; //필드변수들
	private String 영화관위치;
	private String 영화관이름;
	private String[] 개봉영화종류; //한번에 여러 영화가 개봉하니까 배열로 받는다!
//문제: private인 상태에서 영화관 클래스에서 호출햇을 때! 이용할 수 있게 하는 방법은?/우리가 배운 수준에서
	//메소드 (교육용)-----------
	public int 직원수가져오다(int 직원수) {
		직원수 = 직원수;
		return 직원수;
	}
	//실무용!!----------위의 교육용을 두 개로 쪼갠다..!
	public void set직원수(int 직원수) {//set직원수 == 직원수초기화
		//파라미터로 받아온 값을, 필드변수(직원수)에 대입.
		//이런 메소드를 setter라고 한다.
		this.직원수 = 직원수; //this를 붙이면? 자기 자신(==클래스)을 의미함.
						//this.직원수가 파라미터변수의 직원수랑 이름이 동일하니까 구분지으려고 붙인다.
						//같은 이름이라 불편했던 직원수! this를 붙여서 필드변수로 사용하자.
	}
	public int get직원수(){//get직원수 == 직원수불러오다
		//필드변수를 리턴하는 메소드
		//이런 메소드를 getter 메소드라고 한다.
		return 직원수;
	}
	
//메뉴 source - generate Getters and Setters 누르고 생성할 거 선택하면 나타난다!//원하는 위치에 커서두고.
	
	public String get영화관위치() {
		return 영화관위치;
	}
	public void set영화관위치(String 영화관위치) {
		this.영화관위치 = 영화관위치;
	}
	public String get영화관이름() {
		return 영화관이름;
	}
	public void set영화관이름(String 영화관이름) {
		this.영화관이름 = 영화관이름;
	}
	public String[] get개봉영화종류() {
		return 개봉영화종류;
	}
	public void set개봉영화종류(String[] 개봉영화종류) {
		this.개봉영화종류 = 개봉영화종류;
	}
	
}//영화관끝




