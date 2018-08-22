package banque;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import modele.Emprunt;



@Entity
@Table(name="Client")
public class Client {
	@Id
	@GeneratedValue
	private Long id_client;
	public Long getId() {
		return id_client;
	}
	public void setId(Long id) {
		this.id_client = id;
	}
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="dateNaissance")
	private LocalDate dateNaissance;

@ManyToOne 
@JoinColumn(name="id_banque")
private Banque banque;

@ManyToMany
(mappedBy = "client")
private List<Compte> compte;

public Banque getBanque() {
	return banque;
}
public void setBanque(Banque banque) {
	this.banque = banque;
}
public List<Compte> getCompte() {
	return compte;
}
public void setCompte(List<Compte> compte) {
	this.compte = compte;
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
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
		
		
	}
	public Client(){
		
	}
}
@Embeddable
 class Adresse{
	
	private int numero;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	private String rue;
	private int codePostale;
	private String ville;
	public Adresse()
	{
		
	}
}