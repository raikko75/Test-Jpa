
import java.util.List;
import java.util.Map;

import javax.persistence.Cache;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.SynchronizationType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.metamodel.Metamodel;

import banque.Banque;
import banque.Client;
import banque.Compte;
import banque.Operation;
import modele.Emprunt;
import modele.Livre;
import service.DAOService;

import service.IDaoService;

public class TestJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = new Persistence().createEntityManagerFactory("pu_banque");  //("pu_essai");
		EntityManager entityManager = entityManagerFactory.createEntityManager(); 
		Client c = new Client(); 
		EntityTransaction enTr = entityManager.getTransaction();
		enTr.begin();
		entityManager.persist(c);

		///////////////////////////////////////////////////

		Banque b = new Banque(); 
		entityManager.persist(b);

		Compte cte = new Compte();
		entityManager.persist(cte);

		Operation op = new Operation();
		entityManager.persist(op);
		enTr.commit();
		/*
		IDaoService ser = new DAOService(entityManager);
		Livre l1 = ser.findById(1);

		Emprunt em = new Emprunt();
		System.out.println(ser.findByLivres("YU").getEmprunt());
		 */
		//System.out.println(l1);




	}


}
