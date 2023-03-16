package in.ineuron.main;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.controller.CustomerController;
import in.ineuron.vo.CustomerVo;

public class ClientApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

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

		CustomerController controller = factory.getBean("controller", CustomerController.class);
		String result = controller.processResult(vo);
		System.out.println(result);

		scanner.close();

	}
}

//Output:
//	CustomerMySQLDAOImpl.class file is loading...
//	CustomerMySQLDAOImp:: 1 param constructor...
//	CustomerMgmtServiceImpl.class file is loading...
//	CustomerMgmtServiceImpl:: One param constructor..
//	Controller.class file is loading...
//	MainController:: one param constructor...
//	Enter the CustomerName :: Nitin
//	Enter the CustomerAddr :: BLR
//	Enter the Principal Amount :: 51000
//	Enter the Time period :: 7
//	Enter the Rate of Interest :: 9
//	Customer Registration Successful :: 51000.0 Interest :: 32130.0