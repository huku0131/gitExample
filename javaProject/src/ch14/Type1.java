package ch14;

public class Type1 {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public static void main(String[] args) {
		Type1 t = new Type1();
//		t.setValue = (100);
//		t.setValue(100.15);
		t.setValue("hello:");
		System.out.println(t.getValue());
		
	}
	
}
