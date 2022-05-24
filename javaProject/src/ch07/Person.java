package ch07;

public class Person {
	private String name;
	private int age;
	private String email;
	private String adress;
	
	//setter : set + 변수명
	public void setName(String name) { // name은 지역변수(로컬변수)
		//this => 멤버변수를 가리킴
		this.name = name;
	}
	//getter : get+변수명
	public String getName() {
		return name;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	
	public void setAge(int age) {
		if(age < 0 || age > 150) {
			System.out.println("입력값이 정확하지 않습니다.");
		}else {
			this.age = age;
		}
	}
	public int getAge() {
		return age;
	}
	
	public void setAdress(String adress) {
		this.adress =adress; 
	}
	public String getAdress() {
		return adress;
	}
	
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + email);
		System.out.println("이름 : " + adress);
		
		
	}
}
