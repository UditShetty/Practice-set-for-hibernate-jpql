package com.masai.usecase;

import java.util.Scanner;

import com.masai.model.Account;
import com.masai.model.AccountDao;
import com.masai.model.AccountDaoImpl;

public class UpdateAccount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the account no.");
		int accno=sc.nextInt();
		
		AccountDao ad= new AccountDaoImpl();
		Account acc=ad.findAccount(accno);
		
		if(acc!=null) {
			System.out.println("Enter the deposit amount");
			int deposit= sc.nextInt();
			
			acc.setBalance(acc.getBalance()+deposit);
			
			boolean f=ad.updateAccount(acc);
			
			if(f) {
				System.out.println("Amount deposited");
			}
			else {
				System.out.println("not deposited");
			}
		}
	}
}
