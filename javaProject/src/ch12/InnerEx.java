package ch12;

import ch12.Outer.StaticInner;

class Outer{
	class InstanceInner{
		int a = 100;
	}
	static class StaticInner{
		int a = 200;
		static int b = 300;
	}
	void myMethod() {
		class LocalInner{
			int a = 400;
		}//inner class
		LocalInner i = new LocalInner();
		System.out.println("i.a : " + i.a);
	}
}

public class InnerEx {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner i = oc .new InstanceInner();
		System.out.println("i.a : "+ i.a);
		System.out.println("Outer.StaticInner.b : " + Outer.StaticInner.b);
		
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.a :"+ si.a);
		oc.myMethod();
		
	}
}
