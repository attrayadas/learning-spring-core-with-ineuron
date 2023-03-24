package in.ineuron.comp;

import java.util.Date;

//JDK9 supplied annotations, not from SpringFramework
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "in/ineuron/commons/inputs.properties")
public class VoterVerifier {

	@Value("${voterVerifier.name}")
	private String name;

	@Value("${voterVerifier.age}")
	private float age;

	static {
		System.out.println("VoterVerifier.class file is loading....");
	}

	public VoterVerifier() {
		System.out.println("VoterVerifier object is instantiated...");
	}

	private Date dateVerification;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public Date getDateVerification() {
		return dateVerification;
	}

	public void setDateVerification(Date dateVerification) {
		this.dateVerification = dateVerification;
	}

	@PostConstruct
	public void ourInit() {
		System.out.println("VoterVerifier.outInit():: custom init method");
		dateVerification = new Date();
		if (name == null || age < 0)
			throw new IllegalArgumentException("invalid inputs are given for name,age properties of a bean");

	}

	public String checkEligibility() {
		if (age < 18) {
			return "Mr/Miss/Mrs " + name + " u r not eligible for voting.... wait " + (18 - age)
					+ "years to cast ur vote on -->" + dateVerification;
		} else {
			return "Mr/Miss/Mrs " + name + " u r  eligible for voting.... Do not wait on --->" + dateVerification;
		}
	}

	@PreDestroy
	public void ourDestroy() {
		System.out.println("VoterVerifier.ourDestroy():: custom destroy method");

		// nullify bean properties
		name = null;
		age = 0.0f;
		dateVerification = null;
	}

	@Override
	public String toString() {
		return "VoterVerifier [name=" + name + ", age=" + age + ", dateVerification=" + dateVerification + "]";
	}

}
