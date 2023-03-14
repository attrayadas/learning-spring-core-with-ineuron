package in.ineuron.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.Flipkart;

public class ClientApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");

		Flipkart flipkart = factory.getBean("fpkt", Flipkart.class);
		System.out.println(flipkart.shopping(new String[] { "fossil", "puma", "iPhone" },
				new float[] { 35000.5f, 56000.0f, 75000.35f }));

	}
}

//Output:
//	FirstFlight.class file is loading...
//	FirstFlight object is instantiated...
//	Flipkart.class file is loading...
//	Flipkart object is created through Constructor:: One param constructor
//	Flipkart.setRegNo()
//	Flipkart.shopping()
//	in.ineuron.bean.FirstFlight
//	[fossil, puma, iPhone]are purchase having prices [35000.5, 56000.0, 75000.35] with the bill amount :: 166000.84---> FirstFlight courier will deliver with the order id :: 403 order products