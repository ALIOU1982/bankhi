package org.immo.bankhi.entities;

import java.io.Serializable;

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
@NoArgsConstructor
@AllArgsConstructor 
@Data 
@ToString
@Table(name="Immo")
public class Immobilisation implements Serializable{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@SuppressWarnings("unused")
	private String nomImmo;
	
	@SuppressWarnings("unused")
	private String descriptionImmo;
	
	@OneToOne  
	@JoinColumn( name="idLieuImmo", nullable=false )
	private LieuImmo lieuImmo;
	
	@OneToOne  
	@JoinColumn( name="idNatureImmo", nullable=false )
	private NatureImmo natureImmo;
	
	@OneToOne  
	@JoinColumn( name="idTypeImmo", nullable=false )
	private TypeImmo typeImmo;
	
	@ManyToOne
	@JoinColumn(name="idPersonneImmo", nullable=false)
	private PersonneImmo personneImmo;

}
