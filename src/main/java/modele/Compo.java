package modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compo")
public class Compo {
@Id
private int id;
@Column(name="ID_EMP")
private String id_temp;
@Column(name="ID_LIV")
private String id_liv;



}
