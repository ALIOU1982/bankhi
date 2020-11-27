package org.immo.bankhi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
	
	private String nomImmo;
	
	private String descriptionImmo;
	
	@ManyToOne
	@JoinColumn( name="idLieuImmo", nullable=true)
	private LieuImmo lieuImmo;
		 
	@ManyToOne
	@JoinColumn(name="idNatureImmo", nullable=false)
	private NatureImmo natureImmo;
	
	@ManyToOne
	@JoinColumn(name="idTypeImmo", nullable=false)
	private TypeImmo typeImmo;
	
	@Lob
	private List<Blob> listeImages = new ArrayList<Blob>();
	
	@ManyToOne
	@JoinColumn(name="idPersonneImmo", nullable=true)
	private PersonneImmo personneImmo;

}
