package ch13;

public class ObjCast {
	public static void main(String[] args) {
		int a=10;
		//부모 : 자식
		Object obj = 20;
		a=(Integer)obj;//정상적인 형변환, 객체는 객체형끼리 형변환 해주는게 좋다.
//		a=(int)obj;
		System.out.println(a);
		
		Object[] obj2= {100,100.5,true,"hello",'A'};
		//사실은 각 데이터가 Object 객체 (Integer, Double, Boolean등...)가 되어버린다.(오토박싱)
		//단점 : 메모리 낭비가 심하다. 이렇게 쓰는 일은 없다. 대신 컬렉션처리(ArrayList등)을 하면 단점을 보완할 수 있다.
		for(Object o : obj2) {
			System.out.println(o);
		}
	}
}
