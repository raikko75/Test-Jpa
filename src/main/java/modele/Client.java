package modele;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.mapping.Map;

import javax.persistence.Id;

@Entity
@Table(name="Client")
 public class Client {
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public List<Emprunt> getEmprunt() {
		return emprunt;
	}


	public void setEmprunt(List<Emprunt> emprunt) {
		this.emprunt = emprunt;
	}


	@Id
	private String id;
	@Column(name="NOM")
	private String nom;
	@Column(name="PRENOM")
	private String prenom;
	
	@OneToMany(mappedBy="client")
	private List<Emprunt> emprunt;
	
	

public Client()
{
	
}
}