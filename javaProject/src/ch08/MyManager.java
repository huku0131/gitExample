package ch08;
//싱글톤 기법
public class MyManager {
	private int score;
	//싱글톤 처리된 생성자는
	private MyManager(int score) {
		this.score=score;
	}
	//private static 클래스이름 참조변수;
	private static MyManager mgr;
	//public static 클래스이름 메소드이름()
	public static MyManager getInstance() {
		if(mgr==null ) {//처음 MyManager가 객체화 될 때의 경우
			mgr = new MyManager(10);
		}
		return mgr;
	}
	
	public int getScore() {
		return score;
		
	}
	public void setScore(int score) {
		this.score=score;
	}
}
