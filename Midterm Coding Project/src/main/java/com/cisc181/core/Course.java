package com.cisc181.core;
import com.cisc181.eNums.eMajor;
import java.util.UUID;


public class Course {
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	//--------------------------------------------------------
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
		//getter and setter for CourseID
	}
	//--------------------------------------------------------
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
		//getter and setter for CourseName
	}
	//---------------------------------------------------------
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
		//getter and setter for GradePoints
	}
	//------------------------------------------------------------
	public eMajor getMajor() {
		return Major;
	}
	public void setMajor(eMajor major) {
		Major = major;
		//getter and setter for Major
	}
	//---------------------------------------------------------------
}
