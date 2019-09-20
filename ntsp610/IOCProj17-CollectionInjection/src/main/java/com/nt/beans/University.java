package com.nt.beans;

import java.util.Date;
import java.util.Map;

public class University {
	private Map<String,String> facultySubjects;
	private Map<String,Date>  facultyDOBs;
	
	public void setFacultySubjects(Map<String, String> facultySubjects) {
		this.facultySubjects = facultySubjects;
	}
	public void setFacultyDOBs(Map<String, Date> facultyDOBs) {
		this.facultyDOBs = facultyDOBs;
	}
	@Override
	public String toString() {
		return "University [facultySubjects=" + facultySubjects + ", facultyDOBs=" + facultyDOBs + "]";
	}
	
	

}
