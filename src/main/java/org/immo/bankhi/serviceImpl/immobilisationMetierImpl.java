package org.immo.bankhi.serviceImpl;

import java.util.List;

import org.immo.bankhi.DAO.ImmobilisationRepository;
import org.immo.bankhi.entities.Immobilisation;
import org.immo.bankhi.entities.NatureImmo;
import org.immo.bankhi.entities.PersonneImmo;
import org.immo.bankhi.service.IImmobilisationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class immobilisationMetierImpl implements IImmobilisationMetier{

	@Autowired
	private ImmobilisationRepository immobilisationRepository;
	
	@Override
	public List<Immobilisation> immoParProprio(PersonneImmo pers) {
		
		return immobilisationRepository.immoParProprio(pers);
	}

	@Override
	public List<Immobilisation> immoParNature(Long idNature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Immobilisation> immoParType(Long idNature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Immobilisation> immoParNatureType(Long idNature, Long idType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Immobilisation> immoParNatureProprio(Long idNature, Long idPers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Immobilisation> immoParTypeProprio(Long idType, Long idPers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Immobilisation> immoParNatureTypeProprio(Long idPers, Long idNature, Long idType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Immobilisation immobilsationParId(Long idImmo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NatureImmo> natureImmoParProprio(Long idPers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NatureImmo> natureImmoParType(Long idType) {
		// TODO Auto-generated method stub
		return null;
	}

}
