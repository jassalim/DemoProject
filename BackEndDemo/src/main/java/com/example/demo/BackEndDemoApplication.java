package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Repository.TacheRepository;
import com.example.demo.entities.Tache;

@SpringBootApplication
public class BackEndDemoApplication implements CommandLineRunner {
	@Autowired
	private TacheRepository tacheRepository;
	public static void main(String[] args) {
		SpringApplication.run(BackEndDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = dateFormat.parse("14/02/2019");
		Date d2 = dateFormat.parse("14/01/2019");
		Date d3 = dateFormat.parse("15/02/2019");
		Date d4 = dateFormat.parse("15/01/2019");
		Date d5 = d3;
		Date d6 = dateFormat.parse("28/12/2019");
		Date d7 = dateFormat.parse("08/02/2019");
		Date d8 = dateFormat.parse("08/01/2019");



		tacheRepository.save(new Tache (null,"PDS-01","Fr-T","ACR","ZCR",d1,15,d2,"Dév Phyton","Phyton",d2) );
		tacheRepository.save(new Tache (null,"ADK","CNP","MIS","ABS",d3,24,d4,"Incident Prod","Phyton",d4) );
		tacheRepository.save(new Tache (null,"MNP","AXA","ADV","ATR",d5,45,d6,"Mép Maj BD","MangoDB",d6) );
		tacheRepository.save(new Tache (null,"AOP-0315","Orange","BFD","FAB",d7,12,d8,"Test affiliation","Phyton",d8) );
		
		tacheRepository.findAll().forEach(t->{
			System.out.println(t.toString());
		});
	}

}
