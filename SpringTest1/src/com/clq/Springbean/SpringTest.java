package com.clq.Springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("bean.xml");
//		UsreSpring2 usre=(UsreSpring2) app.getBean("dean2");
//		System.out.println(usre);
		Springtext sp=(Springtext)app.getBean("springtext");
		sp.add();
	}

}
