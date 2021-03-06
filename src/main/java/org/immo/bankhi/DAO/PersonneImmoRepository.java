package org.immo.bankhi.DAO;

import org.immo.bankhi.entities.PersonneImmo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonneImmoRepository extends JpaRepository<PersonneImmo, Long> {

}
