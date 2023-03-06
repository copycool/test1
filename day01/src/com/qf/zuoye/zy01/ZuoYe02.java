package com.qf.zuoye.zy01;
/**
 * 定义⼀个三位整数，分别输出其个位、⼗位和百位
 * @param args
 */
public class ZuoYe02 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int g,s,b;
		g= num%10;
		s=num/10%10;
		b=num/100;
		System.out.printf("num%d的个位是:%d十位是:%d百位是:%d",num,g,s,b);
	}

}
