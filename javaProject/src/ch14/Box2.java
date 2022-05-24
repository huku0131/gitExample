package ch14;

public class Box2<T> {//<T> 타입매개변수가 됌.
	private T data;
	public void set(T data) {
		this.data = data;
	}
	public T get() {
		return data;
	}
	public static void main(String[] args) {
		Box2<String>b=new Box2<String>();//타입매개변수에 대입하게될 String을 지정
		b.set("heelo~~");
		String s = b.get();
		
		Box2<Integer> c = new Box2<Integer>();
		c.set(10);
		Integer i = c.get();
		
		System.out.println(i);
		System.out.println(s);
		
	}

}
