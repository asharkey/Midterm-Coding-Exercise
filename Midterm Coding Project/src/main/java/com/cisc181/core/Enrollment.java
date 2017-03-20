package com.cisc181.core;
import java.util.UUID;

public class Enrollment {
	
	private UUID SectionID;
	private UUID studentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment(){

	}
	
	public Enrollment(UUID StudentID, UUID SectionID)
	{
		super();
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		this.setEnrollmentID(EnrollmentID);

	}
		//------------------------------------------------------------------------------------
		public UUID getEnrollmentID() {
			return EnrollmentID;
		}

		public void setEnrollmentID(UUID enrollmentID) {
			EnrollmentID = enrollmentID;
		}
		//-------------------------------------------------------------------------------
		public double getGrade() {
			return Grade;
		}

		public void setGrade(double grade) {
			Grade = grade;
		}
		//----------------------------------------------------------------------------------
	
}

