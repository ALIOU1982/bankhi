package org.immo.bankhi;

import org.immo.bankhi.DAO.TypeImmoRepository;
import org.immo.bankhi.entities.TypeImmo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankhiApplication implements CommandLineRunner{
	
	@Autowired
	TypeImmoRepository typeImmoRepository;

	public static void main(String[] args)  {
		SpringApplication.run(BankhiApplication.class, args);
	}
	
	public void run(String... args) throws Exception{		
		TypeImmo ty = new TypeImmo();		
		ty.setNomType("Maison");
		ty.setDescription("Maison Desc 1");
		typeImmoRepository.save(ty);
	}        

}
