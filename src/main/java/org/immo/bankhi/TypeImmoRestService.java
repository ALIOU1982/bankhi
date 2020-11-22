package org.immo.bankhi;

import java.util.List;

import org.immo.bankhi.DAO.TypeImmoRepository;
import org.immo.bankhi.entities.TypeImmo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TypeImmoRestService {
	
	@Autowired
	TypeImmoRepository typeImmoRepository;
	
	@GetMapping(value="/listeTypes")
	public List<TypeImmo> listDesTypesImmo(){
		return typeImmoRepository.findAll();		
	}
	
	@GetMapping(value="/listeTypes/{id}")
	public TypeImmo listTypeImmo(@PathVariable(name="id") Long id){
		return typeImmoRepository.findById(id).get();		
	}
	
	@PutMapping(value="/MisAjourTypes/{id}")
	public TypeImmo updateTypeImmo(@PathVariable(name="id") Long id, @RequestBody TypeImmo typeImmo){
		return typeImmoRepository.findById(id).get();		
	}
}
