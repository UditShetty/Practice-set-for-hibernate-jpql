package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.model.Account;
import com.masai.utility.EmUtil;


public class Demo {

	public static void main(String[] args) {
//	1.	get the Account detail using where clause
//		EntityManager em=EmUtil.provideEntityManager();
//		
//		String jpql="from Account where aname='udit'";
//		
////		Query q=em.createQuery(jpql);
////		
////		Object obj=q.getSingleResult();
////		Account acc=(Account)obj;
//		
////		instead of query we use typed query for single result object like 
////								OR
//		TypedQuery<Account> tc= em.createQuery(jpql,Account.class);
//		
//		Account acc=tc.getSingleResult();
//		
//		System.out.println(acc);
//		
//		em.close();
		
//	2.	update the account balance using bulk update 
//		EntityManager em= EmUtil.provideEntityManager();
//		
//		String jpql= "update Account set balance=balance+500";
//		
//		Query q= em.createQuery(jpql);
//		
//		em.getTransaction().begin();
//		int x= q.executeUpdate();
//		em.getTransaction().commit();
//		
//		System.out.println(x+" row updated...");
		
//	3.	update account balance using positional parameter
		
//		EntityManager em= EmUtil.provideEntityManager();
//		
//		
//		String jpql= "update Account set balance=balance+?1 where aname=?2";
////		in above line 1 and 2 represent as consecutive no
//		Query q= em.createQuery(jpql);
//		
//		q.setParameter(1, 10000.00);
//		q.setParameter(2, "juhi");
//		
//		em.getTransaction().begin();
//		int x=q.executeUpdate();
//		em.getTransaction().commit();
//		
//		
//		System.out.println(x+" record updated...");
		
//	4. update account using named parameter
		
//		EntityManager em= EmUtil.provideEntityManager();
//		
//		
//		String jpql= "update Account set balance=balance+:bal where name=:nm";
//		
//		Query q= em.createQuery(jpql);
//		
//		q.setParameter("bal", 6000.00);
//		q.setParameter("nm", "juhi");
//		
//		em.getTransaction().begin();
//		int x=q.executeUpdate();
//		em.getTransaction().commit();
//		
//		
//		System.out.println(x+" record updated...");
		
//	5.	ex:- for 1 row and 1 column:-
		
//		EntityManager em= EmUtil.provideEntityManager();
//
//		String jpql ="select name from Account where accno =:ano";		
//		String jpql ="select a.name from Account a where accno =:ano";	
//		Query q= em.createQuery(jpql);
//
//		 q.setParameter("ano", 8);
//		
//		 String n= (String)q.getSingleResult();
//		 
//		 System.out.println("Name is : "+n);


//			TypedQuery<String> q=em.createQuery(jpql,String.class);
//			
//			q.setParameter("ano", 10);
//			
//			String n= q.getSingleResult();
//			
//	
//			System.out.println("Name is : "+n);
		
//	6.		multiple row single column
		
		
//		EntityManager em= EmUtil.provideEntityManager();
//		
//		
//		String jpql= "select balance from Account";
//		
//		TypedQuery<Double> q=em.createQuery(jpql,Double.class);
//		
//		List<Double> list= q.getResultList();
//		
////		list.forEach(li->System.out.println(li));  //using for each function
//		for(Double li:list) {
//			System.out.println(li);  //using for loop
//		}
////		System.out.println(list);    //using to string method
		
		
//	7.	few column and multiple row
		
		
//		EntityManager em= EmUtil.provideEntityManager();
//		
//		
//		String jpql= "select name,balance from Account";
//		
//		Query q= em.createQuery(jpql);
//
//	
//	
//	 	List<Object[]> results= q.getResultList();
//	 
////	 	printing using for loop
////	 	for(Object[] or: results) {
////	 		
////	 		 String name= (String)or[0];
////	 		 double balance= (Double)or[1];
////	 		
////	 		 System.out.println("Name is "+name);
////	 		 System.out.println("Balance is :"+balance);
////	 		 
////	 		System.out.println("===========================");
////	 	}
//	 	
////	 	printing using for each 
//	 	results.forEach(li->{
//	 		String name= (String)li[0];
//	 		 double balance= (Double)li[1];
//	 		
//	 		 System.out.println("Name is "+name);
//	 		 System.out.println("Balance is :"+balance);
//	 		 
//	 		System.out.println("===========================");
//	 	});
		
		
//	8.	few column with single record
		
		
//		EntityManager em= EmUtil.provideEntityManager();
//		
//		String jpql= "select name,balance from Account where accno= :ano";
		


//		Query q= em.createQuery(jpql);
//
//		q.setParameter("ano", 104);
//	
//	 	 Object obj= q.getSingleResult();
//	 
//	 	 	Object[] or= (Object[])obj;
//	 	 
	 	 
//	 	TypedQuery<Object[]> tq= em.createQuery(jpql, Object[].class);
//		
//	 	tq.setParameter("ano",104);
//	 	
//	 	Object[] or= tq.getSingleResult();
//		
//	 	
//		
//		
//	 		
//	 		 String name= (String)or[0];
//	 		 int balance= (Integer)or[1];
//	 		
//	 		 System.out.println("Name is "+name);
//	 		 System.out.println("Balance is :"+balance);
//	 			
//		em.close();
		
		
//	9. 	Aggregate function
		
//		EntityManager em= EmUtil.provideEntityManager();
//		
//		
//		String jpql= "select sum(balance) from Account";
//		
//		TypedQuery<Double> q=em.createQuery(jpql,Double.class);
//		
//		double result= q.getSingleResult();
//
//		System.out.println(result);
		
// 10.	Named queries
		
//		EntityManager em= EmUtil.provideEntityManager();
//		
//		
//		Query q= em.createNamedQuery("account.getBalance");
//		
//		q.setParameter("bal", 155000.0);
//		
//		List<Account> list= q.getResultList();
//		
//		list.forEach(a -> System.out.println(a));


	}
}
