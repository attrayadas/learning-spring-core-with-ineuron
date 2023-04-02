package in.ineuron.main;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.controller.CustomerController;
import in.ineuron.vo.CustomerVo;

public class ClientApp {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the CustomerName :: ");
		String customerName = scanner.next();

		System.out.print("Enter the CustomerAddr :: ");
		String customerAddress = scanner.next();

		System.out.print("Enter the Principal Amount :: ");
		String pamount = scanner.next();

		System.out.print("Enter the Time period :: ");
		String time = scanner.next();

		System.out.print("Enter the Rate of Interest :: ");
		String rate = scanner.next();

		CustomerVo vo = new CustomerVo();
		vo.setCustomerAddress(customerAddress);
		vo.setCustomerName(customerName);
		vo.setPamt(pamount);
		vo.setRate(rate);
		vo.setTime(time);

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");

		CustomerController controller = factory.getBean("controller", CustomerController.class);
		String result = controller.processResult(vo);
		System.out.println(result);

		scanner.close();
	}
}

//Output:
//	Enter the CustomerName :: Attraya
//	Enter the CustomerAddr :: Kolkata
//	Enter the Principal Amount :: 25000
//	Enter the Time period :: 5
//	Enter the Rate of Interest :: 8
//	CustomerMySQLDAOImpl.class file is loading...
//	CustomerMySQLDAOImp:: 1 param constructor...
//	CustomerMgmtServiceImpl.class file is loading...
//	CustomerMgmtServiceImpl:: One param constructor..
//	Controller.class file is loading...
//	MainController:: one param constructor...
//	Customer Registration Successful :: 25000.0 Interest :: 10000.0