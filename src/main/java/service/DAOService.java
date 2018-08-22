package service;


import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.mysql.fabric.xmlrpc.Client;

import modele.Emprunt;
import modele.Livre;


public class DAOService implements IDaoService{
	
	private EntityManager entityM;
	public DAOService(EntityManager entityM){
		this.entityM = entityM;
		
	}
	
	public Livre findById(int id) {
		Livre l1 = entityM.find(Livre.class, id);
		if(l1 !=null)
		{
			return l1;
		}
		return null;
	}
	public Livre findByTitre(String titre)
	{
		Query q = entityM.createQuery("select l from Livre l where l.titre='"+ titre +"'");
		return (Livre) q.getSingleResult();
		
		  
	}

	public modele.Client findByLivres(String name) {
		Query q = entityM.createQuery("select c from Client c where c.nom='"+name +"'");
		modele.Client  cl = (modele.Client) q.getSingleResult();
		return cl;
	}


}
