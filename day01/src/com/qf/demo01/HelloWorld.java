package com.qf.demo01;
import com.qf.demo01.Homework01;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("姓名\t ");
		Homework01 homework01 = new Homework01();
		int i = homework01.getI();
		System.out.println(i);
		homework01.setI(19);
		int j = homework01.getI();
		System.out.println(j);
		String str = homework01.str;
		int k = homework01.CLASS_VARIABLE;
		
		System.out.println(str+k);
	}

}
