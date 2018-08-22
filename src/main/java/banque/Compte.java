package banque;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import modele.Emprunt;

@Entity
@Table(name="Compte")
public class Compte {
	@Id
	private long id_compte;
	@Column(name="numero")
	private String numero;
	@Column(name="solde")
	private double solde;
	@ManyToMany
	@JoinTable(name="temp",
			joinColumns= @JoinColumn(name="id_compte", referencedColumnName="id_compte"),
			inverseJoinColumns= @JoinColumn(name="id_client", referencedColumnName="id_client"))
			private List<Client> client;
	@OneToMany
	(mappedBy="compte")
	private List<Operation> operation;
	
	public Compte()
	{
		
	}

}
