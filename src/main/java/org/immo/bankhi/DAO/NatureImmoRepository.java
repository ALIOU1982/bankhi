package org.immo.bankhi.DAO;

import org.immo.bankhi.entities.NatureImmo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NatureImmoRepository extends JpaRepository<NatureImmo, Long>{	

}
