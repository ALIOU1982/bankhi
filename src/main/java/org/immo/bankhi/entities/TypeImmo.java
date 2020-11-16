package org.immo.bankhi.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
import lombok.Setter;
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
	
	@SuppressWarnings("unused")
	@Setter
	private String nomType;
	
	@SuppressWarnings("unused")
	@Setter
	private String description;
	
	@OneToOne(cascade = CascadeType.ALL ) 
	@JoinColumn( name="idImmobilisation" )
	private Immobilisation immoblisation;

}
