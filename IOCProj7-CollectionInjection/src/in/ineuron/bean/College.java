package in.ineuron.bean;

import java.util.Date;
import java.util.List;

public class College {

	private List<String> nameList;
	private List<Date> dateList;

	static {
		System.out.println("College.class is loading...");
	}

	public College() {
		System.out.println("College object is instantiated...");
	}

	public void setNameList(List<String> nameList) {
		System.out.println("College.setNameList()");
		this.nameList = nameList;
		System.out.println(nameList.getClass()); // class java.util.ArrayList
	}

	public void setDateList(List<Date> dateList) {
		System.out.println("College.setDateList()");
		this.dateList = dateList;
	}

	@Override
	public String toString() {
		return "College [nameList=" + nameList + ", dateList=" + dateList + "]";
	}

}
