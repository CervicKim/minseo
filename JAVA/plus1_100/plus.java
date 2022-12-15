package plus1_100;

public class plus {

	public static void main(String[] args) {
		
		//변수 선언
		int x = 0;
			//i가 1부터 100을 한도로 작거나 같을 때까지 +1씩 증가해서 더해준다
		for(int i = 1; i<=100; i++) {
			//변수 x에다가 하나씩 늘어가는 i값을 저장한다.
			x = x + i; //x에다가 하나씩 늘어가는 i값을 더한걸 x에 대입한다
		}System.out.println("1부터 100까지 더하면? "+ x);
	}
	

}
