package com.example.demo.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.TacheRepository;
import com.example.demo.Services.TacheService;
import com.example.demo.entities.Tache;
@CrossOrigin("*")	
@RestController
public class TacheController {
	@Autowired
	private TacheService tacheService;
	@Autowired
	private TacheRepository tacheRepo;
	@GetMapping(value="/TacheList")
	public List <Tache> listTaches(){
		return   tacheService.findAll();
	}
	@GetMapping(value="/TacheList/{id}")
	public Tache listTaches(@PathVariable("id") long id){
		return  tacheService.getTachesById(id);
				
	}
	@GetMapping(value="/GetByClient/{client}")
	public List<Tache> listTachesByClient(@PathVariable("client") String client){
		return  tacheRepo.findByClient(client);
	}
	
	@GetMapping(value="/GetByProject/{project}")
	public List<Tache> listTachesByProject(@PathVariable("project") String Project){
		return  tacheRepo.findByProjet(Project);
	}
	@GetMapping(value="/GetByActivite/{activite}")
	public List<Tache> listTachesByActivity(@PathVariable("activite") String activite){
		return  tacheRepo.findByActivite(activite);
	
	}

}
