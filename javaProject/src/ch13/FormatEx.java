package ch13;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatEx {
	public static void main(String[] args) {
		int val=123400000;
		String str=String.format("%,d", val);
		System.out.println(str);
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		String num=df.format(123000000.323232);
		System.out.println(num);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance().getCurrencyInstance();
		String num2=nf.format(1230000.1234);
		System.out.println(num2);
		
		NumberFormat nf2 = NumberFormat.getInstance(Locale.ITALY);
		String num3=nf2.format(12300000.1234);
		System.out.println(num3);
	}
}
