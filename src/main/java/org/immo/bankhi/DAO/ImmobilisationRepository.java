package org.immo.bankhi.DAO;

import java.util.List;

import org.immo.bankhi.entities.Immobilisation;
import org.immo.bankhi.entities.PersonneImmo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ImmobilisationRepository extends JpaRepository<Immobilisation, Long> {
	
	@Query("Select immo from Immobilisation immo Where immo.personneImmo =?1")
	public List<Immobilisation> immoParProprio(PersonneImmo pers);

}
