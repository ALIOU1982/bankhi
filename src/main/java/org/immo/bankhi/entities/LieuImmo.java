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
@Table(name="Lieu_Immo")
public class LieuImmo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;	

	private String nomVille;
	
	private String quartier;
    
    @OneToMany(targetEntity=Immobilisation.class, mappedBy="lieuImmo")
	private List<Immobilisation> immos =  new ArrayList<Immobilisation>();
}
