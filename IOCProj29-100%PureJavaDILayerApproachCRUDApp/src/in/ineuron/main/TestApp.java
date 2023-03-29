package in.ineuron.main;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.cfg.AppConfig;
import in.ineuron.controller.IEmployeeController;
import in.ineuron.vo.EmployeeVO;

public class TestApp {
	public static void main(String[] args) throws IOException {

		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		IEmployeeController controller = null;
		controller = factory.getBean("controller", IEmployeeController.class);

		int choice = 0;
		String ename = null, eage = null, eaddress = null;
		List<EmployeeVO> employees = null;
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("1. CREATE");
				System.out.println("2. READ");
				System.out.println("3. READ ALL RECORDS");
				System.out.println("4. UPDATE RECORD");
				System.out.println("5. DELETE RECORD");
				System.out.println("6. EXIT");
				System.out.print("Enter your choice :: ");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Enter the Employee name :: ");
					ename = scanner.next();

					System.out.print("Enter the Employee age :: ");
					eage = scanner.next();

					System.out.print("Enter the Employee address :: ");
					eaddress = scanner.next();

					EmployeeVO employeeVO = new EmployeeVO();
					employeeVO.setEname(ename);
					employeeVO.setEage(eage);
					employeeVO.setEaddress(eaddress);

					String status = controller.save(employeeVO);
					System.out.println(status);
					break;
				case 2:
					break;
				case 3:
					employees = controller.findAllEmployees();
					employees.forEach(System.out::println);
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice...Try again with valid inputs [1, 2, 3, 4, 5, 6]");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
			((AbstractApplicationContext) factory).close();
		}

	}
}
