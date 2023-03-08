package in.ineuron.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.A;
import in.ineuron.bean.B;

public class ClientApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");

		A a = factory.getBean("a1", A.class);
		B b = factory.getBean("b1", B.class);

		System.out.println(a);
		System.out.println(b);

	}
}

//Output:
//	A.class is loading...
//	A object is instantiated...
//	B.class is loading...
//	B object is instantiated...