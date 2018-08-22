package service;

import com.mysql.fabric.xmlrpc.Client;

import modele.Emprunt;
import modele.Livre;

public interface IDaoService {
	Livre findById(int id);
	Livre findByTitre(String titre);
	modele.Client findByLivres(String name);
}
