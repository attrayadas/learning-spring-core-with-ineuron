package in.ineuron.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.target.Flipkart;

public class ClientApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");

		Flipkart flipkart = applicationContext.getBean("fpkt", Flipkart.class);
		System.out.println(flipkart.shopping(new String[] { "fossil", "puma", "iphone" },
				new float[] { 35000.5f, 56000.0f, 75000.35f }));

		applicationContext.close();
	}
}
