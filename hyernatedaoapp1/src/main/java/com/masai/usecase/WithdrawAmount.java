package com.masai.usecase;

import java.util.Scanner;

import org.hibernate.internal.build.AllowSysOut;

import com.masai.model.Account;
import com.masai.model.AccountDao;
import com.masai.model.AccountDaoImpl;

public class WithdrawAmount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the account no.");
		int accno=sc.nextInt();
		
		AccountDao ad= new AccountDaoImpl();
		Account acc=ad.findAccount(accno);
		
		if(acc!=null) {
			System.out.println("Enter the Withdraw amount");
			int withdraw= sc.nextInt();
			
			
			if(withdraw<=acc.getBalance()) {
			acc.setBalance(acc.getBalance()-withdraw);
			
			boolean f=ad.updateAccount(acc);
			
			if(f) {
				System.out.println("Amount withdrawn");
			}
			else {
				System.out.println("Technical Error");
			}
			}else
				System.out.println("Amount withdrawn is not more than the balance amount");
			
		}else {
			System.out.println("Accunt not found");
		}
	}
}
