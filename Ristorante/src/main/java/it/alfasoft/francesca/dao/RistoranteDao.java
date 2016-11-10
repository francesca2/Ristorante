package it.alfasoft.francesca.dao;

import hibernateUtil.HibernateUtil;

import it.alfasoft.francesca.bean.Ristorante;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RistoranteDao {

	public boolean aggiungiRistorante(Ristorante r)
	{
		boolean b=false;
		
		Session session =HibernateUtil.openSession();
		Transaction tx=null;

		try{
		tx=session.getTransaction();
		tx.begin();
		
		session.persist(r);
		
		 b=true;
		 tx.commit();
		}catch(Exception ex){
			tx.rollback();
		}finally{
			session.close();
		}
		
		return b;

	}
	
	public Ristorante trovaRistorante(String nome)
	{
		Ristorante r=null;
		Session session =HibernateUtil.openSession();
		Transaction tx=null;

		try{
		tx=session.getTransaction();
		tx.begin();

		Query query=session.createQuery("from Ristorante where nome=:x1");
		query.setString("x1", nome);
		
		r=(Ristorante) query.uniqueResult();
		 
		 tx.commit();
		}catch(Exception ex){
			tx.rollback();
		}finally{
			session.close();
		}
		
		return r;
	}
	
	public Ristorante trovaRistoranteConId(long id)
	{
		Ristorante r=null;
		Session session =HibernateUtil.openSession();
		Transaction tx=null;

		try{
		tx=session.getTransaction();
		tx.begin();

		Query query=session.createQuery("from Ristorante where id_Ristorante=:x1");
		query.setLong("x1", id);
		
		r=(Ristorante) query.uniqueResult();
		 
		 tx.commit();
		}catch(Exception ex){
			tx.rollback();
		}finally{
			session.close();
		}
		
		return r;
	}
	
	
	public boolean aggiornaRistorante(Ristorante r)
	{
		boolean result=false;
		Session session =HibernateUtil.openSession();
		Transaction tx=null;

		try{
		tx=session.getTransaction();
		tx.begin();
		
		session.update(r);
		result=true;
		 
		 tx.commit();
		}catch(Exception ex){
			tx.rollback();
		}finally{
			session.close();
		}
		
		return result;
	}
	

	public boolean eliminaRistorante(Ristorante r)
	{
		boolean result=false;
		Session session =HibernateUtil.openSession();
		Transaction tx=null;

		try{
		tx=session.getTransaction();
		tx.begin();
		
		session.delete(r);
		result=true;
		 
		 tx.commit();
		}catch(Exception ex){
			tx.rollback();
		}finally{
			session.close();
		}
		return result;
}



	
}
