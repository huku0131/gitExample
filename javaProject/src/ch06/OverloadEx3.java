package ch06;

public class OverloadEx3 {
public static void main(String[] args) {
	print("홍길동",3000);
}

static void print(String name, int pay) {
	double vat = pay*0.3;
	
	System.out.println("이름\t급여\t세금\t실수령액");
	System.out.println(name+"\t"+pay+"\t"+vat+"\t"+ (pay-vat));
	
}

}
