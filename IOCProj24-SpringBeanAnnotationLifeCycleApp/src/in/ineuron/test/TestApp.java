package in.ineuron.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.VoterVerifier;

public class TestApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");

		System.out.println("Instantiation of Bean");

		VoterVerifier voterVerifier = applicationContext.getBean("voterVerifier", VoterVerifier.class);
		System.out.println(voterVerifier);

		String status = voterVerifier.checkEligibility();
		System.out.println(status);

		applicationContext.close();
		System.out.println("Deinstantiation of Bean...");
	}
}