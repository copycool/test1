package com.qf.zuoye.zy03;

public class Z03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int a, b, c;
		while (i < 1000) {
			a = i / 100;
			b = i / 10 % 10;
			c = i % 10;
			if (a * a * a + b * b * b + c * c * c == i) {
				System.out.println(i + "是水仙花数。");
			}
			i++;
		}
	}

}
