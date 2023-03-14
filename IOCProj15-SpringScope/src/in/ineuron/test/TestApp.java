package in.ineuron.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.WishMessageGenerator;

public class TestApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");

		WishMessageGenerator generator1 = factory.getBean("wmg", WishMessageGenerator.class);

		WishMessageGenerator generator2 = factory.getBean("wmg", WishMessageGenerator.class);

		System.out.println("Generator1 class object reference ::" + generator1.hashCode());
		System.out.println("Generator2 class object reference ::" + generator2.hashCode());

		System.out.println();

		String result = generator1.generateWishMessage("sachin");
		System.out.println(result);
	}
}