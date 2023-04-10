package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		ATM atm = context.getBean(ATM.class);
		String string = atm.withdraw();
		System.out.println("Status : " + string);
	}
}
