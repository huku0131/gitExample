package ch07;

public class EmployeeUse {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.input("홍길동", "관리부", "과장", 400);
		e1.calc();
		e1.print();
	}
}
