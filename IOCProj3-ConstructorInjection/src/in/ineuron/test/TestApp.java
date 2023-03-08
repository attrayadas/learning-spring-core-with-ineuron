package in.ineuron.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.bean.Employee;

public class TestApp {
	public static void main(String[] args) {
		FileSystemResource resource = new FileSystemResource("./src/applicationContext.xml");

		@SuppressWarnings("deprecation")
		XmlBeanFactory factory = new XmlBeanFactory(resource);

		Employee employee = factory.getBean("emp", Employee.class);

		System.out.println(employee);

	}
}

//Output:
//	Employee [eno=10, ename=sachin, esalary=3500.05, eaddress=MI]