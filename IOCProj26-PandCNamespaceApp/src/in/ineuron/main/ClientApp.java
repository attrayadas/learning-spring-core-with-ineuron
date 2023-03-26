package in.ineuron.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Employee;

public class ClientApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		Employee employee = factory.getBean("emp", Employee.class);
		System.out.println(employee);

		factory.close();
	}
}

//Output:
//	Department :: Constructor Injection...
//	Employee :: Setter Injection...
//	Employee [eno=12, ename=Attraya, dob=Sun Jan 03 02:11:34 IST 1993, dept=Department [dno=3, dname=Maersk, dos=Sun Mar 26 02:11:34 IST 2023]]