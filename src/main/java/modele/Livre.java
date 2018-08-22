package modele;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Livre")
public class Livre {

@Id
private int id;
@Column(name="AUTEUR")
private String auteur;
@Column(name="TITRE")
private String titre; 

@ManyToMany
@JoinTable(name="compo",
joinColumns= @JoinColumn(name="ID_emp", referencedColumnName="ID"),
inverseJoinColumns= @JoinColumn(name="ID_liv", referencedColumnName="ID"))
private Set<Emprunt> emprunt;


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getAuteur() {
	return auteur;
}

public void setAuteur(String auteur) {
	this.auteur = auteur;
}

public String getTitre() {
	return titre;
}

public void setTitre(String titre) {
	this.titre = titre;
}

public Set<Emprunt> getEmprunt() {
	return emprunt;
}

public void setEmprunt(Set<Emprunt> emprunt) {
	this.emprunt = emprunt;
}


}
