package com.itheima.demo05_String对象的哈希值;


/*
 * 字符串的哈希表：
 * 				由于String类重写HasCade 那么哈希表不在通过地址值计算
 * 				我们观察源码，发现通过字符串的类容计算，所以只要字符串内容相同，哈希表值必定相同
 * 
 * 				只要字符串类容一样，哈希值，必定一样
 * 				两个字符串类容一样，哈希值可能一样
 * 					比如：abc和acD
 * 
 */
public class StringHashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("abc");
		String s2 = new String("acD");
		String s3 = "abc";
		System.out.println(s1.hashCode()+"-----"+s2.hashCode()+"-----"+s3.hashCode());//两个字符串的哈希值是相同的 
		
		System.out.println(s1==s2);// == 比较的就是真正的地址值，false
		
		System.out.println(s1.hashCode() == s2.hashCode());//true
		
		System.out.println(s1.equals(s2));//false比较内容
		
		int h1 = "重地".hashCode();
		int h2 = "通话".hashCode();
		System.out.println(h1+"------"+h2);
	}

}
