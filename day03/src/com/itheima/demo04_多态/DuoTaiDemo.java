package com.itheima.demo04_多态;
/*
 * 		面向对象有三大特点:封装(安全性),继承(扩展性),多态(灵活性)
 * 多态:
 * 		是指对象的多态
 * 			一个对象 的多种状态
 * 			比如: 一只狗  是狗,是动物,是生物
 * 			比如: 一个人 是人,是动物,是生物
 * 			比如: 你 在学校是学生,在家里是儿子,在公司员工,在外面老大
 * 		在java中的多态
 * 			前提:
 * 				1.必须有子父类关系 (必须有继承)
 * 				2.必须有方法的重写
 * 			多态在java中表现形式:
 * 				父类类型  变量名 = new 子类类型();
 * 				父类类型的变量 指向了  子类的对象
 * 			案例:
 * 				public class Animal{}
 * 				public class Dog extends Animal{}
 * 				public class BigYellowDog extends Dog{}
 * 				代码体现:
 * 				Dog d = new Dog();
 * 				Animal an = new Dog();
 * 				多态的形式创建一个大黄狗对象
 * 				Dog d =  new BigYellowDog();
 * 				Animal an = new BigYellowDog();
 * 				
 * 
 * 
 * 
 * 
 */
public class DuoTaiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
