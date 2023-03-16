package in.ineuron.test;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {

		// Started a container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");

		// Prepare a locale object
		Locale locale = new Locale(args[0], args[1]);

		String cap1 = applicationContext.getMessage("btn1.cap", null, "msg1", locale);
		String cap2 = applicationContext.getMessage("btn2.cap", null, "msg2", locale);
		String cap3 = applicationContext.getMessage("btn3.cap", null, "msg3", locale);
		String cap4 = applicationContext.getMessage("btn4.cap", null, "msg4", locale);

		System.out.println(cap1 + " " + cap2 + " " + cap3 + " " + cap4);

		System.out.println();

		System.out.println(applicationContext.getMessage("btn1.cap", null, new Locale("en", "US")));
		System.out.println(applicationContext.getMessage("btn2.cap", null, new Locale("hi", "IN")));
		System.out.println(applicationContext.getMessage("btn3.cap", null, new Locale("fr", "FR")));
		System.out.println(applicationContext.getMessage("btn4.cap", null, new Locale("de", "DE")));

		applicationContext.close();
	}
}