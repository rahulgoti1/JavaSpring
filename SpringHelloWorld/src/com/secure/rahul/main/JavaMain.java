package com.secure.rahul.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.secure.rahul.bean.HW;

public class JavaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HW obj = (HW) context.getBean("hW");

		obj.setMessage("Daud Bhai");
		obj.getMessage();

	}

}
