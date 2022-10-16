package com.masai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "account.getBalance",query = "from Account where balance <:bal")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accno;
	@Column(name="aname")
	private String name;
	private double balance;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(int accno, String name, double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
}
