package in.ineuron.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.PersonInfo;

public class ClientApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");

		PersonInfo personInfo1 = factory.getBean("per1", PersonInfo.class);
		System.out.println(personInfo1);

		System.out.println();

		PersonInfo personInfo2 = factory.getBean("per2", PersonInfo.class);
		System.out.println(personInfo2);

	}
}

//Output:
//	PersonInfo :: 5 param constructor
//	PersonInfo [pno=7, pname=dhoni, dob=Sun Jan 03 22:21:39 IST 1993, doj=Mon Dec 22 22:21:39 IST 2014, dom=Wed Apr 05 22:21:39 IST 2017]
//
//	PersonInfo :: 5 param constructor
//	PersonInfo [pno=45, pname=rohit, dob=null, doj=null, dom=Wed Apr 05 22:21:39 IST 2017]