package com.qf.demo01;
/**
 * 郭腾的简历
 * @author XC
 *
 */
public class Homework01 {
	static int CLASS_VARIABLE = 1;
	String str = "helloworld";
	private int i;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homework01 homework01 = new Homework01();
		homework01.getScore();
		
	}
	public void getScore() {
		int score = 59;
		score = score + 1;
		System.out.println("小明的成绩是" + score+str+CLASS_VARIABLE);
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	

}
