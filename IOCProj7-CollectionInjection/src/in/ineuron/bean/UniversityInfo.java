package in.ineuron.bean;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

public class UniversityInfo {

	private Map<Integer, String> facultyDetails;
	private Map<String, Date> dateInfo;

	private Properties technologies;

	static {
		System.out.println("UniversityInfo.class is loading...");
	}

	public UniversityInfo() {
		System.out.println("Constructor injection using Zero:param constructor...");
	}

	public void setFacultyDetails(Map<Integer, String> facultyDetails) {
		System.out.println("UniversityInfo.setFacultyDetails()");
		this.facultyDetails = facultyDetails;
		System.out.println(facultyDetails.getClass()); // class java.util.LinkedHashMap
	}

	public void setDateInfo(Map<String, Date> dateInfo) {
		System.out.println("UniversityInfo.setDateInfo()");
		this.dateInfo = dateInfo;
	}

	public void setTechnologies(Properties technologies) {
		this.technologies = technologies;
	}

	@Override
	public String toString() {
		return "UniversityInfo [facultyDetails=" + facultyDetails + ", dateInfo=" + dateInfo + ", technologies="
				+ technologies + "]";
	}

}
