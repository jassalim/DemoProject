package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Tache;
@CrossOrigin("*")
@Repository
public interface TacheRepository extends CrudRepository< Tache, Long>{
	
	List<Tache> findByClient(String client);
	List<Tache> findByActivite(String activite);
	List<Tache> findByProjet(String projet);
	

}
