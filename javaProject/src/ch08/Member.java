package ch08;

public class Member {
	private String name;
	private String id;
	private String grade;
	private int pay;
	
	public Member(String name, String id, int pay) {
		this.name=name;
		this.id=id;
		this.pay = pay;
		if(pay>=100000) {
			grade="gold";
		}else if(pay>=50000) {
			grade="silver";
		}else {
			grade = "bronze";
		}	
	}
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+id+"\t"+pay+"\t"+grade);
	}
}
