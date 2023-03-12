package in.ineuron.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.EngCourses;

public class ClientApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");

		EngCourses course0 = factory.getBean("in.ineuron.bean.EngCourses#0", EngCourses.class);
		System.out.println(course0);

		System.out.println();

		EngCourses course1 = factory.getBean("in.ineuron.bean.EngCourses#1", EngCourses.class);
		System.out.println(course1);

		System.out.println();

		EngCourses course2 = factory.getBean("in.ineuron.bean.EngCourses#2", EngCourses.class);
		System.out.println(course2);

	}
}

//Output:
//	EngCourse.class is loading...
//	EngCourse object is instantiated :: Zero param constructor...
//	EngCourses [subjects=[DMS, DS, M3]]
//
//	EngCourse object is instantiated :: Zero param constructor...
//	EngCourses [subjects=[GTC, ADA, M4]]
//
//	EngCourse object is instantiated :: Zero param constructor...
//	EngCourses [subjects=[OS, FLAT, CompilerDesign]]