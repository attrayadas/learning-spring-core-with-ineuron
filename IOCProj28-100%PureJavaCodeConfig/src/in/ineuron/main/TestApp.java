package in.ineuron.main;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.cfg.AppConfig;
import in.ineuron.comp.WishMessageGenerator;

public class TestApp {

	public static void main(String[] args) throws IOException {
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("******Container started******");

		System.in.read();

		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg);
		System.out.println(wmg.greetMessage("Attraya"));

		((AbstractApplicationContext) factory).close();
		System.out.println("******Container closed******");
	}

}
