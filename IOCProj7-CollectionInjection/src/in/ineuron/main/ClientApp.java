package in.ineuron.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.College;
import in.ineuron.bean.ContactsInfo;
import in.ineuron.bean.MarksInfo;
import in.ineuron.bean.UniversityInfo;

public class ClientApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");

		// Array object is injected
		MarksInfo marksInfo = factory.getBean("marksInfo", MarksInfo.class);
		System.out.println(marksInfo);

		System.out.println();

		// List object is injected
		College clg = factory.getBean("college", College.class);
		System.out.println(clg);

		System.out.println();

		// Set object is injected
		ContactsInfo info = factory.getBean("cinfo", ContactsInfo.class);
		System.out.println(info);

		System.out.println();

		// Map object is injected
		UniversityInfo universityInfo = factory.getBean("university", UniversityInfo.class);
		System.out.println(universityInfo);
	}
}