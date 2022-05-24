package ch14;

public class Type3<T>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	public static void main(String[] args) {
		//인스턴스를 생성할 때 자료형을 결정함. =>제너릭(일반화)이라 함.
		
		Type3<String>t=new Type3<String>();
		t.setT("100");
		System.out.println(t.getT());
		Type3<Integer> t2 = new Type3<Integer>();
		t2.setT(100);
		System.out.println(t2.getT());
		
		Type3 t3 = new Type3();//<>자료형을 주지 않고 일반적 방법으로 new 했을 땐 실행은 되지만 경고
		//내부적으로 다 Object로 다 처리하게 되어 메모리 낭비를 심하게 함.
		t3.setT(100.5);
		System.out.println(t3.getT());
	}
}
