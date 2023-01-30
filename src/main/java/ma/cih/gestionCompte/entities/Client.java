package ma.cih.gestionCompte.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Client  implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(length = 25)
	String nom;
	@OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
	@JsonIgnore
	@XmlTransient
	Collection<Compte>comptes;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(Long id, String nom, Collection<Compte> comptes) {
		super();
		this.id = id;
		this.nom = nom;
		this.comptes = comptes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Collection<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	

}
