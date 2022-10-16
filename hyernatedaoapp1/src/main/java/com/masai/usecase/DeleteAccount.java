package com.masai.usecase;

import java.util.Scanner;

import com.masai.model.AccountDao;
import com.masai.model.AccountDaoImpl;

public class DeleteAccount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the accno");
		int accno=sc.nextInt();
		
		AccountDao ad= new AccountDaoImpl();
		System.out.println(ad.deleteAccount(accno));
	}
}
