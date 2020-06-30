package com.example.demo.Services;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Tache;

public interface TacheService {
	public void addTache(Tache tache);
	public Tache getTachesById( long id);
	public String getClientByTacheId(Long id);
	public String getActivityByTacheId(Long id);
	public String getProjectByTacheId(Long id);
	public void deleteTache(Long id) ;
	public List<Tache> findAll();

}
