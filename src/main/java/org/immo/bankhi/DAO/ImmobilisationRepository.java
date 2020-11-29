package org.immo.bankhi.DAO;

import java.util.List;

import org.immo.bankhi.entities.Immobilisation;
import org.immo.bankhi.entities.NatureImmo;
import org.immo.bankhi.entities.PersonneImmo;
import org.immo.bankhi.entities.TypeImmo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ImmobilisationRepository extends JpaRepository<Immobilisation, Long> {
	
	@Query("Select immo from Immobilisation immo Where immo.personneImmo =?1")
	public List<Immobilisation> immoParProprio(PersonneImmo pers);
	
	@Query("Select immo from Immobilisation immo Where immo.natureImmo =?1")
	public List<Immobilisation> immoParNature(NatureImmo natureImmo);
	

	@Query("Select immo from Immobilisation immo Where immo.typeImmo =?1")
	public List<Immobilisation> immoParType(TypeImmo typeImmo);
	
	@Query("Select immo from Immobilisation immo Where immo.natureImmo =?1 and immo.typeImmo =?2")
	public List<Immobilisation> immoParNatureType(NatureImmo natImmo, TypeImmo typeImmo);
	
	@Query("Select immo from Immobilisation immo Where immo.natureImmo =?1 and immo.personneImmo =?2")
	public List<Immobilisation> immoParNatureProprio(NatureImmo natImmo, PersonneImmo personneImmo);
	
	@Query("Select immo from Immobilisation immo Where immo.typeImmo =?1 and immo.personneImmo =?2")
	public List<Immobilisation> immoParTypeProprio(TypeImmo typeImmo, PersonneImmo personneImmo);
	
	@Query("Select immo from Immobilisation immo Where  immo.personneImmo =?1 and immo.natureImmo =?2 and immo.typeImmo =?3")
	public List<Immobilisation> immoParNatureTypeProprio( PersonneImmo personneImmo, NatureImmo natureImmo, TypeImmo typeImmo);

}
