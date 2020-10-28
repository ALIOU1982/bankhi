package org.immo.bankhi.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
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
@Table(name="Nature_Immo")
public class NatureImmo implements Serializable{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@SuppressWarnings("unused")
	private String nomNature;
	
	@SuppressWarnings("unused")
	private String description;
	
	@OneToOne(cascade = CascadeType.ALL ) 
	@JoinColumn( name="idImmobilisation" )
	private Immobilisation immoblisation;

}
