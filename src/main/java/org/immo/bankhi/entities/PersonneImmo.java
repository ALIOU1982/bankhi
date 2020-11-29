package org.immo.bankhi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

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
	
	@NonNull
	private String nomPers;
	
	private String prenomPers;
	
	@NonNull
	private String telephone;
	
	private String email;
	
	@NonNull
	private String motDePasse;
	
	@OneToMany(targetEntity = Immobilisation.class, mappedBy = "personneImmo")
	private List<Immobilisation> immos = new ArrayList<>();
	
	@OneToOne
	@JoinColumn(name="idTypeAdresse", nullable=true )
	private Adresse adresse;

}
