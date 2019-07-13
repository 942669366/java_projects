package com.itheima.demo03_迭代器Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 集合的遍历:
 * 		在根接口中 使用了一种公共的遍历方式,迭代器遍历
 * 1.获取一个集合的迭代器对象(迭代器对象不是我们创建的,而是每个集合自带)
 * 2.通过循环反复调用 迭代器对象的  hasNext 和 next 方法
 * 
 */
public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.创建一个集合对象,使用多态
		Collection<String> names = new ArrayList<String>();
		//2.添加
		names.add("郭德纲");
		names.add("刘德华");
		names.add("柳岩");
		names.add("范伟");
		names.add("范伟1");
		//3.获取names集合的迭代器对象
		Iterator<String> it = names.iterator();
		//4.标准代码
		while(it.hasNext()){//反复判断有没有下一个元素
			String s = it.next();//如果有取出下一个元素
			System.out.println(s);
		}
		
		
	}

}
