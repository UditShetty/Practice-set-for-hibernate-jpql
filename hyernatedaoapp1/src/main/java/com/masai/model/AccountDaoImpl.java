package com.masai.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.masai.utility.EmUtil;

public class AccountDaoImpl implements AccountDao{

	@Override
	public boolean createAccount(Account account) {
		boolean flag = false;
		
		
		EntityManager em=EmUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(account);
//		System.out.println(account);
		flag= true;
		
		
		em.getTransaction().commit();
//		System.out.println("done");
		
		em.close();
		return flag;
	}

	@Override
	public boolean deleteAccount(int accno) {
		boolean flag = false;
		
		EntityManager em=EmUtil.provideEntityManager();
		Account acc=em.find(Account.class, accno);
		if(acc!=null) {
			em.getTransaction().begin();
			
			em.remove(acc);
//			System.out.println(acc);
			flag=true;
			
			em.getTransaction().commit();
//			System.out.println("done");
		}
		else {
			System.out.println("Acccount not found");
		}
		
		em.close();
		return flag;
	}

	@Override
	public boolean updateAccount(Account account) {
		boolean flag= false;
		
		EntityManager em=EmUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(account);
//		System.out.println(account);
		flag= true;
		
		em.getTransaction().commit();

//		System.out.println("done");
		
		
		
		em.close();
		return flag;
	}

	@Override
	public Account findAccount(int accno) {
		Account acc=null;
		
		EntityManager em=EmUtil.provideEntityManager();
		
		
		acc=em.find(Account.class, accno);
//		System.out.println(acc);
		
		
		
		em.close();
		System.out.println("done");
		return acc;
		
	}

}
