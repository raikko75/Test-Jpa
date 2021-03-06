package banque;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="operation")
public class Operation {
	@Id
	private long id_operation;
	@Column(name="date")
	private LocalDateTime date;
	
	@Column(name="montant")
	private double montant;
	
	@Column(name="motif")
	private String motif;
	
	@ManyToOne
	@JoinColumn(name="id_compte")
	private Compte compte;
	
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	
	public Operation()
	{
		
	}
}
