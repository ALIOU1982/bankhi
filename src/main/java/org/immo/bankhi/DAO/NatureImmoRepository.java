package org.immo.bankhi.DAO;

import java.util.List;

import org.immo.bankhi.entities.NatureImmo;
import org.immo.bankhi.entities.PersonneImmo;
import org.immo.bankhi.entities.TypeImmo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NatureImmoRepository extends JpaRepository<NatureImmo, Long>{	
	
	@Query("Select immo.natureImmo from Immobilisation immo Where  immo.personneImmo =?1")
	public List<NatureImmo> natureImmoParProprio(PersonneImmo pers);
	
	@Query("Select immo.natureImmo from Immobilisation immo Where  immo.typeImmo =?1")
	public List<NatureImmo> natureImmoParType(TypeImmo typeImmo);

}
