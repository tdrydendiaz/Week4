package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length = 20)
	private String accountNumber;
	@Column (length = 30)
	private String firstName;
	@Column (length = 30)
	private String lastName;

	public Account(int id, String accountNumber, String firstName, String lastName) {
		super(); 
		this.id = id;
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Account() {
		
	}
	public int getId() {
		return id;
	} 

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
    public String toString() {
    	return String.format(firstName + " " + lastName + " owns " + accountNumber);
    }
	
}
