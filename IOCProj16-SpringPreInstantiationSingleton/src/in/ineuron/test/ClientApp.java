package in.ineuron.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.bean.Flipkart;

public class ClientApp {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("IOC Container created...");

		Flipkart flipkart = context.getBean("fpkt", Flipkart.class);
		System.out.println(flipkart.shopping(new String[] { "fossil", "cryzal" }, new float[] { 3000.0f, 3000.0f }));

	}
}