package com.masai.usecase;

import java.util.Scanner;

import com.masai.model.Account;
import com.masai.model.AccountDao;
import com.masai.model.AccountDaoImpl;

public class CreateAccount {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the account name");
		String name=sc.next();
		
		System.out.println("Enter the balance");
		double balance=sc.nextDouble();
		
		Account account = new Account();
		account.setName(name);
		account.setBalance(balance);
		
		AccountDao ad= new AccountDaoImpl();
		boolean f=ad.createAccount(account);
		
		if(f) {
			System.out.println("Account Created");
		}
		else
			System.out.println("Technical Error");
		
	}

	
	
}
