package ch14;

public class Box {
	private Object data;
	public void set(Object data) {
		this.data=data;
	}
	public Object get() {
		return data;
	}
	public static void main(String[] args) {
		Box b = new Box();
		b.set("Hello");//문자열 처리가능 ~ 모든 타입 가능
		String s = (String)b.get();
		Box c = new Box();
		c.set(30);
		Integer i = (Integer)c.get();
		
		System.out.println(s);
		System.out.println(i);
		
		
	}
	
}
