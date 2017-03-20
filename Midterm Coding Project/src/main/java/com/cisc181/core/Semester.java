package com.cisc181.core;

import java.util.Date;
import java.util.UUID;


public class Semester {

	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	//---------------------------------------------------------------------
	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
		//getter and setter for SemesterID
	}
	//--------------------------------------------------------------------
	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
		//getter and setter for StartDate
	}
	//---------------------------------------------------------------------
	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
		//getter and setter for EndDate
	}
	//------------------------------------------------------------------------
}
