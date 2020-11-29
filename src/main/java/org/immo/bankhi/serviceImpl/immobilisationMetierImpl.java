package org.immo.bankhi.serviceImpl;

import java.util.List;

import org.immo.bankhi.DAO.ImmobilisationRepository;
import org.immo.bankhi.DAO.NatureImmoRepository;
import org.immo.bankhi.DAO.PersonneImmoRepository;
import org.immo.bankhi.DAO.TypeImmoRepository;
import org.immo.bankhi.entities.Immobilisation;
import org.immo.bankhi.entities.NatureImmo;
import org.immo.bankhi.entities.PersonneImmo;
import org.immo.bankhi.entities.TypeImmo;
import org.immo.bankhi.service.IImmobilisationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ImmobilisationMetierImpl implements IImmobilisationMetier{

	@Autowired
	private ImmobilisationRepository immobilisationRepository;
	
	@Autowired
	private PersonneImmoRepository personneImmoRepository;
	
	@Autowired
	private NatureImmoRepository natureImmoRepositoty;
	
	@Autowired
	private TypeImmoRepository typeImmoRepository;
	
	@Override
	public List<Immobilisation> immoParProprio(Long idPers) {
		PersonneImmo pers = personneImmoRepository.getOne(idPers);
		return immobilisationRepository.immoParProprio(pers);
	}

	@Override
	public List<Immobilisation> immoParNature(Long idNature) {
		NatureImmo natImmo = natureImmoRepositoty.getOne(idNature);
		return immobilisationRepository.immoParNature(natImmo);
	}

	@Override
	public List<Immobilisation> immoParType(Long idType) {
		TypeImmo typeImmo = typeImmoRepository.getOne(idType);
		return immobilisationRepository.immoParType(typeImmo);
	}

	@Override
	public List<Immobilisation> immoParNatureType(Long idNature, Long idType) {
		NatureImmo natIm = natureImmoRepositoty.getOne(idNature);
		TypeImmo typeIm = typeImmoRepository.getOne(idType);
		return immobilisationRepository.immoParNatureType(natIm, typeIm);
	}

	@Override
	public List<Immobilisation> immoParNatureProprio(Long idNature, Long idPers) {
		NatureImmo natImmo = natureImmoRepositoty.getOne(idNature);
		PersonneImmo persI = personneImmoRepository.getOne(idPers);
		return immobilisationRepository.immoParNatureProprio(natImmo, persI);
	}

	@Override
	public List<Immobilisation> immoParTypeProprio(Long idType, Long idPers) {
		TypeImmo tImmo = typeImmoRepository.getOne(idType);
		PersonneImmo pImmo = personneImmoRepository.getOne(idPers);
		return immobilisationRepository.immoParTypeProprio(tImmo, pImmo);
	}

	@Override
	public List<Immobilisation> immoParNatureTypeProprio(Long idPers, Long idNature, Long idType) {
		PersonneImmo persI = personneImmoRepository.getOne(idPers);
		NatureImmo natImmo = natureImmoRepositoty.getOne(idNature);
		TypeImmo tyImmo = typeImmoRepository.getOne(idType);
		return immobilisationRepository.immoParNatureTypeProprio(persI, natImmo, tyImmo);
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
