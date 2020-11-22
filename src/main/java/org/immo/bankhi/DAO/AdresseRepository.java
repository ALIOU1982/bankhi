package org.immo.bankhi.DAO;

import org.immo.bankhi.entities.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AdresseRepository extends JpaRepository<Adresse, Long>{

}
