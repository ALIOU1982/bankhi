package org.immo.bankhi.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@SuppressWarnings("serial")
@Entity
@AllArgsConstructor 
@NoArgsConstructor 
@Data 
@ToString
@Table(name="Adresse")
public class Adresse implements Serializable {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomVille;
	
	private String quartier;
	
	private String telephone;
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL ) 
	@JoinColumn( name="idLieuImmo" )
	private LieuImmo lieuImmo;
	
	@ManyToOne
	@JoinColumn(name="idPersonneImmo", nullable=false)
	private PersonneImmo personneImmo;
}
