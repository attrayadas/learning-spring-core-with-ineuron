package in.ineuron.bean;

public class Person {
	private String pname;
	private Integer pid;
	private String paddress;
	private float income;

	static {
		System.out.println("Person.class is loading...");
		System.out.println("**************************************");
	}

	public Person() {
		System.out.println("Person object is instantiated using zero argument constuctor");
	}

	public void setPname(String pname) {
		System.out.println("Person.setPname()");
		this.pname = pname;
	}

	public void setPid(Integer pid) {
		System.out.println("Person.setPid()");
		this.pid = pid;
	}

	public void setPaddress(String paddress) {
		System.out.println("Person.setPaddress()");
		this.paddress = paddress;
	}

	public void setIncome(float income) {
		System.out.println("Person.setIncome()");
		this.income = income;
	}

	public Person(String pname, Integer pid, String paddress, float income) {
		System.out.println("Person object is created by Constructor injection");
		this.pname = pname;
		this.pid = pid;
		this.paddress = paddress;
		this.income = income;
	}

	@Override
	public String toString() {
		return "Person [pname=" + pname + ", pid=" + pid + ", paddress=" + paddress + ", income=" + income + "]";
	}

}
