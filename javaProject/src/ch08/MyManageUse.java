package ch08;

public class MyManageUse {
	public static void main(String[] args) {
		//1)getInstance()호출하여 처음 호출이면 score 멤버변수에 10을 초기화
		MyManager mgrobj=MyManager.getInstance();
		System.out.println("mgrobj.getScore() : "+mgrobj.getScore());
		mgrobj.setScore(100);//score 멤버변수에 100을 초기화
		System.out.println("mgrobj.getScore() : "+mgrobj.getScore());
		
		//2)두번째 호출이기 때문에 기존 객체의 주소값을 리턴받아옴
		MyManager newMgr = MyManager.getInstance();//두 번째 싱글톤 호출이기 때문에
		//처음 mgr주소값만 리턴받아와 newMgr에 초기화
		System.out.println("newMgr.getScore() : "+newMgr.getScore());
	}
}
