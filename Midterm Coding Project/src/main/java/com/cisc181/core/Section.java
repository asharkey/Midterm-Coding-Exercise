package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	//---------------------------------------------------------------------------------
	public UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
		//getter and setter for CourseID
	}
	//---------------------------------------------------------------------------------
	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
		//getter and setter for SemesterID
	}
	//---------------------------------------------------------------------------------
	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
		//getter and setter for SectionID
	}
	//----------------------------------------------------------------------------------
	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
		//getter and setter for RoomID
	}
	//-----------------------------------------------------------------------------------

}
