package com.qf.zuoye.zy03;

/**
 * 99乘法表
 * 
 * @author XC
 *
 */
public class Z01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		while (x <= 9) {
			int y = 1;
			while (y <= 9) {
				System.out.print(x + "*" + y + "=" + (x * y)+"\t");
				y++;
			}
			System.out.println();
			x++;
		}
	}

}
