package org.immo.bankhi.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	@OneToOne
	@JoinColumn(name="idPersonneImmo", nullable=true )
	private PersonneImmo personneImmo;
}
