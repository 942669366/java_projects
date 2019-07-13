package com.itheima.demo00_反馈和回顾;


/*
 * 泛型不能是基本类型
 * 
 * 类中各种成员的初始化的顺序
 *
 *1、如果类中存在继承关系(像 Son 继承Fathor) 则首先会初始化到处类(Son)的基类(Fathor),然后再是导出类
 *2、在基类首先会初始化静态的东西，静态代码 >静态变量> 而且至初始化一次 (因为静态的东西都是跟类的加载而加载的)
 *3、随后初始化导出类的静态东西 跟基类的静态初始化一样(同上)
 *4、初始化基类无参构造器(注意：导出类的成员变量和代码块都是比构造函数的初始化要早。。看输出结果可知)
 *
 * 
 * 
 */
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,6,7,9};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
