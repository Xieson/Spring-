package com.clq.Springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springtest {
	public static void main(String[] args){
	//	System.out.println("Holle word");
	ApplicationContext app=new ClassPathXmlApplicationContext("dean1.xml");
	Springbean1 ad=(Springbean1) app.getBean("dean2");
	System.out.println(ad);
	}
}
