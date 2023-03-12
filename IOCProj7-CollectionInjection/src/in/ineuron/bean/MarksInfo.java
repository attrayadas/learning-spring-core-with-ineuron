package in.ineuron.bean;

import java.util.Arrays;
import java.util.Date;

public class MarksInfo {
	private int marks[];
	private Date dates[];

	static {
		System.out.println("MarksInfo.class file is loading...");
	}

	public MarksInfo() {
		System.out.println("Object created using zero arg constructor...");
	}

	public void setMarks(int[] marks) {
		System.out.println("MarksInfo.setMarks()");
		this.marks = marks;
	}

	public void setDates(Date[] dates) {
		System.out.println("MarksInfo.setDates()");
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "MarksInfo [marks=" + Arrays.toString(marks) + ", dates=" + Arrays.toString(dates) + "]";
	}

}
