package org.immo.bankhi;

import java.util.ArrayList;
import java.util.List;

import org.immo.bankhi.DAO.AdresseRepository;
import org.immo.bankhi.DAO.ImmobilisationRepository;
import org.immo.bankhi.DAO.LieuImmoRepository;
import org.immo.bankhi.DAO.NatureImmoRepositoty;
import org.immo.bankhi.DAO.PeronneImmoRepository;
import org.immo.bankhi.DAO.TypeImmoRepository;
import org.immo.bankhi.entities.Adresse;
import org.immo.bankhi.entities.Immobilisation;
import org.immo.bankhi.entities.LieuImmo;
import org.immo.bankhi.entities.NatureImmo;
import org.immo.bankhi.entities.PersonneImmo;
import org.immo.bankhi.entities.TypeImmo;
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
	NatureImmoRepositoty natureImmoRepositoty;
	
	@Autowired
	ImmobilisationRepository immobilisationRepository;
	
	@Autowired 
	PeronneImmoRepository peronneImmoRepository;

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
		ty.setDescription("Maison Desc 1");
		TypeImmo ti = new TypeImmo(null, "Maison2", "Maison Desc 2", null);
		typeImmoRepository.save(ty);
		typeImmoRepository.save(ti);
		
		LieuImmo l2 = new LieuImmo(null, "Loin de la nationale", "Coyah", "Kouria 2", null);
		LieuImmo l1 = new LieuImmo(null, "Près de la nationale", "Coyah", "Kouria 1", null);
		lieuImmoRepository.save(l1);
		lieuImmoRepository.save(l2);
		
		Immobilisation i1 = new Immobilisation(null, "Maison Soussou", "Fini", l2, n1, ty, null);
		Immobilisation i2 = new Immobilisation(null, "Maison Peul", "Non Fini ", l1, n2, ti, null);
		List<Immobilisation> lI1 = new ArrayList<>();
		lI1.add(i1);
		List<Immobilisation> lI2 = new ArrayList<>();
		lI2.add(i2);
		immobilisationRepository.save(i1);
		immobilisationRepository.save(i2);
		
		PersonneImmo p1 = new PersonneImmo(null, "BARRY", "Thierno Aliou", "622624569", "thiernaliou@gmail.com", lI1,  null);
		PersonneImmo p2 = new PersonneImmo(null, "BARRY", "Mamadou", "657624569", "barrythiernaliou@yahoo.fr", lI2,  null);
		peronneImmoRepository.save(p1);
		peronneImmoRepository.save(p2);
		
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
		
		Adresse a1 = new Adresse(null, "Coyah","Gomboyah", p1);
		Adresse a2 = new Adresse(null, "Coyah","Sanoyah", p2);
		adresseRepository.save(a1);
		adresseRepository.save(a2);		
		
		p1.setAdresse(a1);
		p2.setAdresse(a2);
		peronneImmoRepository.save(p1);
		peronneImmoRepository.save(p2);
		
		ti.setImmobilisations(listI1);
		ty.setImmobilisations(listI2);	
		
	}        

}
