package com.qf.zuoye.zy01;

/**
 * 完成打印输出Java所有基本数据类型及所占字节数，格式如效果图。 类型 所占字节 取值范围 占多少位 byte 1字节 -2^7~2^7-1 8位
 * short 2字节 -2^15~2^15-1 16位 int 4字节 -2^31~2^31-1 32位 ...
 * 
 * @param args
 */
public class ZuoYe04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
				Byte.TYPE + ":" + Byte.BYTES + "字节," + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE + "," + Byte.SIZE + "位");
		System.out.println(
				Short.TYPE + ":" + Short.BYTES + "字节," + Short.MIN_VALUE + "~" + Short.MAX_VALUE + "," + Short.SIZE + "位");
		System.out.println(
				Integer.TYPE + ":" + Integer.BYTES + "字节," + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE + "," + Integer.SIZE + "位");
		System.out.println(
				Long.TYPE + ":" + Long.BYTES + "字节," + Long.MIN_VALUE + "~" + Long.MAX_VALUE + "," + Long.SIZE + "位");
		System.out.println(
				Float.TYPE + ":" + Float.BYTES + "字节," + Float.MIN_VALUE + "~" + Float.MAX_VALUE + "," + Float.SIZE + "位");
		System.out.println(
				Double.TYPE + ":" + Double.BYTES + "字节," + Double.MIN_VALUE + "~" + Double.MAX_VALUE + "," + Double.SIZE + "位");
	}

}
