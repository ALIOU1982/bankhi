package org.immo.bankhi.DAO;

import org.immo.bankhi.entities.LieuImmo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LieuImmoRepository  extends JpaRepository<LieuImmo, Long>{

}
