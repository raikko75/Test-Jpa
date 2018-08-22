package modele;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Emprunt")
public class Emprunt {
@Id
private String id;
@Column(name="DATE_DEBUT")
private String date_debut;
@Column(name="DATE_FIN")
private String date_fin;
@Column(name="DELAI")
private String delai;

@ManyToOne 
@JoinColumn(name="id_client")
private Client client;
@ManyToMany(mappedBy="emprunt")
private List<Livre> livre;

public List<Livre> getLivre() {
	return livre;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}

public void setLivre(List<Livre> livre) {
	this.livre = livre;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getDate_debut() {
	return date_debut;
}

public void setDate_debut(String date_debut) {
	this.date_debut = date_debut;
}

public String getDate_fin() {
	return date_fin;
}

public void setDate_fin(String date_fin) {
	this.date_fin = date_fin;
}

public String getDelai() {
	return delai;
}

public void setDelai(String delai) {
	this.delai = delai;
}


}
