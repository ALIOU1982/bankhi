package org.immo.bankhi.DAO;

import org.immo.bankhi.entities.TypeImmo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TypeImmoRepository extends JpaRepository<TypeImmo, Long>{

}
