package fr.treeptik.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	@NotBlank(message = "Saisir le nom")
	@NotNull
	private String nom;
	private Integer totalFacture;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateContrat;

	// private String pwd;

	public Client() {
	}

	public Client(Integer id, String nom, Integer totalFacture, Date dateContrat) {
		super();
		this.id = id;
		this.nom = nom;
		this.totalFacture = totalFacture;
		this.dateContrat = dateContrat;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", totalFacture="
				+ totalFacture + ", dateContrat=" + dateContrat + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public Integer getTotalFacture() {
		return totalFacture;
	}

	public Date getDateContrat() {
		return dateContrat;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setTotalFacture(Integer totalFacture) {
		this.totalFacture = totalFacture;
	}

	public void setDateContrat(Date dateContrat) {
		this.dateContrat = dateContrat;
	}

}
