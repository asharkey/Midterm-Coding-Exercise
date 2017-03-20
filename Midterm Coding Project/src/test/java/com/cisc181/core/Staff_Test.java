package com.cisc181.core;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Date;
import com.cisc181.eNums.eTitle;

public class Staff_Test {

	double CalcAnswer = 0;
	double ExpecAnswer = 0;
	
	@BeforeClass
	public static void setup() {
	}
	
	@Test 
	public void test() {
	
	Staff Aidan = new Staff(com.cisc181.eNums.eTitle.MR);
	Staff Hannah = new Staff(com.cisc181.eNums.eTitle.MS);
	Staff Chris = new Staff(com.cisc181.eNums.eTitle.MR);
	Staff Nick = new Staff(com.cisc181.eNums.eTitle.MR);
	Staff Andrew = new Staff(com.cisc181.eNums.eTitle.MR);
	
	Aidan.setSalary(41000);
	Hannah.setSalary(52000);
	Chris.setSalary(37000);
	Nick.setSalary(48000);
	Andrew.setSalary(67000);
	
	ArrayList<Staff> SalaryList = new ArrayList<Staff>();
	SalaryList.add(Aidan);
	SalaryList.add(Hannah);
	SalaryList.add(Chris);
	SalaryList.add(Nick);
	SalaryList.add(Andrew);
	
	for(int i = 0; i<SalaryList.size(); i++){
		CalcAnswer += SalaryList.get(i).getSalary();
	}
	
	CalcAnswer = CalcAnswer/SalaryList.size();
	ExpecAnswer = ((41000)+(52000)+(37000)+(48000)+(67000))/5;
	
	
	assertEquals(CalcAnswer,ExpecAnswer, 0.01);
	}
	
		
	
	@Test(expected = PersonException.class)
	public void PhoneTest() throws PersonException	
	{
		Staff Alex = new Staff(com.cisc181.eNums.eTitle.MR);
		Alex.setPhone("9739700747");	
	}
	@Test(expected = PersonException.class)
	public void CalendarTest() throws PersonException
	{
		Staff Larry = new Staff(com.cisc181.eNums.eTitle.MR);
		Calendar calendarTest = Calendar.getInstance();	
		calendarTest.add(Calendar.YEAR, 108);
		Larry.setDOB(calendarTest.getTime());
	}

}
