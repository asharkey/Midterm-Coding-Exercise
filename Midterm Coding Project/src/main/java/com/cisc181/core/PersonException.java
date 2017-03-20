package com.cisc181.core;

public class PersonException extends Exception {

	private Person person;
	
	public Person getPerson(){
		return person;
	}
	public PersonException(Person person){
		super();
		this.person = person;
	}
	//passes the current state of the instance to the exception
}
