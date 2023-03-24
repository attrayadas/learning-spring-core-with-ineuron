package in.ineuron.main;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");

		CustomerController controller = applicationContext.getBean("controller", CustomerController.class);
		String result = controller.processResult(vo);
		System.out.println(result);

		applicationContext.close();
		scanner.close();
	}
}

//Output:
//	Enter the CustomerName :: Attraya
//	Enter the CustomerAddr :: Bangalore
//	Enter the Principal Amount :: 336000
//	Enter the Time period :: 5
//	Enter the Rate of Interest :: 9
//	Controller.class file is loading...
//	CustomerMySQLDAOImpl.class file is loading...
//	CustomerMgmtServiceImpl.class file is loading...
//	CustomerMgmtServiceImpl:: One param constructor..
//	CustomerMySQLDAOImpl.class file is loading...
//	Customer Registration Successful :: 336000.0 Interest :: 151200.0