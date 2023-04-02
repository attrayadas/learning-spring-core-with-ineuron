package in.ineuron.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.bean.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class TestApp {
	public static void main(String[] args) {

		// using the FileSystemResource to locate the configuration file
		FileSystemResource resource = new FileSystemResource("./src/applicationContext.xml");

		// Creating an IOC container
		@SuppressWarnings("deprecation")
		XmlBeanFactory factory = new XmlBeanFactory(resource);

		// Requesting IOC container to give the Object,searching will happen in cache
		// and if it is not found then object will created by loading and performing
		// setter injection.
		WishMessageGenerator generator1 = factory.getBean("wmg", WishMessageGenerator.class);

		// using the target object performing the operation and printing the result
		String result = generator1.generateWishMessage("sachin");
		System.out.println(result);

	}
}

//Output:
//	WishMessageGenerator.class file is loading...
//	CONSTRUCTOR INJECTION IS HAPPENING TO INJECT DATE OBJECT :: Wed Mar 08 01:42:51 IST 2023
//	SETTER INJECTION IS HAPPENING TO INJECT DATE OBJECT :: Sun Jan 03 01:42:51 IST 1993
//	Hello :: sachin Good morning!!!
