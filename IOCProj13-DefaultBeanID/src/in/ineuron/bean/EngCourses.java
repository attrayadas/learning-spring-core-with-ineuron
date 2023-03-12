package in.ineuron.bean;

import java.util.Set;

public class EngCourses {
	private Set<String> subjects;

	static {
		System.out.println("EngCourse.class is loading...");
	}

	public EngCourses() {
		System.out.println("EngCourse object is instantiated :: Zero param constructor...");
	}

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "EngCourses [subjects=" + subjects + "]";
	}

}
