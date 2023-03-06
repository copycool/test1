package com.qf.zuoye.zy02;

import java.util.Scanner;

/**
 * 按照年龄划分，60以上是⽼年⼈,40-60是中年⼈,20-40⻘年⼈,10-20⻘少年,10岁以下⼉童。(分别 使⽤多重if和switch语句实现)
 * 
 * @author XC
 *
 */
public class Z04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 69;
		Scanner scanner =  new Scanner(System.in);
		System.out.println("请输入年龄：");
		age= scanner.nextInt();
		/*if方法
		 * if (age>=0) {
			if (age <= 60) {
				if (age > 40) {
					System.out.println("是中年⼈");
				} else if (age > 20) {
					System.out.println("是⻘年⼈");
				} else if (age > 10) {
					System.out.println("是⻘少年");
				} else {
					System.out.println("是儿童");
				}
			} else {
				System.out.println("是⽼年⼈");
			}
		}else {
			System.out.println("输入错误");
		}*/
		//switch方法
		switch (age-Math.abs(age)) {
		case 0:
			switch (age/10) {
			case 0:
				System.out.println("是儿童");
				break;
			case 1:
				System.out.println("是⻘少年");
				break;
			case 2:
			case 3:
				System.out.println("是⻘年⼈");
				break;	
			case 4:
			case 5:
				System.out.println("是中年⼈");
				break;
			default:
				System.out.println("是⽼年⼈");
				break;
			}
			break;

		default:
			System.out.println("输入错误");
			break;
		}
		
	}

}
