package ch13;

public class ToStr {
	public static void main(String[] args) {
		Object obj = new Object();
		//좌:부모(첫조상) 우:자식 =>다형성
		obj=new Integer(20);
		//들어갈 수 있도록 내부처리(intValue()등 호출)하도록 했다.(Auto Boxing처리)\
		System.out.println(obj);//오토 언박싱(auto unboxing)
		obj=new Double(20.5);
		System.out.println(obj);
		obj="hello";
		System.out.println(obj);
	}
}
