package com.qf.zuoye;

/**
 * 定义两个变量int a = 10 int b = 20 ,交换两个变量的值
 * 
 * @author XC
 *
 */
public class SiKao01 {
// 	private int x;
// 	private int y;
	
	
// 	public SiKao01() {
// 		super();
// 	}
// 	public SiKao01(int x, int y) {
// 		super();
// 		this.x = x;
// 		this.y = y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + "," + b);

	}
// 	public static void trans(SiKao01 s) {
// 		int temp = s.x;
// 		s.x = s.y;
// 		s.y = temp;
// 	}

}
