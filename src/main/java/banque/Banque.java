package banque;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Banque")
public class Banque {
	
	@Column(name="nom")
	private String nom;
	@Id
	private long id_banque;
	@OneToMany
	(mappedBy="banque")
	private List<Client> client;
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public long getId() {
		return id_banque;
	}

	public void setId(long id) {
		this.id_banque = id;
	}
	public Banque()
	{
		
	}
}
