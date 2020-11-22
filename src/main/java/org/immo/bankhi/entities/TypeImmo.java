package org.immo.bankhi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
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
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor 
@ToString
@Table(name="Type_Immo")
@Accessors(chain=true)
public class TypeImmo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_TYPE_IMMO")
	private Long id;
	
	private String nomType;
	
	private String description;
	
	@OneToMany(targetEntity=Immobilisation.class, mappedBy="typeImmo" )
	private List<Immobilisation> immobilisations =  new ArrayList<Immobilisation>();
}
