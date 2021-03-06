package org.immo.bankhi;

import java.util.ArrayList;
import java.util.List;

import org.immo.bankhi.DAO.AdresseRepository;
import org.immo.bankhi.DAO.ImmobilisationRepository;
import org.immo.bankhi.DAO.LieuImmoRepository;
import org.immo.bankhi.DAO.NatureImmoRepository;
import org.immo.bankhi.DAO.PersonneImmoRepository;
import org.immo.bankhi.DAO.TypeImmoRepository;
import org.immo.bankhi.entities.Adresse;
import org.immo.bankhi.entities.Immobilisation;
import org.immo.bankhi.entities.LieuImmo;
import org.immo.bankhi.entities.NatureImmo;
import org.immo.bankhi.entities.PersonneImmo;
import org.immo.bankhi.entities.TypeImmo;
import org.immo.bankhi.service.IImmobilisationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankhiApplication implements CommandLineRunner{
	
	@Autowired
	TypeImmoRepository typeImmoRepository;
	
	@Autowired
	AdresseRepository adresseRepository;
	
	@Autowired
	LieuImmoRepository lieuImmoRepository;
	
	@Autowired
	NatureImmoRepository natureImmoRepositoty;
	
	@Autowired
	ImmobilisationRepository immobilisationRepository;
	
	@Autowired 
	PersonneImmoRepository personneImmoRepository;
	
	@Autowired
	private IImmobilisationMetier iImmobilisationMetier;

	public static void main(String[] args)  {
		SpringApplication.run(BankhiApplication.class, args);
	}
	
	public void run(String... args) throws Exception{		
				
		NatureImmo n1 = new NatureImmo(null, "Location", "Appartement", null);
		NatureImmo n2 = new NatureImmo(null, "Vente", "Terrain", null);
		natureImmoRepositoty.save(n1);
		natureImmoRepositoty.save(n2);
		
		TypeImmo ty = new TypeImmo();		
		ty.setNomType("Maison");
		ty.setDescription("Maison Description 1");
		TypeImmo ti = new TypeImmo(null, "Maison 2", "Maison Description 2", null);
		typeImmoRepository.save(ty);
		typeImmoRepository.save(ti);
		
		LieuImmo l2 = new LieuImmo(null, "Loin de la nationale", "Coyah", "Kouria 2", null);
		LieuImmo l1 = new LieuImmo(null, "Près de la nationale", "Coyah", "Kouria 1", null);
		lieuImmoRepository.save(l1);
		lieuImmoRepository.save(l2);
		
		Immobilisation i1 = new Immobilisation(null, "Maison Soussou", "Fini", l2, n1, ty, null, null);
		Immobilisation i2 = new Immobilisation(null, "Maison Peul", "Non Fini ", l1, n2, ti, null, null);
		List<Immobilisation> lI1 = new ArrayList<>();
		lI1.add(i1);
		List<Immobilisation> lI2 = new ArrayList<>();
		lI2.add(i2);
		immobilisationRepository.save(i1);
		immobilisationRepository.save(i2);
		
		PersonneImmo p1 = new PersonneImmo(null, "BARRY", "Thierno Aliou", "622624569", "thiernaliou@gmail.com", "Badara82?", lI1,  null);
		PersonneImmo p2 = new PersonneImmo(null, "BARRY", "Mamadou", "657624569", "barrythiernaliou@yahoo.fr", "Badara82!", lI2,  null);
		personneImmoRepository.save(p1);
		personneImmoRepository.save(p2);
		
		//Mise à jour de certains champs des tables
		i1.setPersonneImmo(p1);
		i2.setPersonneImmo(p2);
		immobilisationRepository.save(i1);
		immobilisationRepository.save(i2);
		
		List<Immobilisation> listI1 = new ArrayList<>();
		List<Immobilisation> listI2 = new ArrayList<>();
		listI1.add(i1);
		listI2.add(i2);
		l1.setImmos(listI1);
		l2.setImmos(listI2);
		lieuImmoRepository.save(l1);
		lieuImmoRepository.save(l2);
		
		Adresse a1 = new Adresse(null, "Coyah","Gomboyah", 0, new String(), new String(), p1);
		Adresse a2 = new Adresse(null, "Coyah","Sanoyah",  0, new String(), new String(), p2);
		adresseRepository.save(a1);
		adresseRepository.save(a2);		
		
		p1.setAdresse(a1);
		p2.setAdresse(a2);
		personneImmoRepository.save(p1);
		personneImmoRepository.save(p2);
		
		ti.setImmobilisations(listI1);
		ty.setImmobilisations(listI2);	
		
		System.out.println("Test d'effectivité "+iImmobilisationMetier.immoParProprio(p2.getId()).get(0).getNomImmo());
		
	}        
}
