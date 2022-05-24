package ch14;

import java.util.ArrayList;
import java.util.List;

public class ProductUse2 {
	public static void main(String[] args) {
		
		List<Product2> list = new ArrayList<Product2>();

		System.out.println("제품을 입력하세요");
		Product2 p1 = new Product2();
		p1.input();
		Product2 p2 = new Product2();
		p2.input();
		
		//리스트에 인스턴스 추가
		list.add(p1);
		list.add(p2);
		
		//출력
		System.out.println("제품번호\t제품명\t제조사\t제조일자\t단가(만원)\t수량\t금액");
		for(int i=0; i<list.size(); i++) {
			Product2 p = list.get(i);
			System.out.println(p.getNum()+"\t"+p.getName()+"\t"+p.getCompany()+"\t"+p.getDay()+"\t"+p.getPay()+"\t"+p.getAmount()+"\t"+p.getMoney());
		}

	}
}
