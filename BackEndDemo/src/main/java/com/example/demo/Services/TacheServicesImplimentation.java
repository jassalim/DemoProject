package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Repository.TacheRepository;
import com.example.demo.entities.Tache;

@Service
public class TacheServicesImplimentation implements TacheService {
	@Autowired
	TacheRepository tacheRepo;

	@Override
	public void addTache(Tache tache) {
		tacheRepo.save(tache);
	}
	public Tache getTachesById(@PathVariable("id") long id){
		return  tacheRepo.findById(id).get();
				
	}
	@Override
	public String getClientByTacheId(Long TacheId) {
		return tacheRepo.findById(TacheId).get().getClient();
	}
	@Override
	public List<Tache> findAll() {
		return (List<Tache>) tacheRepo.findAll();
	}
	@Override
	public String getActivityByTacheId(Long TacheId) {
		return tacheRepo.findById(TacheId).get().getActivite();
	}
	@Override
	public String getProjectByTacheId(Long TacheId) {
		return tacheRepo.findById(TacheId).get().getProjet();
	}

	@Override
	public void deleteTache(Long TacheId) {
		Optional<Tache> optTache=tacheRepo.findById(TacheId);
		tacheRepo.delete(optTache.get());
	}

	
}

