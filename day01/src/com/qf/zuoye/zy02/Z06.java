package com.qf.zuoye.zy02;

import java.util.Scanner;

/**
 * 张三为他的⼿机设定了⾃动拨号 按1：拨爸爸的号 按2：拨妈妈的号 按3：拨爷爷的号 按4：拨奶奶的号
 * 
 * @author XC
 *
 */
public class Z06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入按键：");
		int i = scanner.nextInt();
		switch (i) {
		case 1:
			System.out.println("拨爸爸的号 ");
			break;
		case 2:
			System.out.println("拨妈妈的号");
			break;
		case 3:
			System.out.println("拨爷爷的号");
			break;
		case 4:
			System.out.println("拨奶奶的号");
			break;
		default:
			break;
		}
	}

}
