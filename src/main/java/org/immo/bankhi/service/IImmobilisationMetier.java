package org.immo.bankhi.service;

import java.util.List;

import org.immo.bankhi.entities.*;

public interface IImmobilisationMetier {
	
	public List<Immobilisation> immoParProprio(PersonneImmo pers);
	
	public List<Immobilisation> immoParNature(Long idNature);
	
	public List<Immobilisation> immoParType(Long idNature);
	
	public List<Immobilisation> immoParNatureType(Long idNature, Long idType);
	
	public List<Immobilisation> immoParNatureProprio(Long idNature, Long idPers);
	
	public List<Immobilisation> immoParTypeProprio(Long idType, Long idPers);
	
	public List<Immobilisation> immoParNatureTypeProprio(Long idPers, Long idNature, Long idType);	

	public Immobilisation immobilsationParId(Long idImmo);
	
	public List<NatureImmo> natureImmoParProprio(Long idPers);
	
	public List<NatureImmo> natureImmoParType(Long idType);
}
