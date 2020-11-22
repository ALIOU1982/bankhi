package org.immo.bankhi.DAO;

import org.immo.bankhi.entities.Immobilisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ImmobilisationRepository extends JpaRepository<Immobilisation, Long> {

}
