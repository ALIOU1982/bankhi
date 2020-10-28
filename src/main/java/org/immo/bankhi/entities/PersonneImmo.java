package org.immo.bankhi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name="Proprietaire_Immo")
public class PersonneImmo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@SuppressWarnings("unused")
	private String nomPers;
	
	@SuppressWarnings("unused")
	private String prenomPers;
	
	@SuppressWarnings("unused")
	private String telPers;
	
	@OneToMany(targetEntity = Immobilisation.class, mappedBy = "personneImmo")
	private List<Immobilisation> immos = new ArrayList<>();
	
	@OneToMany(targetEntity = Adresse.class, mappedBy = "personneImmo")
	private List<Adresse> adressePers = new ArrayList<>();

}
