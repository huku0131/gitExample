package ch09;

public class Student {
	//멤버변수
	//protected 또한 자식클래스에서 접근가능, private만 상속이 안됨
	private String name;
	private String num;//학번
	private String major;//전공
	private int year;//학년
	
	public Student() {	} //기본생성자
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	//생성자로 매개변수 처리
	public Student(String name, String num, String major, int year) {
		super();
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}

	//일반메소드로 매개변수 처리
	public void input(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	
	
	
	
}
