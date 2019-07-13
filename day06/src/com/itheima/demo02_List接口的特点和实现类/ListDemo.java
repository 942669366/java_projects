package com.itheima.demo02_List接口的特点和实现类;

import java.util.LinkedList;

/*
 * List接口的特点：
 * 				a、有下标
 * 				b、有序(有序不是自然顺序，不是123.abc,有序值的是存和取的顺序一致)
 * 				c、可重复
 * 				实现类：ArrayList,LinkedList,Vector
 * 				ArryList:底层采取数组结构，查询快，增删慢
 * 				LinkedList:底层采用链表结构，查询慢，增删快
 * 				Vector:底层采用数组的结构，查询快，增删慢
 * 				List结构中具有的方法：
 * 				增：add(E e);add(int index ,E e)
 * 				删：remove(Object obj);remove(int index)
 * 				改：set(int index ,E e)
 * 				查：get(int index)
 * 					其他：
 * 						size(),clear(),contains(Object obj),toArray()
 * 						iterator();isEmpty()
 * 				实现类的方法：
 * 				1、ArrayList:方法基本和List中定义的一摸一样
 * 				2、LinkedList:除了和List接口中一样的方法之外
 * 					LinkedList提供了大量首位操作的方法
 * 					第一组：
 * 					void addFirst(E e);
 * 					void addLast(E e);
 * 					第二组：
 * 					void removeFirst(E e);//删除列表中的首个元素，并将其返回
 * 					void removeLast(E e);//删除列表中的最后一个元素，并将其返回
 * 					第三组：
 * 					E getFirst();//获取列表中首个元素，并将其返回
 * 					E getLast();//获取列表中的最后一个元素，并将其返回
 * 					第四组：
 * 					E pop();//弹出，删除集合中的某一个元素，和removeFirst功能是一样的
 * 					void push(E e);//推出，把一个元素添加到集合中，和addFirst功能是一样的
 * 
 * 					
 * 
 * 
 */
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1、测试LinkedList中四组特有方法
		LinkedList<String> c = new LinkedList<String>();
		//2、添加数据
		c.addFirst("郭德纲");
		c.addFirst("关羽");
		c.addFirst("李逍遥");
		c.addFirst("李逵");
		c.addFirst("刘德华");
		c.addLast("安吉拉");
		System.out.println(c);
		//3、删除方法
			//删除首个元素
//		String rf = c.removeFirst();
//		System.out.println(rf);
//		System.out.println(c);
			//删除最后一个元素
//		String rf1 = c.removeLast();
//		System.err.println(rf1);
//		System.out.println(c);
		//4、获取方法
			//获取首个元素的方法
//		String gt = c.getFirst();
//		System.out.println(gt);
//		System.out.println(c);
		
			//获取最后一个元素的方法	
//		String gt1 = c.getLast();
//		System.out.println(gt1);
//		System.out.println(c);
		
		
		//pop()方法
//		String p = c.pop();
//		System.out.println(p);
//		System.out.println(c);
		
		//push()方法
		c.push("jeck");
		System.out.println(c);
		}

}
