package com.clq.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringText {
	public static void main(String[] args) {
	//���������ļ�	
	ApplicationContext app=new ClassPathXmlApplicationContext("bean.xml");
	Spring1 sp=(Spring1)app.getBean("spring2");
		System.out.println(sp);
	}
}
