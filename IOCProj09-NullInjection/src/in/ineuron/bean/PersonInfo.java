package in.ineuron.bean;

import java.util.Date;

public class PersonInfo {
	private Long pno;
	private String pname;

	private Date dob;
	private Date doj;
	private Date dom;

	public PersonInfo(Long pno, String pname, Date dob, Date doj, Date dom) {
		System.out.println("PersonInfo :: 5 param constructor");
		this.pno = pno;
		this.pname = pname;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}

	@Override
	public String toString() {
		return "PersonInfo [pno=" + pno + ", pname=" + pname + ", dob=" + dob + ", doj=" + doj + ", dom=" + dom + "]";
	}

}
