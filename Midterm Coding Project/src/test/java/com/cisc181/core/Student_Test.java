package com.cisc181.core;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import com.cisc181.eNums.eMajor;
import com.cisc181.core.Course;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {
	
	double GPA;
	
	private static ArrayList<Course> Course = new ArrayList<Course>();
	private static ArrayList<Semester> Semester = new ArrayList<Semester>();
	private static ArrayList<Section> Section = new ArrayList<Section>();
	private static ArrayList<Student> Students = new ArrayList<Student>();
	private static ArrayList<Enrollment> Enroll = new ArrayList<Enrollment>();

	@BeforeClass
	public static void setup() throws PersonException {
		
		//-----------------------------------------------------------------------------
		//course 1,2, and 3, each have CourseID, CourseName, GradePoints, Major
		Course Course1 = new Course();
		Course1.setCourseID(UUID.randomUUID());
		Course1.setCourseName("Chemisrty");
		Course1.setGradePoints(4);
		Course1.setMajor(eMajor.CHEM);
		Course.add(Course1);

		Course Course2 = new Course();
		Course2.setCourseID(UUID.randomUUID());
		Course2.setCourseName("Anatomy");
		Course2.setGradePoints(4);
		Course2.setMajor(eMajor.NURSING);
		Course.add(Course2);

		Course Course3 = new Course();
		Course3.setCourseID(UUID.randomUUID());
		Course3.setCourseName("Physics I");
		Course3.setGradePoints(4);
		Course3.setMajor(eMajor.PHYSICS);
		Course.add(Course3);

		//--------------------------------------------------------------------------------
		
		//semesters 1,2 each with SemesterID, StartDate, and EndDate
		Semester Semester1 = new Semester();
		Semester1.setSemesterID(UUID.randomUUID());
		Calendar calendarDate = Calendar.getInstance();
		calendarDate.set(2016, Calendar.AUGUST, 28);
		Semester1.setStartDate(calendarDate.getTime());
		calendarDate.set(2016, Calendar.DECEMBER, 17);
		Semester1.setEndDate(calendarDate.getTime());
		Semester.add(Semester1);

		Semester Semester2 = new Semester();
		Semester2.setSemesterID(UUID.randomUUID());
		calendarDate.set(2017, Calendar.FEBRUARY, 8);
		Semester2.setStartDate(calendarDate.getTime());
		calendarDate.set(2017, Calendar.MAY, 26);
		Semester2.setEndDate(calendarDate.getTime());
		Semester.add(Semester2);
		
		
		//---------------------------------------------------------------------------------
		
		
		//sections 1-6 each with CourseID, SemesterID, and RoomID
		Section FallOne = new Section();
		FallOne.setCourseID(Course1.getCourseID());
		FallOne.setSemesterID(Semester1.getSemesterID());
		FallOne.setRoomID(15);
		Section.add(FallOne);

		Section SpringOne = new Section();
		SpringOne.setCourseID(Course2.getCourseID());
		SpringOne.setSemesterID(Semester2.getSemesterID());
		SpringOne.setRoomID(35);
		Section.add(SpringOne);

		Section FallTwo = new Section();
		FallTwo.setCourseID(Course1.getCourseID());
		FallTwo.setSemesterID(Semester1.getSemesterID());
		FallTwo.setRoomID(15);
		Section.add(FallTwo);

		Section SpringTwo = new Section();
		SpringTwo.setCourseID(Course2.getCourseID());
		SpringTwo.setSemesterID(Semester2.getSemesterID());
		SpringTwo.setRoomID(35);
		Section.add(SpringTwo);

		Section FallThree = new Section();
		FallThree.setCourseID(Course1.getCourseID());
		FallThree.setSemesterID(Semester1.getSemesterID());
		FallThree.setRoomID(15);
		Section.add(FallThree);

		Section SpringThree = new Section();
		SpringThree.setCourseID(Course2.getCourseID());
		SpringThree.setSemesterID(Semester2.getSemesterID());
		SpringThree.setRoomID(35);
		Section.add(SpringThree);

		//----------------------------------------------------------------------------------------------------
		//students 1-10, each with name, major, address, phone number, and email
		Student Student1 = new Student("Aidan", "J", "Sharkey", new Date(), eMajor.PHYSICS, "24 Second Avenue",
				"973-970-0747", "ashark@udel.edu");
		Students.add(Student1);

		Student Student2 = new Student("Chris", "R", "Kontos", new Date(), eMajor.CHEM, "14 Hillsneck Road",
				"452-617-4851", "ckontos@udel.edu");
		Students.add(Student2);

		Student Student3 = new Student("Zephir", "F", "Lambert", new Date(), eMajor.NURSING, "574 Turtle Street",
				"258-619-1726", "zlambert@udel.edu");
		Students.add(Student3);

		Student Student4 = new Student("Brittany", "E", "Roman", new Date(), eMajor.BUSINESS, "95 3rd Avenue",
				"201-761-1427", "broman@udel.edu");
		Students.add(Student4);

		Student Student5 = new Student("Kelsey", "P", "Stevenson", new Date(), eMajor.PHYSICS, "67 Rea Avenue",
				"957-426-7518", "kstevenson@udel.edu");
		Students.add(Student5);

		Student Student6 = new Student("Nick", "M", "Cannella", new Date(), eMajor.BUSINESS, "34 East Tree Court",
				"674-481-5287", "ncannella@udel.edu");
		Students.add(Student6);

		Student Student7 = new Student("Alex", "J", "Wares", new Date(), eMajor.NURSING, "64 11th Street",
				"914-641-1520", "awares@udel.edu");
		Students.add(Student7);

		Student Student8 = new Student("Leah", "N", "McDonald", new Date(), eMajor.NURSING, "98 New Haven Road",
				"127-971-0270", "lmcdonald@udel.edu");
		Students.add(Student8);

		Student Student9 = new Student("Dan", "J", "LaGrone", new Date(), eMajor.CHEM, "78 Brookside Road",
				"862-425-3715", "dlagrone@udel.edu");
		Students.add(Student9);

		Student Student10 = new Student("Jennifer", "R", "Lang", new Date(), eMajor.BUSINESS, "11 Iona Place",
				"973-841-4715", "jlang@udel.edu");
		Students.add(Student10);
	}
//-------------------------------------------------------------------------------------------------------
	//GPA values, takes grade and outputs GPA for associated grade
	public void GPA(double value) {

		if ((value <= 100) && (value >= 90)) {

			GPA = 4.0;

		}

		else if ((value <= 89.99) && (value >= 80)) {

			GPA = 3.0;

		}

		else if ((value <= 79.99) && (value >= 70)) {

			GPA = 2.0;

		}

		else if ((value <= 69.99) && (value >= 60)) {

			GPA = 1.0;

		}

		else if (value <= 59.99) {

			GPA = 0;

		}

		else if ((value >= 100) && (value <= 0)) {


		}

	}
	//-----------------------------------------------------------------------------------------------------
	
	@Test
	public void ChangeMajor() {
		Students.get(6).seteMajor(eMajor.CHEM);
		assertEquals(Students.get(6).geteMajor(), eMajor.CHEM);
	}

}